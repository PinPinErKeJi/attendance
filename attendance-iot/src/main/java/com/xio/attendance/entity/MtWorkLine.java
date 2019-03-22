package com.xio.attendance.entity;

import java.util.Date;

public class MtWorkLine {
    private String id;

    private String lineName;

    private String lineCode;

    private String compId;

    private String statId;

    private String remark;

    private String enableFlag;

    private String createUser;

    private Date createTimestamp;

    private String lastUpdateUser;

    private Date lastUpdateTimestamp;

    private String lastUpdateRemark;
    public MtWorkLine(){}
    public MtWorkLine(String id, String lineName, String lineCode, String compId, String statId, String remark, String enableFlag, String createUser, Date createTimestamp, String lastUpdateUser, Date lastUpdateTimestamp, String lastUpdateRemark) {
        this.id = id;
        this.lineName = lineName;
        this.lineCode = lineCode;
        this.compId = compId;
        this.statId = statId;
        this.remark = remark;
        this.enableFlag = enableFlag;
        this.createUser = createUser;
        this.createTimestamp = createTimestamp;
        this.lastUpdateUser = lastUpdateUser;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.lastUpdateRemark = lastUpdateRemark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
    }

    public String getLineCode() {
        return lineCode;
    }

    public void setLineCode(String lineCode) {
        this.lineCode = lineCode == null ? null : lineCode.trim();
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId == null ? null : compId.trim();
    }

    public String getStatId() {
        return statId;
    }

    public void setStatId(String statId) {
        this.statId = statId == null ? null : statId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag == null ? null : enableFlag.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser == null ? null : lastUpdateUser.trim();
    }

    public Date getLastUpdateTimestamp() {
        return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    public String getLastUpdateRemark() {
        return lastUpdateRemark;
    }

    public void setLastUpdateRemark(String lastUpdateRemark) {
        this.lastUpdateRemark = lastUpdateRemark == null ? null : lastUpdateRemark.trim();
    }

    @Override
    public String toString() {
        return "MtWorkLine{" +
                "id='" + id + '\'' +
                ", lineName='" + lineName + '\'' +
                ", lineCode='" + lineCode + '\'' +
                ", compId='" + compId + '\'' +
                ", statId='" + statId + '\'' +
                ", remark='" + remark + '\'' +
                ", enableFlag='" + enableFlag + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTimestamp=" + createTimestamp +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", lastUpdateTimestamp=" + lastUpdateTimestamp +
                ", lastUpdateRemark='" + lastUpdateRemark + '\'' +
                '}';
    }
}