package com.zjj.product.mapper;

import com.zjj.product.entity.CategoryEntity;
import com.zjj.product.vo.CategoryVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryEntityMapper {
    /**
     *
     * @return pms_category中所有记录
     */
    @Select("select cat_id,name,parent_cid,cat_level,show_status,sort from pms_category")
    List<CategoryVo> findAll();

    @Select("select * from pms_category")
    List<CategoryEntity> findEntity();

    @Options(useGeneratedKeys = true,keyProperty = "catId")
    @Insert("insert into pms_category(name,parent_cid,cat_level,show_status,sort,icon,product_unit,product_count)" +
            "values(#{name},#{parentCid},#{catLevel},#{showStatus},#{sort},#{icon},#{productUnit},#{productCount})")
    int insert(CategoryEntity record);

    @Select("select * from pms_category where name=#{name}")
    CategoryEntity findCategoryByName(String name);

    int update(CategoryEntity params);

    int insertSelective(CategoryEntity record);
}