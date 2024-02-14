package com.example.sampleproject.learningproject;

import org.springframework.stereotype.Service;

@Service
public class Authenticationservice {

	public boolean authenticate(String name, String password) {

		boolean isValidUserName = name.equalsIgnoreCase("farhan ulla");
		boolean isValidpassword = password.equals("tassu");

		return isValidUserName && isValidpassword;
	}

}
