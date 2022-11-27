package com.zjj.product.mapper;

import com.zjj.product.entity.CategoryBrandRelationEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface CategoryBrandRelationEntityMapper {
    @Insert("insert into pms_category_brand_relation(brand_id,catelog_id,brand_name,catelog_name) "+
            "values(brandId,catelogId,brandName,catelogName)")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int save(CategoryBrandRelationEntity params);

    int insert(CategoryBrandRelationEntity record);

    int insertSelective(CategoryBrandRelationEntity record);
}