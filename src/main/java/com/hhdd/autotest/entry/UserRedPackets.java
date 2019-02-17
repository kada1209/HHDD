package com.hhdd.autotest.entry;

import java.util.Date;

public class UserRedPackets {
    private Integer id;

    private Integer userid;

    private Integer redpacketsid;

    private Integer facevalue;

    private Integer currfacevalue;

    private Byte type;

    private Integer sourceid;

    private String memo;

    private Long versionnumber;

    private Byte status;

    private Long originaluserid;

    private String hbaserowkey;

    private Date begintime;

    private Date endtime;

    private Date createtime;

    private Date modifytime;

    private String operator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRedpacketsid() {
        return redpacketsid;
    }

    public void setRedpacketsid(Integer redpacketsid) {
        this.redpacketsid = redpacketsid;
    }

    public Integer getFacevalue() {
        return facevalue;
    }

    public void setFacevalue(Integer facevalue) {
        this.facevalue = facevalue;
    }

    public Integer getCurrfacevalue() {
        return currfacevalue;
    }

    public void setCurrfacevalue(Integer currfacevalue) {
        this.currfacevalue = currfacevalue;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getSourceid() {
        return sourceid;
    }

    public void setSourceid(Integer sourceid) {
        this.sourceid = sourceid;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Long getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(Long versionnumber) {
        this.versionnumber = versionnumber;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getOriginaluserid() {
        return originaluserid;
    }

    public void setOriginaluserid(Long originaluserid) {
        this.originaluserid = originaluserid;
    }

    public String getHbaserowkey() {
        return hbaserowkey;
    }

    public void setHbaserowkey(String hbaserowkey) {
        this.hbaserowkey = hbaserowkey == null ? null : hbaserowkey.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}