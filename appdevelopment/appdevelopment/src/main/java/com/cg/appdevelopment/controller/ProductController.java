package com.cg.appdevelopment.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.appdevelopment.dto.ProductInfo;
import com.cg.appdevelopment.dto.ProductResponse;
import com.cg.appdevelopment.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService service;

	@GetMapping(path="/search-product",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse searchProduct(@RequestParam("id") int id) {
		ProductResponse response = new ProductResponse();
		ProductInfo info=service.searchProduct(id);
		if(info!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDiscription("Product found");
			response.setInfo(Arrays.asList(info)); 
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDiscription("Product id does not exist");
		}
		return response;
	}
}
