package com.zjj.product.entity;

import java.io.Serializable;

public class AttrEntity implements Serializable {
    private Long attrId;

    private String attrName;

    private Byte searchType;

    private Byte valueType;

    private String icon;

    private String valueSelect;

    private Byte attrType;

    private Long enable;

    private Long catelogId;

    private Byte showDesc;

    private static final long serialVersionUID = 1L;

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

    public Byte getSearchType() {
        return searchType;
    }

    public void setSearchType(Byte searchType) {
        this.searchType = searchType;
    }

    public Byte getValueType() {
        return valueType;
    }

    public void setValueType(Byte valueType) {
        this.valueType = valueType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getValueSelect() {
        return valueSelect;
    }

    public void setValueSelect(String valueSelect) {
        this.valueSelect = valueSelect == null ? null : valueSelect.trim();
    }

    public Byte getAttrType() {
        return attrType;
    }

    public void setAttrType(Byte attrType) {
        this.attrType = attrType;
    }

    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
    }

    public Long getCatelogId() {
        return catelogId;
    }

    public void setCatelogId(Long catelogId) {
        this.catelogId = catelogId;
    }

    public Byte getShowDesc() {
        return showDesc;
    }

    public void setShowDesc(Byte showDesc) {
        this.showDesc = showDesc;
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
        AttrEntity other = (AttrEntity) that;
        return (this.getAttrId() == null ? other.getAttrId() == null : this.getAttrId().equals(other.getAttrId()))
            && (this.getAttrName() == null ? other.getAttrName() == null : this.getAttrName().equals(other.getAttrName()))
            && (this.getSearchType() == null ? other.getSearchType() == null : this.getSearchType().equals(other.getSearchType()))
            && (this.getValueType() == null ? other.getValueType() == null : this.getValueType().equals(other.getValueType()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getValueSelect() == null ? other.getValueSelect() == null : this.getValueSelect().equals(other.getValueSelect()))
            && (this.getAttrType() == null ? other.getAttrType() == null : this.getAttrType().equals(other.getAttrType()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getCatelogId() == null ? other.getCatelogId() == null : this.getCatelogId().equals(other.getCatelogId()))
            && (this.getShowDesc() == null ? other.getShowDesc() == null : this.getShowDesc().equals(other.getShowDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAttrId() == null) ? 0 : getAttrId().hashCode());
        result = prime * result + ((getAttrName() == null) ? 0 : getAttrName().hashCode());
        result = prime * result + ((getSearchType() == null) ? 0 : getSearchType().hashCode());
        result = prime * result + ((getValueType() == null) ? 0 : getValueType().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getValueSelect() == null) ? 0 : getValueSelect().hashCode());
        result = prime * result + ((getAttrType() == null) ? 0 : getAttrType().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getCatelogId() == null) ? 0 : getCatelogId().hashCode());
        result = prime * result + ((getShowDesc() == null) ? 0 : getShowDesc().hashCode());
        return result;
    }
}