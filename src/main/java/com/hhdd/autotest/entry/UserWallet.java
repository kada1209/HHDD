package com.hhdd.autotest.entry;

import java.util.Date;

public class UserWallet {
    private Integer id;

    private Integer userid;

    private Integer cash;

    private Boolean type;

    private Long versionnumber;

    private Long originaluserid;

    private Byte status;

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

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Long getVersionnumber() {
        return versionnumber;
    }

    public void setVersionnumber(Long versionnumber) {
        this.versionnumber = versionnumber;
    }

    public Long getOriginaluserid() {
        return originaluserid;
    }

    public void setOriginaluserid(Long originaluserid) {
        this.originaluserid = originaluserid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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