package com.zjj.coupon.mapper;

import com.zjj.coupon.entity.MemberPrice;

public interface MemberPriceMapper {
    int insert(MemberPrice record);

    int insertSelective(MemberPrice record);
}