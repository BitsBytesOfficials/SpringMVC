package com.niit.tlc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	//return model+view name
	@RequestMapping(value="/shHome",method=RequestMethod.GET)
	public String showHome(ModelMap model) {
		model.addAttribute("user", "amit");
		model.addAttribute("d", new java.util.Date());

		return "home";
	}
	
	@RequestMapping(value="/hello")
	public String showSecond(ModelMap model) {
		
		
		return "second";
	}

}
