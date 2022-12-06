package com.zjj.product.service.impl;

import com.zjj.product.mapper.SpuInfoEntityMapper;
import com.zjj.product.service.SpuInfoDescService;
import com.zjj.product.service.SpuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangjiajun
 * @date 2022/11/25 10:58
 * @description
 */
@Service
public class SpuInfoServiceImpl implements SpuInfoService {
    @Autowired
    private SpuInfoEntityMapper spuInfoEntityMapper;

    @Override
    public Integer countByCategoryId(Long id){
        return spuInfoEntityMapper.countByCatelogId(id);
    }
}
