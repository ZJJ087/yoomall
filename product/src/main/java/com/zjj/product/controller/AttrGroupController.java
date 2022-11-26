package com.zjj.product.controller;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.mymallcommon.utils.PageUtils;
import com.zjj.product.entity.AttrGroupEntity;
import com.zjj.product.service.AttrGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:10
 * @description
 */
@RestController
@RequestMapping("/attrGroup")
@CrossOrigin
public class AttrGroupController {
    @Autowired
    private AttrGroupService attrGroupService;

    @GetMapping("/list/{pageNum}/{pageSize}")
    public ServerResponse<PageUtils> list(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
        return attrGroupService.queryPage(pageNum,pageSize);
    }
    /**
     *
     * @param categoryId 三级分类id
     * @return 该分类下的属性组
     */
    @GetMapping("/list/{categoryId}")
    public ServerResponse<List<AttrGroupEntity>> listAttrGroupByCategoryId(@PathVariable("categoryId") Long categoryId){
        return attrGroupService.queryAttrGroup(categoryId);
    }
}
