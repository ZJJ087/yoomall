package com.zjj.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:07
 * @description
 */
//刷新配置中心配置
@RefreshScope
@RestController
@RequestMapping("/attrAttrgroupRelation")
@CrossOrigin
public class AttrAttrgroupRelationController {

}
