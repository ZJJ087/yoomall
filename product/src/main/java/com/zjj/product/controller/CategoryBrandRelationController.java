package com.zjj.product.controller;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.CategoryBrandRelationEntity;
import com.zjj.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:14
 * @description
 */
@RestController
@RequestMapping("/categoryBrandRelation")
@CrossOrigin
public class CategoryBrandRelationController {
    @Autowired
    private CategoryBrandRelationService categoryBrandRelationService;

    @PostMapping("/save")
    public ServerResponse save(@RequestBody CategoryBrandRelationEntity params){
        return categoryBrandRelationService.saveRelation(params);
    }
}
