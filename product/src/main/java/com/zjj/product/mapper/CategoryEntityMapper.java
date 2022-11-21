package com.zjj.product.mapper;

import com.zjj.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/10/22 19:32
 * @description
 */
@Mapper
public interface CategoryEntityMapper {
    /*查出所有分类*/
    public List<CategoryEntity> findAll();
}
