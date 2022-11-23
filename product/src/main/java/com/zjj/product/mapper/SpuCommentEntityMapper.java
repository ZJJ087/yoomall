package com.zjj.product.mapper;

import com.zjj.product.entity.SpuCommentEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpuCommentEntityMapper {
    int insert(SpuCommentEntity record);

    int insertSelective(SpuCommentEntity record);
}