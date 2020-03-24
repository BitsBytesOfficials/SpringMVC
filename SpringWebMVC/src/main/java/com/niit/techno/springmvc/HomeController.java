package com.niit.techno.springmvc;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/shhome",method=RequestMethod.GET)
	public String showHome(ModelMap model) {
		
		model.addAttribute("user", "Deepanshu Gupta");
		model.addAttribute("date",new Date());
		//Its find the page in view file
		return "home";
		
	}
	
	@RequestMapping("/hello")
	public String showSecond() {
		return "secondview";
	}
}
