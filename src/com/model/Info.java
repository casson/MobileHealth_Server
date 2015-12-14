package com.model;

public class Info implements java.io.Serializable {

	private static final long serialVersionUID = 4024040914919421350L;
	private Integer userId;
	private String password;
	private String userName;
	private String phoneNum;

	public Info() {
	}

	public Info(String password, String phoneNum) {
		this.password = password;
		this.phoneNum = phoneNum;
	}

	public Info(String password,String userName, String phoneNum) {
		this.userName=userName;
		this.password = password;
		this.phoneNum = phoneNum;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

}