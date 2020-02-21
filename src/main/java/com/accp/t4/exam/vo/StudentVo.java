package com.accp.t4.exam.vo;

public class StudentVo {
private String sid;
private String mname;
private String sname;
private String cname;
private String cid;
public String getCid() {
	return cid;
}
public void setCid(String cid) {
	this.cid = cid;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "StudentVo [sid=" + sid + ", mname=" + mname + ", sname=" + sname + ", cname=" + cname + "]";
}
public StudentVo() {
	super();
	// TODO Auto-generated constructor stub
}

}
