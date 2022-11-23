package com.zjj.product.entity;

import java.io.Serializable;

public class SpuInfoDescEntity implements Serializable {
    private Long spuId;

    private String decript;

    private static final long serialVersionUID = 1L;

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript == null ? null : decript.trim();
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
        SpuInfoDescEntity other = (SpuInfoDescEntity) that;
        return (this.getSpuId() == null ? other.getSpuId() == null : this.getSpuId().equals(other.getSpuId()))
            && (this.getDecript() == null ? other.getDecript() == null : this.getDecript().equals(other.getDecript()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSpuId() == null) ? 0 : getSpuId().hashCode());
        result = prime * result + ((getDecript() == null) ? 0 : getDecript().hashCode());
        return result;
    }
}