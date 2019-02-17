package com.hhdd.autotest.entry;

public class Student {
    private Integer sid;

    private String sname;

    private Integer sage;

    private String sgender;

    private Integer servlet;

    private Integer jsp;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender == null ? null : sgender.trim();
    }

    public Integer getServlet() {
        return servlet;
    }

    public void setServlet(Integer servlet) {
        this.servlet = servlet;
    }

    public Integer getJsp() {
        return jsp;
    }

    public void setJsp(Integer jsp) {
        this.jsp = jsp;
    }
}