package com.zjj.product.mapper;

import com.zjj.product.entity.UndoLogEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UndoLogEntityMapper {
    int insert(UndoLogEntity record);

    int insertSelective(UndoLogEntity record);
}