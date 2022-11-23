package com.zjj.product.mapper;

import com.zjj.product.entity.SpuImagesEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpuImagesEntityMapper {
    int insert(SpuImagesEntity record);

    int insertSelective(SpuImagesEntity record);
}