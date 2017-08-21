package com.vis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vis.model.UserRegistration;

@Controller
public class WelcomeServlet {

	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome() {
		System.out.println("--------->hello welcome-----");
		return "loginForm";
	}
}
