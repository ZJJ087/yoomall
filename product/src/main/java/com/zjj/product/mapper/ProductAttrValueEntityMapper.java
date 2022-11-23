package com.zjj.product.mapper;

import com.zjj.product.entity.ProductAttrValueEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductAttrValueEntityMapper {
    int insert(ProductAttrValueEntity record);

    int insertSelective(ProductAttrValueEntity record);
}