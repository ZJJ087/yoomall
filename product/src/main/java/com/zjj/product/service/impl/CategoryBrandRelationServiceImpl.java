package com.zjj.product.service.impl;

import com.zjj.mymallcommon.response.CodeEnum;
import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.CategoryBrandRelationEntity;
import com.zjj.product.mapper.CategoryBrandRelationEntityMapper;
import com.zjj.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:15
 * @description
 */
@Service
public class CategoryBrandRelationServiceImpl implements CategoryBrandRelationService {
    @Autowired
    private CategoryBrandRelationEntityMapper categoryBrandRelationEntityMapper;
    @Override
    public ServerResponse saveRelation(CategoryBrandRelationEntity params) {
        categoryBrandRelationEntityMapper.save(params);
        return new ServerResponse(CodeEnum.REQUEST_SUCCESS.getCode(), CodeEnum.REQUEST_SUCCESS.getMessage());
    }

    @Override
    public Integer countByCategoryId(Long id) {
        int count = categoryBrandRelationEntityMapper.countByCatelogId(id);
        return count;
    }
}
