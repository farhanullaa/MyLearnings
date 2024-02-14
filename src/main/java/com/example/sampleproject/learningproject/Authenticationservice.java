package com.example.sampleproject.learningproject;

import org.springframework.stereotype.Service;

@Service
public class Authenticationservice {

	public boolean authenticate(String name, String password) {

		boolean isValidUserName = name.equalsIgnoreCase("Farhan ulla");
		boolean isValidpassword = password.equalsIgnoreCase("Tasmiya");

		return isValidUserName && isValidpassword;
	}

}
