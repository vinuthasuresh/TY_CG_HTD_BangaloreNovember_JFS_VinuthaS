package com.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) {

		EntityManager entityManager;
		EntityTransaction transaction;

		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test1");
			entityManager = factory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql ="delete from Movie where mid=100";
			Query query =entityManager.createQuery(jpql);
			int	count =	query.executeUpdate();
			if(count>0)
			{
				System.out.println("Deleted successfully");
			}
			else
			{
				System.out.println("Couldn't delete");
			}

			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
