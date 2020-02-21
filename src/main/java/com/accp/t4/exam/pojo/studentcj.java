package com.accp.t4.exam.pojo;

import java.util.Date;

public class studentcj {
    private Integer xsid;

    private Integer kcid;

    private String kccj;

    private Date sj;

    public Integer getXsid() {
        return xsid;
    }

    public void setXsid(Integer xsid) {
        this.xsid = xsid;
    }

    public Integer getKcid() {
        return kcid;
    }

    public void setKcid(Integer kcid) {
        this.kcid = kcid;
    }

    public String getKccj() {
        return kccj;
    }

    public void setKccj(String kccj) {
        this.kccj = kccj == null ? null : kccj.trim();
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }
}