package com.xio.attendance.entity;

import java.util.Date;

public class MtStation {
    private String id;

    private String statName;

    private String statCode;

    private String compId;

    private String statPhone;

    private String statFax;

    private Date establishDate;

    private String statAddress;

    private String remark;

    private String enableFlag;

    private String createUser;

    private Date createTimestamp;

    private String lastUpdateUser;

    private Date lastUpdateTimestamp;

    private String lastUpdateRemark;
    public MtStation(){}
    public MtStation(String id, String statName, String statCode, String compId, String statPhone, String statFax, Date establishDate, String statAddress, String remark, String enableFlag, String createUser, Date createTimestamp, String lastUpdateUser, Date lastUpdateTimestamp, String lastUpdateRemark) {
        this.id = id;
        this.statName = statName;
        this.statCode = statCode;
        this.compId = compId;
        this.statPhone = statPhone;
        this.statFax = statFax;
        this.establishDate = establishDate;
        this.statAddress = statAddress;
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

    public String getStatName() {
        return statName;
    }

    public void setStatName(String statName) {
        this.statName = statName == null ? null : statName.trim();
    }

    public String getStatCode() {
        return statCode;
    }

    public void setStatCode(String statCode) {
        this.statCode = statCode == null ? null : statCode.trim();
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId == null ? null : compId.trim();
    }

    public String getStatPhone() {
        return statPhone;
    }

    public void setStatPhone(String statPhone) {
        this.statPhone = statPhone == null ? null : statPhone.trim();
    }

    public String getStatFax() {
        return statFax;
    }

    public void setStatFax(String statFax) {
        this.statFax = statFax == null ? null : statFax.trim();
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public String getStatAddress() {
        return statAddress;
    }

    public void setStatAddress(String statAddress) {
        this.statAddress = statAddress == null ? null : statAddress.trim();
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
        return "MtStation{" +
                "id='" + id + '\'' +
                ", statName='" + statName + '\'' +
                ", statCode='" + statCode + '\'' +
                ", compId='" + compId + '\'' +
                ", statPhone='" + statPhone + '\'' +
                ", statFax='" + statFax + '\'' +
                ", establishDate=" + establishDate +
                ", statAddress='" + statAddress + '\'' +
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