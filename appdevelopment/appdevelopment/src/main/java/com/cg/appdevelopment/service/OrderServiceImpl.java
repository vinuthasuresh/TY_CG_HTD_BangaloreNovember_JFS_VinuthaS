package com.cg.appdevelopment.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.appdevelopment.dao.OrderDAO;
import com.cg.appdevelopment.dto.OrderInfo;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO dao;

	@Override
	public OrderInfo getOrder(int id) {
		return dao.getOrder(id);
	}

	

}
