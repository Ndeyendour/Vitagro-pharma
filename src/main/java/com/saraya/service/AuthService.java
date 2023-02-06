package com.saraya.service;

public class AuthService {

	public boolean authentication(String username, String password) {
		// TODO Auto-generated method stub
		return username.equals("ndeye") && password.equals("secret");
	}

}
