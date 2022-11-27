package com.zjj.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjj.mymallcommon.response.CodeEnum;
import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.mymallcommon.utils.PageUtils;
import com.zjj.product.entity.AttrGroupEntity;
import com.zjj.product.mapper.AttrGroupEntityMapper;
import com.zjj.product.service.AttrGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:11
 * @description
 */
@Service
public class AttrGroupServiceImpl implements AttrGroupService {
    @Autowired
    private AttrGroupEntityMapper attrGroupEntityMapper;

    @Override
    public ServerResponse<List<AttrGroupEntity>> queryAttrGroup(Long categoryId) {
        List<AttrGroupEntity> group = attrGroupEntityMapper.findAttrGroupByCategoryId(categoryId);
        if(group == null || group.size() == 0){
            return new ServerResponse<>(CodeEnum.CATELOG_HAS_NO_ATTR.getCode(), CodeEnum.CATELOG_HAS_NO_ATTR.getMessage());
        }
        return new ServerResponse<>(CodeEnum.REQUEST_SUCCESS.getCode(), CodeEnum.REQUEST_SUCCESS.getMessage(), group);
    }

    @Override
    public ServerResponse<PageUtils> queryPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize,false);
        List<AttrGroupEntity> query = attrGroupEntityMapper.findAll();
        PageInfo<AttrGroupEntity> pageInfo = new PageInfo<>(query);
        return new ServerResponse<>(CodeEnum.REQUEST_SUCCESS.getCode(), CodeEnum.REQUEST_SUCCESS.getMessage(), new PageUtils(pageInfo));
    }
}
