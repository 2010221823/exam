package com.accp.t4.exam.pojo;

public class studentzhuan {
    private Integer zhuanid;

    private String zhuanname;

    public Integer getZhuanid() {
        return zhuanid;
    }

    public void setZhuanid(Integer zhuanid) {
        this.zhuanid = zhuanid;
    }

    public String getZhuanname() {
        return zhuanname;
    }

    public void setZhuanname(String zhuanname) {
        this.zhuanname = zhuanname == null ? null : zhuanname.trim();
    }
}