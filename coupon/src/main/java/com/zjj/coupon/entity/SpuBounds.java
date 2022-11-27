package com.zjj.coupon.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class SpuBounds implements Serializable {
    private Long id;

    private Long spuId;

    private BigDecimal growBounds;

    private BigDecimal buyBounds;

    private Boolean work;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public BigDecimal getGrowBounds() {
        return growBounds;
    }

    public void setGrowBounds(BigDecimal growBounds) {
        this.growBounds = growBounds;
    }

    public BigDecimal getBuyBounds() {
        return buyBounds;
    }

    public void setBuyBounds(BigDecimal buyBounds) {
        this.buyBounds = buyBounds;
    }

    public Boolean getWork() {
        return work;
    }

    public void setWork(Boolean work) {
        this.work = work;
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
        SpuBounds other = (SpuBounds) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSpuId() == null ? other.getSpuId() == null : this.getSpuId().equals(other.getSpuId()))
            && (this.getGrowBounds() == null ? other.getGrowBounds() == null : this.getGrowBounds().equals(other.getGrowBounds()))
            && (this.getBuyBounds() == null ? other.getBuyBounds() == null : this.getBuyBounds().equals(other.getBuyBounds()))
            && (this.getWork() == null ? other.getWork() == null : this.getWork().equals(other.getWork()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSpuId() == null) ? 0 : getSpuId().hashCode());
        result = prime * result + ((getGrowBounds() == null) ? 0 : getGrowBounds().hashCode());
        result = prime * result + ((getBuyBounds() == null) ? 0 : getBuyBounds().hashCode());
        result = prime * result + ((getWork() == null) ? 0 : getWork().hashCode());
        return result;
    }
}