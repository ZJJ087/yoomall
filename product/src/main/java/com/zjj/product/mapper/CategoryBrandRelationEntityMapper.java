package com.zjj.product.mapper;

import com.zjj.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryBrandRelationEntityMapper {
    int insert(CategoryBrandRelationEntity record);

    int insertSelective(CategoryBrandRelationEntity record);
}