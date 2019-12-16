package com.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
	
	public static void main(String[] args) {
		EntityManager entityManager;
		EntityTransaction entityTransaction;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager= entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			String jpql = "update Movie set mname='Dangal' where mid=100";
			 Query query=  entityManager.createQuery(jpql);
			 int count =   query.executeUpdate();
			 if(count>0)
			 {
				 System.out.println("Updated....");
			 }
			 else
			 {
				 System.out.println("Couldn't update");
			 }
			
			
			
			entityTransaction.commit();
			
			
			
			
		} catch (Exception e) {


		}
	}

}
