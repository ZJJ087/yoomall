package com.zjj.product.mapper;

import com.zjj.product.entity.BrandEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BrandEntityMapper {
    int insert(BrandEntity record);

    int insertSelective(BrandEntity record);
}