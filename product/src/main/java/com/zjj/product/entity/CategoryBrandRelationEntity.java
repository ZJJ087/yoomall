package com.zjj.product.entity;

import java.io.Serializable;

public class CategoryBrandRelationEntity implements Serializable {
    private Long id;

    private Long brandId;

    private Long catelogId;

    private String brandName;

    private String catelogName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getCatelogName() {
        return catelogName;
    }

    public void setCatelogName(String catelogName) {
        this.catelogName = catelogName == null ? null : catelogName.trim();
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
        CategoryBrandRelationEntity other = (CategoryBrandRelationEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrandId() == null ? other.getBrandId() == null : this.getBrandId().equals(other.getBrandId()))
            && (this.getCatelogId() == null ? other.getCatelogId() == null : this.getCatelogId().equals(other.getCatelogId()))
            && (this.getBrandName() == null ? other.getBrandName() == null : this.getBrandName().equals(other.getBrandName()))
            && (this.getCatelogName() == null ? other.getCatelogName() == null : this.getCatelogName().equals(other.getCatelogName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBrandId() == null) ? 0 : getBrandId().hashCode());
        result = prime * result + ((getCatelogId() == null) ? 0 : getCatelogId().hashCode());
        result = prime * result + ((getBrandName() == null) ? 0 : getBrandName().hashCode());
        result = prime * result + ((getCatelogName() == null) ? 0 : getCatelogName().hashCode());
        return result;
    }
}