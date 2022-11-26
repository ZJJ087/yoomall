package com.zjj.product.service;

import com.github.pagehelper.Page;
import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.mymallcommon.utils.PageUtils;
import com.zjj.product.entity.BrandEntity;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:12
 * @description
 */
public interface BrandService {

    ServerResponse insertBrand(BrandEntity params);

    ServerResponse deleteBrand(Long id);

    ServerResponse updateBrand(BrandEntity params);

    ServerResponse<PageUtils> listBrand(Integer pageNum,Integer pageSize);
}
