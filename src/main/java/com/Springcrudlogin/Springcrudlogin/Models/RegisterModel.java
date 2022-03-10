package com.Springcrudlogin.Springcrudlogin.Models;

import org.springframework.stereotype.Component;

@Component
public class RegisterModel 
{
	private String name;
	private String  password;
	private String Username;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public RegisterModel(String name, String password, String username) {
		super();
		this.name = name;
		this.password = password;
		Username = username;
	}
	public RegisterModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
