package com.zjj.product.mapper;

import com.zjj.product.entity.AttrAttrgroupRelationEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttrAttrgroupRelationEntityMapper {
    int insert(AttrAttrgroupRelationEntity record);

    int insertSelective(AttrAttrgroupRelationEntity record);
}