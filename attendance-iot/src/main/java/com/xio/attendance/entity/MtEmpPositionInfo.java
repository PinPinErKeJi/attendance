package com.xio.attendance.entity;

import java.util.Date;

/**
 * @author WangGuipin
 * @ClassName MtEmpPositionInfo
 * @Description TODO
 * @create 2019-03-25 9:29
 * @desc WangGuipin
 **/
public class MtEmpPositionInfo {
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

    private String longitude;

    private String latitude;

    private String lineId;

    private String  depict;

    private String  attendance;

    private String auditStatus;

    private String fistContent;

    private Date fistCreatetime;

    private String secondContent;

    private Date secondCreatetime;

    private Short applyTypeId;

    private  BaseEmployee  baseEmployee;



    public MtEmpPositionInfo() {
    }

    public MtEmpPositionInfo(String id, String empId, String statId, String prjId, Date recordTimestamp, Date recordTimestampStart, Date recordTimestampEnd, String depictType, String attendanceType, String handleType, String remark, Date createDate, String createId, Date updateDate, String updateId, String longitude, String latitude, String lineId, String depict, String attendance, BaseEmployee baseEmployee) {
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
        this.lineId = lineId;
        this.depict = depict;
        this.attendance = attendance;
        this.baseEmployee = baseEmployee;
    }

    public MtEmpPositionInfo(String id, String empId, String statId, String prjId, Date recordTimestamp, Date recordTimestampStart, Date recordTimestampEnd, String depictType, String attendanceType, String handleType, String remark, Date createDate, String createId, Date updateDate, String updateId, String longitude, String latitude, String lineId, String depict, String attendance, String auditStatus, String fistContent, Date fistCreatetime, String secondContent, Date secondCreatetime, Short applyTypeId, BaseEmployee baseEmployee) {
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
        this.lineId = lineId;
        this.depict = depict;
        this.attendance = attendance;
        this.auditStatus = auditStatus;
        this.fistContent = fistContent;
        this.fistCreatetime = fistCreatetime;
        this.secondContent = secondContent;
        this.secondCreatetime = secondCreatetime;
        this.applyTypeId = applyTypeId;
        this.baseEmployee = baseEmployee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getStatId() {
        return statId;
    }

    public void setStatId(String statId) {
        this.statId = statId;
    }

    public String getPrjId() {
        return prjId;
    }

    public void setPrjId(String prjId) {
        this.prjId = prjId;
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
        this.depictType = depictType;
    }

    public String getAttendanceType() {
        return attendanceType;
    }

    public void setAttendanceType(String attendanceType) {
        this.attendanceType = attendanceType;
    }

    public String getHandleType() {
        return handleType;
    }

    public void setHandleType(String handleType) {
        this.handleType = handleType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        this.createId = createId;
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
        this.updateId = updateId;
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

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public BaseEmployee getBaseEmployee() {
        return baseEmployee;
    }

    public void setBaseEmployee(BaseEmployee baseEmployee) {
        this.baseEmployee = baseEmployee;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }



    public String getFistContent() {
        return fistContent;
    }

    public void setFistContent(String fistContent) {
        this.fistContent = fistContent;
    }

    public Date getFistCreatetime() {
        return fistCreatetime;
    }

    public void setFistCreatetime(Date fistCreatetime) {
        this.fistCreatetime = fistCreatetime;
    }


    public String getSecondContent() {
        return secondContent;
    }

    public void setSecondContent(String secondContent) {
        this.secondContent = secondContent;
    }

    public Date getSecondCreatetime() {
        return secondCreatetime;
    }

    public void setSecondCreatetime(Date secondCreatetime) {
        this.secondCreatetime = secondCreatetime;
    }

    public Short getApplyTypeId() {
        return applyTypeId;
    }

    public void setApplyTypeId(Short applyTypeId) {
        this.applyTypeId = applyTypeId;
    }

    @Override
    public String toString() {
        return "MtEmpPositionInfo{" +
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
                ", lineId='" + lineId + '\'' +
                ", depict='" + depict + '\'' +
                ", attendance='" + attendance + '\'' +
                ", auditStatus='" + auditStatus + '\'' +
                ", fistContent='" + fistContent + '\'' +
                ", fistCreatetime=" + fistCreatetime +
                ", secondContent='" + secondContent + '\'' +
                ", secondCreatetime=" + secondCreatetime +
                ", applyTypeId=" + applyTypeId +
                ", baseEmployee=" + baseEmployee +
                '}';
    }
}
