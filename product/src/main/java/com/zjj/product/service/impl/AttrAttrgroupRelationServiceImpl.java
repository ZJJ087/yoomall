package com.zjj.product.service.impl;

import com.zjj.mymallcommon.response.BizCodeEnume;
import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.AttrAttrgroupRelationEntity;
import com.zjj.product.entity.AttrEntity;
import com.zjj.product.entity.AttrGroupEntity;
import com.zjj.product.mapper.AttrAttrgroupRelationEntityMapper;
import com.zjj.product.mapper.AttrEntityMapper;
import com.zjj.product.mapper.AttrGroupEntityMapper;
import com.zjj.product.service.AttrAttrgroupRelationService;
import com.zjj.product.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:09
 * @description
 */
@Service
public class AttrAttrgroupRelationServiceImpl implements AttrAttrgroupRelationService {
    @Autowired
    private AttrAttrgroupRelationEntityMapper attrAttrgroupRelationEntityMapper;
    @Override
    public ServerResponse saveAttrAttrgroupRelation(AttrAttrgroupRelationEntity params) {
        attrAttrgroupRelationEntityMapper.save(params);
        return new ServerResponse(BizCodeEnume.REQUEST_SUCCESS.getCode(), BizCodeEnume.REQUEST_SUCCESS.getMessage());
    }
}
