package com.vis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vis.dao.UserCredentialService;
import com.vis.model.BankEmployee;

@Controller
@SessionAttributes("bankUser")
public class AdminController {

	@Autowired
	UserCredentialService userCredentialService;

	
	public void setUserCredentialService(UserCredentialService userCredentialService) {
		this.userCredentialService = userCredentialService;
	}
	
	@RequestMapping(value="/loginForm", method=RequestMethod.POST)
	public String verify(@RequestParam("userName") String userName, @RequestParam("passWord") String passWord) {
		BankEmployee bankUser=new BankEmployee(userName,passWord);
		if(new UserCredentialService().verify(bankUser))
		    return "mainLayout";
		else
			return "loginError";
	}
	
	
	/*@RequestMapping(method=RequestMethod.GET)
	public String setupForm(Model model) {
		BankUser bankUser=new BankUser();
		model.addAttribute("bankUser", bankUser);
		System.out.println("--------GET--------AdminController");
		return "loginForm";
	}*/
}
//@RequestParam("userName") String userName, @RequestParam("passWord") String passWord
/*<bean id="AdminController" class="controller.AdminController" autowire="byName" />

<bean id="userCredentialService" class="dao.UserCredentialService" />*/