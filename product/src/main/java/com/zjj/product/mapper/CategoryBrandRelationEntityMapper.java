package com.zjj.product.mapper;

import com.zjj.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CategoryBrandRelationEntityMapper {
    @Insert("insert into pms_category_brand_relation(brand_id,catelog_id,brand_name,catelog_name) "+
            "values(brandId,catelogId,brandName,catelogName)")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int save(CategoryBrandRelationEntity params);

    int insert(CategoryBrandRelationEntity record);

    int insertSelective(CategoryBrandRelationEntity record);

    @Select("select count(0) from pms_category_brand_relation where catelog_id=#{id}")
    int countByCatelogId(Long id);
}