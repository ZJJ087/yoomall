package com.zjj.product.mapper;

import com.zjj.product.entity.SpuInfoEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpuInfoEntityMapper {
    int insert(SpuInfoEntity record);

    int insertSelective(SpuInfoEntity record);
}