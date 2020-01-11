package com.cg.appdevelopment.dto;

import java.util.List;

public class ProductResponse {
	
	private int statusCode;
	private String message;
	private String discription;
	private List<ProductInfo> info;
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
	public List<ProductInfo> getInfo() {
		return info;
	}
	public void setInfo(List<ProductInfo> info) {
		this.info = info;
	}
	

}
