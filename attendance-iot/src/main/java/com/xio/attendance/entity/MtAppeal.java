package com.xio.attendance.entity;

import java.util.Date;

public class MtAppeal {
    private String id;

    private String positionInfoId;

    private Short sequence;

    private String content;

    private Date createtime;

    public String getId() {
        return id;
    }

    public MtAppeal(String id, String positionInfoId, Short sequence, String content, Date createtime) {
        this.id = id;
        this.positionInfoId = positionInfoId;
        this.sequence = sequence;
        this.content = content;
        this.createtime = createtime;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPositionInfoId() {
        return positionInfoId;
    }

    public void setPositionInfoId(String positionInfoId) {
        this.positionInfoId = positionInfoId == null ? null : positionInfoId.trim();
    }

    public Short getSequence() {
        return sequence;
    }

    public void setSequence(Short sequence) {
        this.sequence = sequence;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "MtAppeal{" +
                "id='" + id + '\'' +
                ", positionInfoId='" + positionInfoId + '\'' +
                ", sequence=" + sequence +
                ", content='" + content + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}