package com.zjj.coupon.mapper;

import com.zjj.coupon.entity.CouponHistory;

public interface CouponHistoryMapper {
    int insert(CouponHistory record);

    int insertSelective(CouponHistory record);
}