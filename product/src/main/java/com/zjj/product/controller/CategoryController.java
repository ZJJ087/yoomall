package com.zjj.product.controller;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.CategoryEntity;
import com.zjj.product.service.CategoryService;
import com.zjj.product.vo.CategoryVo;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
