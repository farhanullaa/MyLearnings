package com.example.sampleproject.learningproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class Logincontroller {

	private Authenticationservice authenticationservice;

	public Logincontroller(Authenticationservice authenticationservice) {
		super();
		this.authenticationservice = authenticationservice;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String gotopage() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String gotowelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (authenticationservice.authenticate(name, password)) {
			model.put("name", name);

			return "welcome";
		}
		model.put("Errormessage", "invalid cerdientials ! please provide correct credientials");
		return "login";
	}

}
