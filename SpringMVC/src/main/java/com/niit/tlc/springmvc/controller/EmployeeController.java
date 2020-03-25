package com.niit.tlc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.tlc.springmvc.model.Employee;

@Controller
public class EmployeeController {
   
	@RequestMapping(value="employeeForm",method=RequestMethod.GET)
	 public String register(Model model) {
		
		Employee theEmp=new Employee();
		model.addAttribute("employee",theEmp);
		 return "registerEmployee";
	 }
	
	@RequestMapping(value="/addEmployee",method=RequestMethod.POST)
	public String submit(@ModelAttribute("employee")Employee employee,ModelMap model) {
		model.addAttribute("name", employee.getName());
		model.addAttribute("contactNumber", employee.getContactNumber());
		model.addAttribute("id", employee.getId());
		
		return "viewEmployee";
	}
}
