package com.zjj.coupon.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Coupon implements Serializable {
    private Long id;

    private Boolean couponType;

    private String couponImg;

    private String couponName;

    private Integer num;

    private BigDecimal amount;

    private Integer perLimit;

    private BigDecimal minPoint;

    private Date startTime;

    private Date endTime;

    private Boolean useType;

    private String note;

    private Integer publishCount;

    private Integer useCount;

    private Integer receiveCount;

    private Date enableStartTime;

    private Date enableEndTime;

    private String code;

    private Boolean memberLevel;

    private Boolean publish;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getCouponType() {
        return couponType;
    }

    public void setCouponType(Boolean couponType) {
        this.couponType = couponType;
    }

    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg == null ? null : couponImg.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPerLimit() {
        return perLimit;
    }

    public void setPerLimit(Integer perLimit) {
        this.perLimit = perLimit;
    }

    public BigDecimal getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(BigDecimal minPoint) {
        this.minPoint = minPoint;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getUseType() {
        return useType;
    }

    public void setUseType(Boolean useType) {
        this.useType = useType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    public Integer getUseCount() {
        return useCount;
    }

    public void setUseCount(Integer useCount) {
        this.useCount = useCount;
    }

    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    public Date getEnableStartTime() {
        return enableStartTime;
    }

    public void setEnableStartTime(Date enableStartTime) {
        this.enableStartTime = enableStartTime;
    }

    public Date getEnableEndTime() {
        return enableEndTime;
    }

    public void setEnableEndTime(Date enableEndTime) {
        this.enableEndTime = enableEndTime;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Boolean getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Boolean memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
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
        Coupon other = (Coupon) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCouponType() == null ? other.getCouponType() == null : this.getCouponType().equals(other.getCouponType()))
            && (this.getCouponImg() == null ? other.getCouponImg() == null : this.getCouponImg().equals(other.getCouponImg()))
            && (this.getCouponName() == null ? other.getCouponName() == null : this.getCouponName().equals(other.getCouponName()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPerLimit() == null ? other.getPerLimit() == null : this.getPerLimit().equals(other.getPerLimit()))
            && (this.getMinPoint() == null ? other.getMinPoint() == null : this.getMinPoint().equals(other.getMinPoint()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getUseType() == null ? other.getUseType() == null : this.getUseType().equals(other.getUseType()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getPublishCount() == null ? other.getPublishCount() == null : this.getPublishCount().equals(other.getPublishCount()))
            && (this.getUseCount() == null ? other.getUseCount() == null : this.getUseCount().equals(other.getUseCount()))
            && (this.getReceiveCount() == null ? other.getReceiveCount() == null : this.getReceiveCount().equals(other.getReceiveCount()))
            && (this.getEnableStartTime() == null ? other.getEnableStartTime() == null : this.getEnableStartTime().equals(other.getEnableStartTime()))
            && (this.getEnableEndTime() == null ? other.getEnableEndTime() == null : this.getEnableEndTime().equals(other.getEnableEndTime()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getMemberLevel() == null ? other.getMemberLevel() == null : this.getMemberLevel().equals(other.getMemberLevel()))
            && (this.getPublish() == null ? other.getPublish() == null : this.getPublish().equals(other.getPublish()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCouponType() == null) ? 0 : getCouponType().hashCode());
        result = prime * result + ((getCouponImg() == null) ? 0 : getCouponImg().hashCode());
        result = prime * result + ((getCouponName() == null) ? 0 : getCouponName().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getPerLimit() == null) ? 0 : getPerLimit().hashCode());
        result = prime * result + ((getMinPoint() == null) ? 0 : getMinPoint().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getUseType() == null) ? 0 : getUseType().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getPublishCount() == null) ? 0 : getPublishCount().hashCode());
        result = prime * result + ((getUseCount() == null) ? 0 : getUseCount().hashCode());
        result = prime * result + ((getReceiveCount() == null) ? 0 : getReceiveCount().hashCode());
        result = prime * result + ((getEnableStartTime() == null) ? 0 : getEnableStartTime().hashCode());
        result = prime * result + ((getEnableEndTime() == null) ? 0 : getEnableEndTime().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getMemberLevel() == null) ? 0 : getMemberLevel().hashCode());
        result = prime * result + ((getPublish() == null) ? 0 : getPublish().hashCode());
        return result;
    }
}