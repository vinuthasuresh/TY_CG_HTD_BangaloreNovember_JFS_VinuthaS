package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.capgemini.jpawithhibernate.dto.Movie;

public class UpdateDemo {

	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;

		try {	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 100);
			
			record.setMname("Kick");
			record.setRating("Average");
			System.out.println("record Updated");
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
