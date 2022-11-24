package com.zjj.product.mapper;

import com.zjj.product.entity.CategoryEntity;
import com.zjj.product.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryEntityMapper {
    /**
     *
     * @return pms_category中所有记录
     */
    @Select("select cat_id,name,parent_id,cat_level,show_status,sort from pms_category")
    List<CategoryVo> findAll();

    int insert(CategoryEntity record);
    int insertSelective(CategoryEntity record);
}