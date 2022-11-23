package com.zjj.product.mapper;

import com.zjj.product.entity.SkuSaleAttrValueEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SkuSaleAttrValueEntityMapper {
    int insert(SkuSaleAttrValueEntity record);

    int insertSelective(SkuSaleAttrValueEntity record);
}