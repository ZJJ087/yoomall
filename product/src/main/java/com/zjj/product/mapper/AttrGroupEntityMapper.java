package com.zjj.product.mapper;

import com.zjj.product.entity.AttrGroupEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AttrGroupEntityMapper {
    List<AttrGroupEntity> findAll();

    @Select("select attr_group_id, attr_group_name from pms_attr_group where catelog_id=#{categoryId}")
    List<AttrGroupEntity> findAttrGroupByCategoryId(Long categoryId);

    @Select("select * from pms_attr_group where attr_group_id=#{attrGroupId}")
    AttrGroupEntity findAttrgroupByAttrGroupId(Long attrGroupId);

    int insert(AttrGroupEntity record);

    int insertSelective(AttrGroupEntity record);
}