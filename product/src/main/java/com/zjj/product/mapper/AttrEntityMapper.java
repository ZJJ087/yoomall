package com.zjj.product.mapper;

import com.zjj.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttrEntityMapper {
    int insert(AttrEntity record);

    int insertSelective(AttrEntity record);
}