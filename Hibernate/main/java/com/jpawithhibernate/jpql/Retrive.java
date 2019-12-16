package com.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrive {
	public static void main(String[] args) {
		
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			EntityManager entityManager=  entityManagerFactory.createEntityManager();
			//String jpql = "from Movie";
			String jpql="select mname from Movie";
			
			Query query = entityManager.createQuery(jpql);
			     List<String> record=   query.getResultList();
			for (String movie : record) {
				
			
			//System.out.println("Movie id..."+movie.getMid());
			//System.out.println("Movie name..."+movie.getMname());
			//System.out.println("Movie rating...."+movie.getRating());
				System.out.println(movie);
			}
		entityManager.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
