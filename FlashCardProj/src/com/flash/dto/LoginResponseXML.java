package com.flash.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("loginResponse")
@XmlRootElement(name = "loginResponse")
@JsonSerialize(include = Inclusion.NON_NULL)
public class LoginResponseXML {
	
	private boolean loginExists;

	/**
	 * @return the loginExists
	 */
	@XmlElement
	public boolean isLoginExists() {
		return loginExists;
	}

	/**
	 * @param loginExists
	 *            the loginExists to set
	 */
	public void setLoginExists(boolean loginExists) {
		this.loginExists = loginExists;
	}

}
