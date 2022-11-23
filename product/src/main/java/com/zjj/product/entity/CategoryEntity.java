package com.zjj.product.entity;

import java.io.Serializable;

public class CategoryEntity implements Serializable {
    private Long catId;

    private String name;

    private Long parentCid;

    private Integer catLevel;

    private Byte showStatus;

    private Integer sort;

    private String icon;

    private String productUnit;

    private Integer productCount;

    private static final long serialVersionUID = 1L;

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getParentCid() {
        return parentCid;
    }

    public void setParentCid(Long parentCid) {
        this.parentCid = parentCid;
    }

    public Integer getCatLevel() {
        return catLevel;
    }

    public void setCatLevel(Integer catLevel) {
        this.catLevel = catLevel;
    }

    public Byte getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Byte showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit == null ? null : productUnit.trim();
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
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
        CategoryEntity other = (CategoryEntity) that;
        return (this.getCatId() == null ? other.getCatId() == null : this.getCatId().equals(other.getCatId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentCid() == null ? other.getParentCid() == null : this.getParentCid().equals(other.getParentCid()))
            && (this.getCatLevel() == null ? other.getCatLevel() == null : this.getCatLevel().equals(other.getCatLevel()))
            && (this.getShowStatus() == null ? other.getShowStatus() == null : this.getShowStatus().equals(other.getShowStatus()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getProductUnit() == null ? other.getProductUnit() == null : this.getProductUnit().equals(other.getProductUnit()))
            && (this.getProductCount() == null ? other.getProductCount() == null : this.getProductCount().equals(other.getProductCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCatId() == null) ? 0 : getCatId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentCid() == null) ? 0 : getParentCid().hashCode());
        result = prime * result + ((getCatLevel() == null) ? 0 : getCatLevel().hashCode());
        result = prime * result + ((getShowStatus() == null) ? 0 : getShowStatus().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getProductUnit() == null) ? 0 : getProductUnit().hashCode());
        result = prime * result + ((getProductCount() == null) ? 0 : getProductCount().hashCode());
        return result;
    }
}