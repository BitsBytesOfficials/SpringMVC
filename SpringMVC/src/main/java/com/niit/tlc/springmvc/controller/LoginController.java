package com.niit.tlc.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String showLoginForm() {
		return "login";
	}

	@RequestMapping("/signIn")
	public String showSignUp() {
		return "signUp";
	}

	@RequestMapping("/checklogin")
	public String authenticate(HttpServletRequest req, ModelMap model) {
		
			if (req.getParameter("uname").equalsIgnoreCase("Deepanshu") && req.getParameter("psw").equals("deep")) {
				model.addAttribute("message", "SucessFully Login");
				return "success";
			}
			else
			{

				model.addAttribute("message", "entered Data is Incorrect");
				return "errorPage";
			}
		
	}

}
