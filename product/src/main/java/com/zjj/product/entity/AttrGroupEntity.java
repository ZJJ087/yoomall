package com.zjj.product.entity;

import java.io.Serializable;

public class AttrGroupEntity implements Serializable {
    private Long attrGroupId;

    private String attrGroupName;

    private Integer sort;

    private String descript;

    private String icon;

    private Long catelogId;

    private static final long serialVersionUID = 1L;

    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public String getAttrGroupName() {
        return attrGroupName;
    }

    public void setAttrGroupName(String attrGroupName) {
        this.attrGroupName = attrGroupName == null ? null : attrGroupName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
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
        AttrGroupEntity other = (AttrGroupEntity) that;
        return (this.getAttrGroupId() == null ? other.getAttrGroupId() == null : this.getAttrGroupId().equals(other.getAttrGroupId()))
            && (this.getAttrGroupName() == null ? other.getAttrGroupName() == null : this.getAttrGroupName().equals(other.getAttrGroupName()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getDescript() == null ? other.getDescript() == null : this.getDescript().equals(other.getDescript()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getCatelogId() == null ? other.getCatelogId() == null : this.getCatelogId().equals(other.getCatelogId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttrGroupId() == null) ? 0 : getAttrGroupId().hashCode());
        result = prime * result + ((getAttrGroupName() == null) ? 0 : getAttrGroupName().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getDescript() == null) ? 0 : getDescript().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getCatelogId() == null) ? 0 : getCatelogId().hashCode());
        return result;
    }
}