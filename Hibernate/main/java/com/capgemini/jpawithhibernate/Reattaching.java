package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Reattaching {
	
	public static void main(String[] args) {
		EntityManager entityManager=null;
		EntityTransaction transaction=null;

		try {	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie record=entityManager.find(Movie.class, 100);
			System.out.println(entityManager.contains(record));
			entityManager.detach(record);//removes the object from the table
			System.out.println(entityManager.contains(record));
		Movie reattchMovie=	entityManager.merge(record);
		reattchMovie.setMname("Robo");
			
			
			//record.setMname("robo");

			//record.setRating("Good");
			System.out.println("record Updated");
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
	}


