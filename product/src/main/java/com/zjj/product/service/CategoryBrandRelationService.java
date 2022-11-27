package com.zjj.product.service;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.CategoryBrandRelationEntity;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:15
 * @description
 */
public interface CategoryBrandRelationService {
    ServerResponse saveRelation(CategoryBrandRelationEntity params);
}
