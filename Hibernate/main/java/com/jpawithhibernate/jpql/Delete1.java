package com.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete1 {
	
	public static void main(String[] args) {
		EntityManager entityManager;
		EntityTransaction transaction;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "delete from Movie  where mid=:id";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("id", 101);
			
			int result = query.executeUpdate();
			System.out.println(result);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
	}
	}

	}


