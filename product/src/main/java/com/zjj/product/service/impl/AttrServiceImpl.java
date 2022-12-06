package com.zjj.product.service.impl;

import com.zjj.product.entity.AttrEntity;
import com.zjj.product.mapper.AttrEntityMapper;
import com.zjj.product.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:03
 * @description
 */
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    private AttrEntityMapper attrEntityMapper;
    @Override
    public Integer countByCategoryId(Long id) {
        return attrEntityMapper.countByCatelogId(id);
    }

    @Override
    public int updateAttr(List<AttrEntity> params) {
        for(AttrEntity attr: params){
            attrEntityMapper.update(attr);
        }
        return 1;
    }
}
