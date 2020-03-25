package com.niit.tlc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.tlc.springmvc.model.Reservation;

@Controller
public class ReservationController {

	
		@RequestMapping(value="/bookingForm")
		public String reservationForm(ModelMap model) {
			Reservation res=new Reservation();
			model.addAttribute("reservationForm", res);
			return "Reservationformview";//reservation Page
		}
		@RequestMapping("/submitForm")
		public String submitForm(@ModelAttribute("reservationForm") Reservation res1)
		{
			
			System.out.println("\n"+res1.getFirstName()+"\n");
			return "confirmationForm";
		}
		
}
