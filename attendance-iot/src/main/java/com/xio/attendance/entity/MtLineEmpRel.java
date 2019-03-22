package com.xio.attendance.entity;

import java.util.Date;

public class MtLineEmpRel {
    private String id;

    private String lineId;

    private String empId;

    private String postType;

    private String remark;

    private Date lastUpdateTimestamp;

    public MtLineEmpRel(){}
    public MtLineEmpRel(String id, String lineId, String empId, String postType, String remark, Date lastUpdateTimestamp) {
        this.id = id;
        this.lineId = lineId;
        this.empId = empId;
        this.postType = postType;
        this.remark = remark;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId == null ? null : lineId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType == null ? null : postType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    @Override
    public String toString() {
        return "MtLineEmpRel{" +
                "id='" + id + '\'' +
                ", lineId='" + lineId + '\'' +
                ", empId='" + empId + '\'' +
                ", postType='" + postType + '\'' +
                ", remark='" + remark + '\'' +
                ", lastUpdateTimestamp=" + lastUpdateTimestamp +
                '}';
    }
}