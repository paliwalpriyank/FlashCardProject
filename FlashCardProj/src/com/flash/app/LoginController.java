package com.flash.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flash.dto.LoginRequestXML;
import com.flash.dto.LoginResponseXML;
import com.flash.dto.RequestXML;
import com.flash.service.ILoginService;

@Controller
@RequestMapping(value = "/api")
public class LoginController {
	@Autowired
	ILoginService loginService;
	
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = {
			"application/json", "application/xml" })
	public LoginResponseXML getLoginResponse(@RequestBody RequestXML loginRequest) {

		boolean loginExists = loginService.retrieveLoginCredentials(
				loginRequest.getLogin().getUserName(), loginRequest.getLogin().getPassword());

		LoginResponseXML response = new LoginResponseXML();
		response.setLoginExists(loginExists);

		return response;

	}

}
