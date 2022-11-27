package com.zjj.coupon.mapper;

import com.zjj.coupon.entity.Coupon;

public interface CouponMapper {
    int insert(Coupon record);

    int insertSelective(Coupon record);
}