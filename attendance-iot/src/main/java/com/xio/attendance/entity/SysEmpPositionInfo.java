package com.xio.attendance.entity;

import java.util.Date;

public class SysEmpPositionInfo {
    private String id;

    private String empId;

    private String statId;

    private String prjId;

    private Date recordTimestamp;

    private Date recordTimestampStart;

    private Date recordTimestampEnd;

    private String depictType;

    private String attendanceType;

    private String handleType;

    private String remark;

    private Date createDate;

    private String createId;

    private Date updateDate;

    private String updateId;

    private  String longitude;

    private  String latitude;

    public SysEmpPositionInfo(){}

    public SysEmpPositionInfo(String id, String empId, String statId, String prjId, Date recordTimestamp, Date recordTimestampStart, Date recordTimestampEnd, String depictType, String attendanceType, String handleType, String remark, Date createDate, String createId, Date updateDate, String updateId, String longitude, String latitude) {
        this.id = id;
        this.empId = empId;
        this.statId = statId;
        this.prjId = prjId;
        this.recordTimestamp = recordTimestamp;
        this.recordTimestampStart = recordTimestampStart;
        this.recordTimestampEnd = recordTimestampEnd;
        this.depictType = depictType;
        this.attendanceType = attendanceType;
        this.handleType = handleType;
        this.remark = remark;
        this.createDate = createDate;
        this.createId = createId;
        this.updateDate = updateDate;
        this.updateId = updateId;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getStatId() {
        return statId;
    }

    public void setStatId(String statId) {
        this.statId = statId == null ? null : statId.trim();
    }

    public String getPrjId() {
        return prjId;
    }

    public void setPrjId(String prjId) {
        this.prjId = prjId == null ? null : prjId.trim();
    }

    public Date getRecordTimestamp() {
        return recordTimestamp;
    }

    public void setRecordTimestamp(Date recordTimestamp) {
        this.recordTimestamp = recordTimestamp;
    }

    public Date getRecordTimestampStart() {
        return recordTimestampStart;
    }

    public void setRecordTimestampStart(Date recordTimestampStart) {
        this.recordTimestampStart = recordTimestampStart;
    }

    public Date getRecordTimestampEnd() {
        return recordTimestampEnd;
    }

    public void setRecordTimestampEnd(Date recordTimestampEnd) {
        this.recordTimestampEnd = recordTimestampEnd;
    }

    public String getDepictType() {
        return depictType;
    }

    public void setDepictType(String depictType) {
        this.depictType = depictType == null ? null : depictType.trim();
    }

    public String getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(String attendanceType) {
        this.attendanceType = attendanceType == null ? null : attendanceType.trim();
    }

    public String getHandleType() {
        return handleType;
    }

    public void setHandleType(String handleType) {
        this.handleType = handleType == null ? null : handleType.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId == null ? null : updateId.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "SysEmpPositionInfo{" +
                "id='" + id + '\'' +
                ", empId='" + empId + '\'' +
                ", statId='" + statId + '\'' +
                ", prjId='" + prjId + '\'' +
                ", recordTimestamp=" + recordTimestamp +
                ", recordTimestampStart=" + recordTimestampStart +
                ", recordTimestampEnd=" + recordTimestampEnd +
                ", depictType='" + depictType + '\'' +
                ", attendanceType='" + attendanceType + '\'' +
                ", handleType='" + handleType + '\'' +
                ", remark='" + remark + '\'' +
                ", createDate=" + createDate +
                ", createId='" + createId + '\'' +
                ", updateDate=" + updateDate +
                ", updateId='" + updateId + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }
}