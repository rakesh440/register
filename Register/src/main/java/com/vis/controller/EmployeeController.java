package com.vis.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vis.dao.EmployeeService;
import com.vis.model.Address;
import com.vis.model.UserRegistration;
import com.vis.service.RegistrationDAO;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	private RegistrationDAO registrationDAO;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public ModelAndView newEmployee() {
		System.out
				.println("--------->hello newEmployee() of employeeController---");
		ModelAndView mav = new ModelAndView("employeeRegistration");
		return mav;
	}

	@RequestMapping(value="/employeeRegistration", method=RequestMethod.POST)
	public String getUserEmployee(@RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname,
			@RequestParam("telephone") String telephone,
			@RequestParam("email") String email,
			@RequestParam("date_of_birth") Date date_of_birth,
			@RequestParam("street") String street,
			@RequestParam("city") String city,
			@RequestParam("state") String state,
			@RequestParam("zipcode") String zipcode,
			@RequestParam("country") String country) {
		System.out.println("----employeeController----");
		Address address=new Address(street, Integer.parseInt(zipcode), country, state);
		Set<Address> addressSet=new HashSet<Address>();
		addressSet.add(address);
		UserRegistration userRegistration=new UserRegistration(firstname, lastname, Long.parseLong(telephone), email, date_of_birth, addressSet);
		userRegistration.setAddress(addressSet);
		registrationDAO.registerUser(userRegistration);
		System.out.println("---->"+userRegistration.getAddress());
		return "success";
	}
	
}
