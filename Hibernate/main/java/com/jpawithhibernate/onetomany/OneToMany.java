package com.jpawithhibernate.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpawithhibernate.mapping.EmpInfo;

public class OneToMany {
	public static void main(String[] args) {
		EmpInfo em= new EmpInfo();
		em.setEmpid(50);
		em.setEname("varsh");
		em.setEmail("varsh@gmail.com");
		em.setPassword("var2");
		
		EmpExpirence emp=new EmpExpirence();
		emp.setExpid(300);
		emp.setCompany("google");
		emp.setYear(3);
		emp.setEmp(em);
		
		
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(emp);
			System.out.println("record added");
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();

		}

		
		entityManager.close();
		
	}
	}
	


