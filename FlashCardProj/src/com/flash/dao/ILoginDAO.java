package com.flash.dao;

import com.flash.entity.Login;

public interface ILoginDAO {
	public Login retrieveLoginCredentials(String userName, String password);
}
