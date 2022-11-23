package com.zjj.product.entity;

import java.io.Serializable;

public class ProductAttrValueEntity implements Serializable {
    private Long id;

    private Long spuId;

    private Long attrId;

    private String attrName;

    private String attrValue;

    private Integer attrSort;

    private Byte quickShow;

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

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue == null ? null : attrValue.trim();
    }

    public Integer getAttrSort() {
        return attrSort;
    }

    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
    }

    public Byte getQuickShow() {
        return quickShow;
    }

    public void setQuickShow(Byte quickShow) {
        this.quickShow = quickShow;
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
        ProductAttrValueEntity other = (ProductAttrValueEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSpuId() == null ? other.getSpuId() == null : this.getSpuId().equals(other.getSpuId()))
            && (this.getAttrId() == null ? other.getAttrId() == null : this.getAttrId().equals(other.getAttrId()))
            && (this.getAttrName() == null ? other.getAttrName() == null : this.getAttrName().equals(other.getAttrName()))
            && (this.getAttrValue() == null ? other.getAttrValue() == null : this.getAttrValue().equals(other.getAttrValue()))
            && (this.getAttrSort() == null ? other.getAttrSort() == null : this.getAttrSort().equals(other.getAttrSort()))
            && (this.getQuickShow() == null ? other.getQuickShow() == null : this.getQuickShow().equals(other.getQuickShow()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSpuId() == null) ? 0 : getSpuId().hashCode());
        result = prime * result + ((getAttrId() == null) ? 0 : getAttrId().hashCode());
        result = prime * result + ((getAttrName() == null) ? 0 : getAttrName().hashCode());
        result = prime * result + ((getAttrValue() == null) ? 0 : getAttrValue().hashCode());
        result = prime * result + ((getAttrSort() == null) ? 0 : getAttrSort().hashCode());
        result = prime * result + ((getQuickShow() == null) ? 0 : getQuickShow().hashCode());
        return result;
    }
}