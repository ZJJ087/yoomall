package com.zjj.product.service;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.CategoryEntity;
import com.zjj.product.vo.CategoryVo;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:16
 * @description
 */
public interface CategoryService {
    /**
     * 从pms_category表中查出所有分类
     * @return
     */
    ServerResponse<List<CategoryVo>> listWithTree();

    ServerResponse<List<CategoryEntity>> queryAll();

    ServerResponse insertCategory(CategoryEntity params);

    ServerResponse updateCategory(CategoryEntity params);

    void deleteCategory(Long id);
}
