package com.jpawithhibernate.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {
	public static void main(String[] args) {
		
//		EmpInfo em= new EmpInfo();
//		em.setEmpid(10);
//		em.setEname("Ram");
//		em.setEmail("ram@gmail.com");
//		em.setPassword("ram55");
//		
//		EmpOthersInfo info = new EmpOthersInfo();
//		info.setId(20);
//		info.setFathername("abcs");
//		info.setMothername("nhgj");
//		info.setPassport("jjjjj");
//		info.setEp(em);
//		
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(info);
			entityManager.find(EmpInfo.class, 10);
			EmpInfo em1= new EmpInfo();
			
			System.out.println(em1.getOther().getPassport());
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}

		//transaction.commit();
		entityManager.close();
		
	}

}
