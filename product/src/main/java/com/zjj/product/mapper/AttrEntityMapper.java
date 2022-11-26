package com.zjj.product.mapper;

import com.zjj.product.entity.AttrEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AttrEntityMapper {
    @Select("select * from pms_attr where attr_id=#{attrId}")
    AttrEntity findAttrByAttrId(Long AttrId);

    int insert(AttrEntity record);

    int insertSelective(AttrEntity record);
}