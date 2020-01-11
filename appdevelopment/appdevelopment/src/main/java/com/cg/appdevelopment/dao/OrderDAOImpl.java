package com.cg.appdevelopment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.cg.appdevelopment.dto.OrderInfo;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@PersistenceUnit
	EntityManagerFactory entityFactory;

	@Override
	public OrderInfo getOrder(int id) {
		EntityManager manager = entityFactory.createEntityManager();
		OrderInfo info=manager.find(OrderInfo.class, id);
		return info;
	}

	

}
