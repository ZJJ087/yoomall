package com.zjj.product.entity;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class UndoLogEntity implements Serializable {
    private Long id;

    private Long branchId;

    private String xid;

    private String context;

    private Integer logStatus;

    private Date logCreated;

    private Date logModified;

    private String ext;

    private byte[] rollbackInfo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid == null ? null : xid.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Integer getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    public Date getLogCreated() {
        return logCreated;
    }

    public void setLogCreated(Date logCreated) {
        this.logCreated = logCreated;
    }

    public Date getLogModified() {
        return logModified;
    }

    public void setLogModified(Date logModified) {
        this.logModified = logModified;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    public byte[] getRollbackInfo() {
        return rollbackInfo;
    }

    public void setRollbackInfo(byte[] rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
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
        UndoLogEntity other = (UndoLogEntity) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBranchId() == null ? other.getBranchId() == null : this.getBranchId().equals(other.getBranchId()))
            && (this.getXid() == null ? other.getXid() == null : this.getXid().equals(other.getXid()))
            && (this.getContext() == null ? other.getContext() == null : this.getContext().equals(other.getContext()))
            && (this.getLogStatus() == null ? other.getLogStatus() == null : this.getLogStatus().equals(other.getLogStatus()))
            && (this.getLogCreated() == null ? other.getLogCreated() == null : this.getLogCreated().equals(other.getLogCreated()))
            && (this.getLogModified() == null ? other.getLogModified() == null : this.getLogModified().equals(other.getLogModified()))
            && (this.getExt() == null ? other.getExt() == null : this.getExt().equals(other.getExt()))
            && (Arrays.equals(this.getRollbackInfo(), other.getRollbackInfo()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBranchId() == null) ? 0 : getBranchId().hashCode());
        result = prime * result + ((getXid() == null) ? 0 : getXid().hashCode());
        result = prime * result + ((getContext() == null) ? 0 : getContext().hashCode());
        result = prime * result + ((getLogStatus() == null) ? 0 : getLogStatus().hashCode());
        result = prime * result + ((getLogCreated() == null) ? 0 : getLogCreated().hashCode());
        result = prime * result + ((getLogModified() == null) ? 0 : getLogModified().hashCode());
        result = prime * result + ((getExt() == null) ? 0 : getExt().hashCode());
        result = prime * result + (Arrays.hashCode(getRollbackInfo()));
        return result;
    }
}