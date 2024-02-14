package com.example.sampleproject.learningproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Logincontroller {

	private Authenticationservice authenticationservice;

	public Logincontroller(Authenticationservice authenticationservice) {
		super();
		this.authenticationservice = authenticationservice;
	}
	@RequestMapping(value = "Login", method = RequestMethod.GET)
	public String gotopage() {
		return "Login";
	}

	@RequestMapping(value = "Login", method = RequestMethod.POST)
	public String gotowelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (authenticationservice.authenticate(name, password)) {
			model.put("name", name);

			return "welcome";
		}
		model.put("Errormessage", "invalid cerdientials ! please provide correct credientials");
		return "Login";
	}

}
