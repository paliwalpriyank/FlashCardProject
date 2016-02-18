package com.flash.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.flash.entity.Login;

@Repository("loginDAO")
public class LoginDAO implements ILoginDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	
	public Login retrieveLoginCredentials(String userName, String password) {

		SQLQuery query = sessionFactory
				.openSession()
				.createSQLQuery(
						"Select * From Login where UserName=:userName and Password=:password");
		query.addEntity(Login.class);
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		List results = query.list();
		sessionFactory.close();
		return (Login) results.get(0);
	}

}
