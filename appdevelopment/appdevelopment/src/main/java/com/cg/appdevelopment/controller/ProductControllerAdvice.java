package com.cg.appdevelopment.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.cg.appdevelopment.dto.ProductResponse;
import com.cg.appdevelopment.exceptions.AppException;

@RestController
public class ProductControllerAdvice {
	@ExceptionHandler(AppException.class)
	public ProductResponse handleAppException(AppException e) {
		ProductResponse response = new ProductResponse();
		response.setStatusCode(401);
		response.setMessage("Exception");
		response.setDiscription(e.getMessage());
		return response;
	}

}
