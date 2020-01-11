package com.cg.appdevelopment.dto;

import java.util.List;

public class UserInfoResponse {
	private int statusCode;
	private String message;
	private String discription;
	private List<UserInfo> user;
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public List<UserInfo> getUser() {
		return user;
	}
	public void setUser(List<UserInfo> user) {
		this.user = user;
	}
	
		
	}
	
	


