package com.cg.appdevelopment.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.appdevelopment.dto.OrderResponse;
import com.cg.appdevelopment.exceptions.AppException;

public class OrderControllerAdvice {
	
	@ExceptionHandler(AppException.class)
	public OrderResponse handleAppException(AppException e) {
		OrderResponse response = new OrderResponse();
		response.setStatusCode(401);
		response.setMessage("Exception");
		response.setDiscription(e.getMessage());
		return response;
	}

}
