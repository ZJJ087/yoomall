package com.zjj.product.mapper;

import com.zjj.product.entity.SkuImagesEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SkuImagesEntityMapper {
    int insert(SkuImagesEntity record);

    int insertSelective(SkuImagesEntity record);
}