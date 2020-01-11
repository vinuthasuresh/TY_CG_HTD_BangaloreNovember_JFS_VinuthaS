package com.cg.appdevelopment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.appdevelopment.dao.ProductDAO;
import com.cg.appdevelopment.dto.ProductInfo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDAO dao;
	
	@Override
	public ProductInfo searchProduct(int id) {
		return dao.searchProduct(id);
	}

}
