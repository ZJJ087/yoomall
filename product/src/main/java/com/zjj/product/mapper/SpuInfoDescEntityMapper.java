package com.zjj.product.mapper;

import com.zjj.product.entity.SpuInfoDescEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpuInfoDescEntityMapper {
    int insert(SpuInfoDescEntity record);

    int insertSelective(SpuInfoDescEntity record);
}