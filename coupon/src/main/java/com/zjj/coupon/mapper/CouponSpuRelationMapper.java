package com.zjj.coupon.mapper;

import com.zjj.coupon.entity.CouponSpuRelation;

public interface CouponSpuRelationMapper {
    int insert(CouponSpuRelation record);

    int insertSelective(CouponSpuRelation record);
}