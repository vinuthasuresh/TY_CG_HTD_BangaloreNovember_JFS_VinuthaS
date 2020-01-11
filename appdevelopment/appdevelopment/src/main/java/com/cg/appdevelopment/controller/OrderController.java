package com.cg.appdevelopment.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.appdevelopment.dto.OrderInfo;
import com.cg.appdevelopment.dto.OrderResponse;
import com.cg.appdevelopment.dto.UserInfoResponse;
import com.cg.appdevelopment.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService service;

	@GetMapping(path="/get-order",produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponse getOrders(@RequestParam("id") int id) {
		OrderResponse response = new OrderResponse();
		OrderInfo info=service.getOrder(id);
		if(info!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Product found");
			response.setOrder(Arrays.asList(info));   
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("Product id does not exist");
		}
		return response;

	}
	}
