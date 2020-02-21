package com.accp.t4.exam.pojo;

public class student {
    private Integer studentid;

    private String studentname;

    private String studentbj;

    private Integer studentbh;

    public Integer getStudentid() {
        return studentid;
    }

    public void setStudentid(Integer studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentbj() {
        return studentbj;
    }

    public void setStudentbj(String studentbj) {
        this.studentbj = studentbj == null ? null : studentbj.trim();
    }

    public Integer getStudentbh() {
        return studentbh;
    }

    public void setStudentbh(Integer studentbh) {
        this.studentbh = studentbh;
    }
}