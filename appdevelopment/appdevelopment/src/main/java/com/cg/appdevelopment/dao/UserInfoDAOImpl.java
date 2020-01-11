package com.cg.appdevelopment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.cg.appdevelopment.dto.UserInfo;
import com.cg.appdevelopment.exceptions.AppException;


@Repository
public class UserInfoDAOImpl implements UserInfoDAO {
	
	@PersistenceUnit
	private EntityManagerFactory entityManager;

	@Override
	public UserInfo login(UserInfo info) {
		EntityManager manager = entityManager.createEntityManager();
		String jpql = "from UserInfo where email=:email";
		TypedQuery<UserInfo> query = manager.createQuery(jpql, UserInfo.class);
		query.setParameter("email", info.getEmail());
		try {
			UserInfo account = query.getSingleResult();
			if (account.getPassword().equals(info.getPassword())) {
				return account;
			} else {
				System.out.println("Login successfull");
				return null;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		throw new AppException("email invalid");
		}


	}

	@Override
	public boolean register(UserInfo user) {
		EntityManager manager = entityManager.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			throw new AppException("Account with same email already exists");
		}
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = entityManager.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserInfo info = manager.find(UserInfo.class, id);
		info.setPassword(password);
		return true;
	}

}
