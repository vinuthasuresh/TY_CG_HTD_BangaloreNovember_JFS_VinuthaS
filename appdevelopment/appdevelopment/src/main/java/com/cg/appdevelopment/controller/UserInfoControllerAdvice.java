package com.cg.appdevelopment.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cg.appdevelopment.dto.UserInfoResponse;
import com.cg.appdevelopment.exceptions.AppException;

@RestController
public class UserInfoControllerAdvice {
	@ExceptionHandler(AppException.class)
	public UserInfoResponse authException(AppException e) {
		UserInfoResponse response = new UserInfoResponse();
		response.setStatusCode(501);
		response.setDiscription("Exception");
		response.setMessage(e.getMessage());
		return response;
	}

}
