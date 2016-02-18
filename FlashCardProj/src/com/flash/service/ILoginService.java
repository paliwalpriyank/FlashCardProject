package com.flash.service;

import com.flash.entity.Login;

public interface ILoginService {

	public boolean retrieveLoginCredentials(String userName, String password);
}
