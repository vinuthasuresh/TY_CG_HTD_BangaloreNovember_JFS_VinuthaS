package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;


public class DeleteDemo {
	
	public static void main(String[] args) {
		
		EntityManager entityManager;
		EntityTransaction transaction;
		
		try {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 103);
			entityManager.remove(record);
			transaction.commit();
			System.out.println("Record deleted");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
