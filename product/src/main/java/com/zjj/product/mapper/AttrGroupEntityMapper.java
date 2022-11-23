package com.zjj.product.mapper;

import com.zjj.product.entity.AttrGroupEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttrGroupEntityMapper {
    int insert(AttrGroupEntity record);

    int insertSelective(AttrGroupEntity record);
}