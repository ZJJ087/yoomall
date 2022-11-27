package com.zjj.coupon.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class MemberPrice implements Serializable {
    private Long id;

    private Long skuId;

    private Long memberLevelId;

    private String memberLevelName;

    private BigDecimal memberPrice;

    private Boolean addOther;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName == null ? null : memberLevelName.trim();
    }

    public BigDecimal getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(BigDecimal memberPrice) {
        this.memberPrice = memberPrice;
    }

    public Boolean getAddOther() {
        return addOther;
    }

    public void setAddOther(Boolean addOther) {
        this.addOther = addOther;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MemberPrice other = (MemberPrice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSkuId() == null ? other.getSkuId() == null : this.getSkuId().equals(other.getSkuId()))
            && (this.getMemberLevelId() == null ? other.getMemberLevelId() == null : this.getMemberLevelId().equals(other.getMemberLevelId()))
            && (this.getMemberLevelName() == null ? other.getMemberLevelName() == null : this.getMemberLevelName().equals(other.getMemberLevelName()))
            && (this.getMemberPrice() == null ? other.getMemberPrice() == null : this.getMemberPrice().equals(other.getMemberPrice()))
            && (this.getAddOther() == null ? other.getAddOther() == null : this.getAddOther().equals(other.getAddOther()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSkuId() == null) ? 0 : getSkuId().hashCode());
        result = prime * result + ((getMemberLevelId() == null) ? 0 : getMemberLevelId().hashCode());
        result = prime * result + ((getMemberLevelName() == null) ? 0 : getMemberLevelName().hashCode());
        result = prime * result + ((getMemberPrice() == null) ? 0 : getMemberPrice().hashCode());
        result = prime * result + ((getAddOther() == null) ? 0 : getAddOther().hashCode());
        return result;
    }
}