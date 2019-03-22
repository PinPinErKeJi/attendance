package com.xio.attendance.entity;

import java.util.Date;

public class BaseEmployee {
    private String id;

    private String empCode;

    private String empName;

    private String empSex;

    private String compId;

    private String postId;

    private String empLevel;

    private String empStatus;

    private String empNative;

    private String empNumber;

    private Date empBirthdate;

    private String empEducation;

    private Date empEntranceDate;

    private String empPhoneOne;

    private String empPhoneTwo;

    private String remark;

    private String enableFlag;

    private String createUser;

    private Date createTimestamp;

    private String lastUpdateUser;

    private Date lastUpdateTimestamp;

    private String lastUpdateRemark;

    private String empPhotoUrl;

    private String signUrl;

    private Date internshipFinishDate;

    private Date memberDate;

    private Date dimissionDate;

    private Date entryDate;

    private Date transferDate;

    private String transferRemark;

    private MtLineEmpRel mtLineEmpRel;

    private MtWorkLine mtWorkLine;

    private MtStation mtStation;

    public BaseEmployee(){}

    public BaseEmployee(String id, String empCode, String empName, String empSex, String compId, String postId, String empLevel, String empStatus, String empNative, String empNumber, Date empBirthdate, String empEducation, Date empEntranceDate, String empPhoneOne, String empPhoneTwo, String remark, String enableFlag, String createUser, Date createTimestamp, String lastUpdateUser, Date lastUpdateTimestamp, String lastUpdateRemark, String empPhotoUrl, String signUrl, Date internshipFinishDate, Date memberDate, Date dimissionDate, Date entryDate, Date transferDate, String transferRemark, MtLineEmpRel mtLineEmpRel, MtWorkLine mtWorkLine, MtStation mtStation) {
        this.id = id;
        this.empCode = empCode;
        this.empName = empName;
        this.empSex = empSex;
        this.compId = compId;
        this.postId = postId;
        this.empLevel = empLevel;
        this.empStatus = empStatus;
        this.empNative = empNative;
        this.empNumber = empNumber;
        this.empBirthdate = empBirthdate;
        this.empEducation = empEducation;
        this.empEntranceDate = empEntranceDate;
        this.empPhoneOne = empPhoneOne;
        this.empPhoneTwo = empPhoneTwo;
        this.remark = remark;
        this.enableFlag = enableFlag;
        this.createUser = createUser;
        this.createTimestamp = createTimestamp;
        this.lastUpdateUser = lastUpdateUser;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.lastUpdateRemark = lastUpdateRemark;
        this.empPhotoUrl = empPhotoUrl;
        this.signUrl = signUrl;
        this.internshipFinishDate = internshipFinishDate;
        this.memberDate = memberDate;
        this.dimissionDate = dimissionDate;
        this.entryDate = entryDate;
        this.transferDate = transferDate;
        this.transferRemark = transferRemark;
        this.mtLineEmpRel = mtLineEmpRel;
        this.mtWorkLine = mtWorkLine;
        this.mtStation = mtStation;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public String getCompId() {
        return compId;
    }

    public void setCompId(String compId) {
        this.compId = compId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(String empLevel) {
        this.empLevel = empLevel;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getEmpNative() {
        return empNative;
    }

    public void setEmpNative(String empNative) {
        this.empNative = empNative;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public Date getEmpBirthdate() {
        return empBirthdate;
    }

    public void setEmpBirthdate(Date empBirthdate) {
        this.empBirthdate = empBirthdate;
    }

    public String getEmpEducation() {
        return empEducation;
    }

    public void setEmpEducation(String empEducation) {
        this.empEducation = empEducation;
    }

    public Date getEmpEntranceDate() {
        return empEntranceDate;
    }

    public void setEmpEntranceDate(Date empEntranceDate) {
        this.empEntranceDate = empEntranceDate;
    }

    public String getEmpPhoneOne() {
        return empPhoneOne;
    }

    public void setEmpPhoneOne(String empPhoneOne) {
        this.empPhoneOne = empPhoneOne;
    }

    public String getEmpPhoneTwo() {
        return empPhoneTwo;
    }

    public void setEmpPhoneTwo(String empPhoneTwo) {
        this.empPhoneTwo = empPhoneTwo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
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
        this.lastUpdateUser = lastUpdateUser;
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
        this.lastUpdateRemark = lastUpdateRemark;
    }

    public String getEmpPhotoUrl() {
        return empPhotoUrl;
    }

    public void setEmpPhotoUrl(String empPhotoUrl) {
        this.empPhotoUrl = empPhotoUrl;
    }

    public String getSignUrl() {
        return signUrl;
    }

    public void setSignUrl(String signUrl) {
        this.signUrl = signUrl;
    }

    public Date getInternshipFinishDate() {
        return internshipFinishDate;
    }

    public void setInternshipFinishDate(Date internshipFinishDate) {
        this.internshipFinishDate = internshipFinishDate;
    }

    public Date getMemberDate() {
        return memberDate;
    }

    public void setMemberDate(Date memberDate) {
        this.memberDate = memberDate;
    }

    public Date getDimissionDate() {
        return dimissionDate;
    }

    public void setDimissionDate(Date dimissionDate) {
        this.dimissionDate = dimissionDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public String getTransferRemark() {
        return transferRemark;
    }

    public void setTransferRemark(String transferRemark) {
        this.transferRemark = transferRemark;
    }

    public MtLineEmpRel getMtLineEmpRel() {
        return mtLineEmpRel;
    }

    public void setMtLineEmpRel(MtLineEmpRel mtLineEmpRel) {
        this.mtLineEmpRel = mtLineEmpRel;
    }

    public MtWorkLine getMtWorkLine() {
        return mtWorkLine;
    }

    public void setMtWorkLine(MtWorkLine mtWorkLine) {
        this.mtWorkLine = mtWorkLine;
    }

    public MtStation getMtStation() {
        return mtStation;
    }

    public void setMtStation(MtStation mtStation) {
        this.mtStation = mtStation;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "id='" + id + '\'' +
                ", empCode='" + empCode + '\'' +
                ", empName='" + empName + '\'' +
                ", empSex='" + empSex + '\'' +
                ", compId='" + compId + '\'' +
                ", postId='" + postId + '\'' +
                ", empLevel='" + empLevel + '\'' +
                ", empStatus='" + empStatus + '\'' +
                ", empNative='" + empNative + '\'' +
                ", empNumber='" + empNumber + '\'' +
                ", empBirthdate=" + empBirthdate +
                ", empEducation='" + empEducation + '\'' +
                ", empEntranceDate=" + empEntranceDate +
                ", empPhoneOne='" + empPhoneOne + '\'' +
                ", empPhoneTwo='" + empPhoneTwo + '\'' +
                ", remark='" + remark + '\'' +
                ", enableFlag='" + enableFlag + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTimestamp=" + createTimestamp +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", lastUpdateTimestamp=" + lastUpdateTimestamp +
                ", lastUpdateRemark='" + lastUpdateRemark + '\'' +
                ", empPhotoUrl='" + empPhotoUrl + '\'' +
                ", signUrl='" + signUrl + '\'' +
                ", internshipFinishDate=" + internshipFinishDate +
                ", memberDate=" + memberDate +
                ", dimissionDate=" + dimissionDate +
                ", entryDate=" + entryDate +
                ", transferDate=" + transferDate +
                ", transferRemark='" + transferRemark + '\'' +
                ", mtLineEmpRel=" + mtLineEmpRel +
                ", mtWorkLine=" + mtWorkLine +
                ", mtStation=" + mtStation +
                '}';
    }
}