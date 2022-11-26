package com.zjj.product.controller;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.mymallcommon.utils.PageUtils;
import com.zjj.product.entity.BrandEntity;
import com.zjj.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:12
 * @description
 */
@RestController
@RequestMapping("/brand")
@CrossOrigin
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/list/{pageNum}/{pageSize}")
    public ServerResponse<PageUtils> list(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
        return brandService.listBrand(pageNum,pageSize);
    }

    @PostMapping("/insert")
    public ServerResponse insertBrand(@Valid @RequestBody BrandEntity params){
        return brandService.insertBrand(params);
    }

    @PostMapping("/update")
    public ServerResponse updateBrand(@Valid @RequestBody BrandEntity params){
        return brandService.updateBrand(params);
    }

    @PostMapping("/delete/{brandId}")
    public ServerResponse deleteBrand(@PathVariable("brandId") Long brandId){
        return brandService.deleteBrand(brandId);
    }
}
