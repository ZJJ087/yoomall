package com.zjj.product.mapper;

import com.zjj.product.entity.SkuInfoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SkuInfoEntityMapper {
    int insert(SkuInfoEntity record);

    int insertSelective(SkuInfoEntity record);
}