package com.zjj.product.mapper;

import com.zjj.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryEntityMapper {
    int insert(CategoryEntity record);

    int insertSelective(CategoryEntity record);
}