package com.ragna.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView loginView() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Hello Sergio!</h3></div><br><br>";
		
		ModelAndView modelView = new ModelAndView("login", "message", message);
		
		return modelView;
	}

}
