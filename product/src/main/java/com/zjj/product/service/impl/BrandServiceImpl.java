package com.zjj.product.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.mymallcommon.utils.PageUtils;
import com.zjj.product.entity.BrandEntity;
import com.zjj.product.mapper.BrandEntityMapper;
import com.zjj.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:13
 * @description
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandEntityMapper brandEntityMapper;

    @Override
    public ServerResponse insertBrand(BrandEntity params) {
        String name = params.getName();
        BrandEntity entity = brandEntityMapper.findBrandByName(name);
        if(entity != null){
            return new ServerResponse(201,"插入数据失败,该品牌已经存在");
        }
        brandEntityMapper.insert(params);
        return new ServerResponse(200,"插入成功");
    }

    @Override
    public ServerResponse deleteBrand(Long id) {
        BrandEntity entity = brandEntityMapper.findBrandByBrandId(id);
        if(entity == null){
            return new ServerResponse(201,"该记录不存在");
        }
        brandEntityMapper.delete(id);
        return new ServerResponse(200,"删除成功");
    }

    @Override
    public ServerResponse updateBrand(BrandEntity params) {
        BrandEntity entity = brandEntityMapper.findBrandByBrandId(params.getBrandId());
        if(entity == null){
            return new ServerResponse(201,"该记录不存在");
        }
        brandEntityMapper.update(params);
        return new ServerResponse(200,"修改成功");
    }

    @Override
    public ServerResponse<PageUtils> listBrand(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize,false);
        List<BrandEntity> entities = brandEntityMapper.list();
        PageInfo<BrandEntity> pageInfo = new PageInfo<>(entities);
        PageUtils pageUtils = new PageUtils(pageInfo);
        return new ServerResponse<>(200,"获取分页成功",pageUtils);
    }


}
