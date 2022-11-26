package com.zjj.product.mapper;

import com.zjj.product.entity.AttrAttrgroupRelationEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface AttrAttrgroupRelationEntityMapper {
    @Insert("insert into pms_attr_attrgroup_relation(attr_id,attr_group_id) " +
            "values(#{attrId},#{attrGroupId})")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int save(AttrAttrgroupRelationEntity record);

    int insert(AttrAttrgroupRelationEntity record);

    int insertSelective(AttrAttrgroupRelationEntity record);
}