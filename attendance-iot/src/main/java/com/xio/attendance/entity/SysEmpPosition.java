package com.xio.attendance.entity;

import java.util.Date;

public class SysEmpPosition {
    private String id;

    private String empId;

    private String longitude;

    private String latitude;

    private Date recordTimestamp;

    private String postType;

    private String sourceId;

    private SysDictionary sysDictionary;

    public SysEmpPosition(){}
    public SysEmpPosition(String id, String empId, String longitude, String latitude, Date recordTimestamp, String postType, String sourceId) {
        this.id = id;
        this.empId = empId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.recordTimestamp = recordTimestamp;
        this.postType = postType;
        this.sourceId = sourceId;
    }

    public SysEmpPosition(String id, String empId, String longitude, String latitude, Date recordTimestamp, String postType, String sourceId, SysDictionary sysDictionary) {
        this.id = id;
        this.empId = empId;
        this.longitude = longitude;
        this.latitude = latitude;
        this.recordTimestamp = recordTimestamp;
        this.postType = postType;
        this.sourceId = sourceId;
        this.sysDictionary = sysDictionary;
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public Date getRecordTimestamp() {
        return recordTimestamp;
    }

    public void setRecordTimestamp(Date recordTimestamp) {
        this.recordTimestamp = recordTimestamp;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType == null ? null : postType.trim();
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public SysDictionary getSysDictionary() {
        return sysDictionary;
    }

    public void setSysDictionary(SysDictionary sysDictionary) {
        this.sysDictionary = sysDictionary;
    }

    @Override
    public String toString() {
        return "SysEmpPosition{" +
                "id='" + id + '\'' +
                ", empId='" + empId + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", recordTimestamp=" + recordTimestamp +
                ", postType='" + postType + '\'' +
                ", sourceId='" + sourceId + '\'' +
                ", sysDictionary=" + sysDictionary +
                '}';
    }
}