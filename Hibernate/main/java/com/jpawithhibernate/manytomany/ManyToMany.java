package com.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpawithhibernate.mapping.EmpInfo;

public class ManyToMany {

	public static void main(String[] args) {
		EmpInfo em= new EmpInfo();
		em.setEmpid(678);
		em.setEname("varsh");
		em.setEmail("varsh@gmail.com");
		em.setPassword("var2");

		EmpInfo em1 =new EmpInfo();
		em1.setEmpid(778);
		em1.setEname("john");
		em1.setEmail("john@gmail.com");
		em1.setPassword("jwgd");

		ArrayList<EmpInfo> emp=new ArrayList<EmpInfo>();
		emp.add(em);
		emp.add(em1);

		Training_info tr= new Training_info();
		tr.setTid(12);
		tr.setTname("JAVA FS");
		tr.setDuration(30);
		tr.setEmp(emp);

		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(tr);
			System.out.println("record added");
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			

		}
	}
}