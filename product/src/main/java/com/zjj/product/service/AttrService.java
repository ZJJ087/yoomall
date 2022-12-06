package com.zjj.product.service;

import com.zjj.product.entity.AttrEntity;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:02
 * @description
 */
public interface AttrService {
    Integer countByCategoryId(Long id);

    int updateAttr(List<AttrEntity> params);
}
