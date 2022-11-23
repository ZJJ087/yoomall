package com.zjj.product.mapper;

import com.zjj.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentReplayEntityMapper {
    int insert(CommentReplayEntity record);

    int insertSelective(CommentReplayEntity record);
}