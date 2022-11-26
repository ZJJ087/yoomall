package com.zjj.product.service;

import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.mymallcommon.utils.PageUtils;
import com.zjj.product.entity.AttrGroupEntity;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:11
 * @description
 */
public interface AttrGroupService {
    ServerResponse<List<AttrGroupEntity>> queryAttrGroup(Long categoryId);

    ServerResponse<PageUtils> queryPage(Integer pageNum, Integer pageSize);
}
