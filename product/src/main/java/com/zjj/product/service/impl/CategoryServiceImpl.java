package com.zjj.product.service.impl;

import com.sun.org.apache.xerces.internal.impl.dv.xs.SchemaDateTimeException;
import com.zjj.mymallcommon.response.ServerResponse;
import com.zjj.product.entity.CategoryEntity;
import com.zjj.product.mapper.CategoryEntityMapper;
import com.zjj.product.service.CategoryService;
import com.zjj.product.vo.CategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangjiajun
 * @date 2022/11/23 14:17
 * @description
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryEntityMapper categoryEntityMapper;
    @Override
    public ServerResponse<List<CategoryVo>> listWithTree() {
        List<CategoryVo> all = categoryEntityMapper.findAll();
        List<CategoryVo> top = all.stream().filter((entity) -> {
            return entity.getCatLevel() == 1 && entity.getShowStatus() == 1;
        }).collect(Collectors.toList());
        List<CategoryVo> mid = all.stream().filter((entity) -> {
            return entity.getCatLevel() == 2 && entity.getShowStatus() == 1;
        }).collect(Collectors.toList());
        List<CategoryVo> bottom = all.stream().filter((entity) -> {
            return entity.getCatLevel() == 3 && entity.getShowStatus() == 1;
        }).collect(Collectors.toList());
        for(CategoryVo parent:mid){
            List<CategoryVo> ch = new ArrayList<>();
            for(CategoryVo child:bottom){
                if(child.getParentCid() == parent.getCatId()){
                    ch.add(child);
                }
            }
            parent.setChildren(ch);
        }
        for(CategoryVo parent:top){
            List<CategoryVo> ch = new ArrayList<>();
            for(CategoryVo child:mid){
                if(child.getParentCid() == parent.getCatId()){
                    ch.add(child);
                }
            }
            parent.setChildren(ch);
        }
        return new ServerResponse<List<CategoryVo>>(200,"获取三级分类成功",top);
    }

    @Override
    public ServerResponse<List<CategoryEntity>> queryAll() {
        List<CategoryEntity> all = categoryEntityMapper.findEntity();
        return new ServerResponse<>(200,"请求成功",all);
    }

    @Override
    public ServerResponse insertCategory(CategoryEntity params) {
        String categoryName = params.getName();
        CategoryEntity entity = categoryEntityMapper.findCategoryByName(categoryName);
        if(entity != null){
            return new ServerResponse(201,"该分类已存在");
        }
        int result = categoryEntityMapper.insert(params);
        return new ServerResponse(200,"保存成功");
    }

    @Override
    public ServerResponse updateCategory(CategoryEntity params) {
        int result = categoryEntityMapper.update(params);
        if (result == 1){
            return new ServerResponse(200,"修改成功");
        }
        return new ServerResponse(201,"修改失败");
    }

}
