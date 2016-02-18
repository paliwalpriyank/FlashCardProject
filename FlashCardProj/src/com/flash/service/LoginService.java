package com.flash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.flash.dao.ILoginDAO;
import com.flash.entity.Login;


@Service("loginService")
public class LoginService implements ILoginService {

	@Autowired
	ILoginDAO loginDAO;

	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public boolean retrieveLoginCredentials(String userName, String password) {
		Login login = loginDAO.retrieveLoginCredentials(userName, password);
		if (null != login) {
			return true;
		}
		return false;
	}
}
