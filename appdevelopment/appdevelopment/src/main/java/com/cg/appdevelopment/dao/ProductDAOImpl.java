package com.cg.appdevelopment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;
import com.cg.appdevelopment.dto.ProductInfo;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@PersistenceUnit
	EntityManagerFactory entityFactory;

	@Override
	public ProductInfo searchProduct(int id) {
		EntityManager manager = entityFactory.createEntityManager();
		ProductInfo info=manager.find(ProductInfo.class, id);
		return info;
	}

}
