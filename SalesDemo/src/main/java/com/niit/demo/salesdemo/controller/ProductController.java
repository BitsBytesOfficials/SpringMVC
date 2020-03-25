package com.niit.demo.salesdemo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("/sell")
	public String sellProduct(ModelMap model) {
		model.addAttribute("name","Computers");
		model.addAttribute("sellDate",new Date());
		model.addAttribute("quant","5");
		model.addAttribute("total", 5*100000);
		return "sellproduct";
	}
	
	@RequestMapping("/buy")
	public String buyProduct(ModelMap model) {
		model.addAttribute("name","Computers");
		model.addAttribute("sellDate",new Date());
		model.addAttribute("quant","5");
		model.addAttribute("total", 5*100000);
		
		return "buyproduct";
	}
	
}
