package com.zjj.product.controller;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.CategoryEntity;
import com.zjj.product.service.AttrService;
import com.zjj.product.service.CategoryBrandRelationService;
import com.zjj.product.service.CategoryService;
import com.zjj.product.service.SpuInfoService;
import com.zjj.product.vo.CategoryVo;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static com.zjj.mymallcommon.response.CodeEnum.*;
import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:16
 * @description
 */
@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AttrService attrService;

    @Autowired
    private SpuInfoService spuInfoService;

    @Autowired
    private CategoryBrandRelationService categoryBrandRelationService;
    /**
     *
     * @return 获取商城的全分类，并组装成三级分类形式返回
     */
    @GetMapping("/list/tree")
    public ServerResponse<List<CategoryVo>> getCategoryAsTree(){
        return categoryService.listWithTree();
    }

    /**
     *
     * @return 返回pms_category中的全部记录
     */
    @GetMapping("/list")
    public ServerResponse<List<CategoryEntity>> list(){
        return categoryService.queryAll();
    }

    @PostMapping("/insert")
    public ServerResponse insertEntity(@RequestBody CategoryEntity params){
        return categoryService.insertCategory(params);
    }

    @PostMapping("/update")
    public ServerResponse updateEntity(@RequestBody CategoryEntity params){
        return categoryService.updateCategory(params);
    }

    @GetMapping("/deleteOption/{id}")
    public ServerResponse queryLegalDelete(@PathVariable("id") Long id){
        Integer countAttr = attrService.countByCategoryId(id);
        Integer countRelation = categoryBrandRelationService.countByCategoryId(id);
        Integer countSpuInfo = spuInfoService.countByCategoryId(id);
        if(countAttr == 0 && countRelation == 0 && countSpuInfo == 0){
            categoryService.deleteCategory(id);
            return new ServerResponse(SUCCESS_DELETE_CATEGORY.getCode(), SUCCESS_DELETE_CATEGORY.getMessage());
        }
        return new ServerResponse(ILLEGAL_DELETE_CATEGORY.getCode(), ILLEGAL_DELETE_CATEGORY.getMessage());
    }

}
