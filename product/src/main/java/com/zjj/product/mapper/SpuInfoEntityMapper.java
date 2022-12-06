package com.zjj.product.mapper;

import com.zjj.product.entity.SpuInfoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SpuInfoEntityMapper {
    int insert(SpuInfoEntity record);

    int insertSelective(SpuInfoEntity record);

    @Select("select count(0) from pms_spu_info where catelog_id=#{id}")
    int countByCatelogId(Long id);
}