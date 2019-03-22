package com.xio.attendance.entity;

public class SysDictionary {
    private String id;

    private String dictName;

    private String dictCode;

    private String dictType;

    private String pDictId;

    private String enableFlag;
    public SysDictionary(){}
    public SysDictionary(String id, String dictName, String dictCode, String dictType, String pDictId, String enableFlag) {
        this.id = id;
        this.dictName = dictName;
        this.dictCode = dictCode;
        this.dictType = dictType;
        this.pDictId = pDictId;
        this.enableFlag = enableFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName == null ? null : dictName.trim();
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode == null ? null : dictCode.trim();
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getpDictId() {
        return pDictId;
    }

    public void setpDictId(String pDictId) {
        this.pDictId = pDictId == null ? null : pDictId.trim();
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag == null ? null : enableFlag.trim();
    }

    @Override
    public String toString() {
        return "SysDictionary{" +
                "id='" + id + '\'' +
                ", dictName='" + dictName + '\'' +
                ", dictCode='" + dictCode + '\'' +
                ", dictType='" + dictType + '\'' +
                ", pDictId='" + pDictId + '\'' +
                ", enableFlag='" + enableFlag + '\'' +
                '}';
    }
}