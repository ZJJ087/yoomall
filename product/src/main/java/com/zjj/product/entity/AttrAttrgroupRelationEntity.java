package com.zjj.product.entity;

import java.io.Serializable;

public class AttrAttrgroupRelationEntity implements Serializable {
    private Long id;

    private Long attrId;

    private Long attrGroupId;

    private Integer attrSort;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public Integer getAttrSort() {
        return attrSort;
    }

    public void setAttrSort(Integer attrSort) {
        this.attrSort = attrSort;
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
        AttrAttrgroupRelationEntity other = (AttrAttrgroupRelationEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAttrId() == null ? other.getAttrId() == null : this.getAttrId().equals(other.getAttrId()))
            && (this.getAttrGroupId() == null ? other.getAttrGroupId() == null : this.getAttrGroupId().equals(other.getAttrGroupId()))
            && (this.getAttrSort() == null ? other.getAttrSort() == null : this.getAttrSort().equals(other.getAttrSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAttrId() == null) ? 0 : getAttrId().hashCode());
        result = prime * result + ((getAttrGroupId() == null) ? 0 : getAttrGroupId().hashCode());
        result = prime * result + ((getAttrSort() == null) ? 0 : getAttrSort().hashCode());
        return result;
    }
}