package com.woniu.bean;

public class User {
	private Integer uid;
	private Integer upwd;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getUpwd() {
		return upwd;
	}
	public void setUpwd(Integer upwd) {
		this.upwd = upwd;
	}
	public User(Integer uid, Integer upwd) {
		super();
		this.uid = uid;
		this.upwd = upwd;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", upwd=" + upwd + "]";
	}
	
}
