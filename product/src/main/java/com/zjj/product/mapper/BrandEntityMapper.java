package com.zjj.product.mapper;

import com.zjj.product.entity.BrandEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BrandEntityMapper {
    @Select("select brand_id,name,logo,descript,show_status,sort from pms_brand")
    List<BrandEntity> list();

    @Select("select * from pms_brand where brand_id=#{brandId}")
    BrandEntity findBrandByBrandId(Long brandId);

    @Select("select * from pms_brand where name=#{name}")
    BrandEntity findBrandByName(String name);

    @Options(useGeneratedKeys = true,keyProperty = "brandId")
    @Insert("insert into pms_brand(name,logo,descript,show_status,first_letter,sort) " +
            "values(#{name},#{logo},#{descript},#{showStatus},#{firstLetter},#{sort})")
    int insert(BrandEntity record);

    int update(BrandEntity record);

    @Delete("delete from pms_brand where brand_id=#{brandId}")
    int delete(Long brandId);
    int insertSelective(BrandEntity record);
}