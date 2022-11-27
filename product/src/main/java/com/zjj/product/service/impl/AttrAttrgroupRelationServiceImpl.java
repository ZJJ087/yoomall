package com.zjj.product.service.impl;

import com.zjj.mymallcommon.response.CodeEnum;
import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.AttrAttrgroupRelationEntity;
import com.zjj.product.mapper.AttrAttrgroupRelationEntityMapper;
import com.zjj.product.service.AttrAttrgroupRelationService;
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
        return new ServerResponse(CodeEnum.REQUEST_SUCCESS.getCode(), CodeEnum.REQUEST_SUCCESS.getMessage());
    }
}
