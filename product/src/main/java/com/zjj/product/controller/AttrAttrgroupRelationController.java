package com.zjj.product.controller;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.AttrAttrgroupRelationEntity;
import com.zjj.product.service.AttrAttrgroupRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:07
 * @description
 */
@RestController
@RequestMapping("/attrAttrgroupRelation")
@CrossOrigin
public class AttrAttrgroupRelationController {
    @Autowired
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    @PostMapping("/save")
    private ServerResponse savaRelation(@RequestBody AttrAttrgroupRelationEntity params){
       return attrAttrgroupRelationService.saveAttrAttrgroupRelation(params);
    }
}
