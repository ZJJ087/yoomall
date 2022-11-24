package com.zjj.product.vo;

import lombok.Data;
import lombok.Getter;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/24 20:03
 * @description 三级分类
 */
@Data
public class CategoryVo {
    private Long catId;
    private Long parentCid;
    private String name;
    private Integer catLevel;
    private Integer showStatus;
    private Integer sort;
    private List<CategoryVo> children;
}
