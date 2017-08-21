package com.vis.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vis.dao.CustomerDAOImpl;
import com.vis.model.Customer;

@Controller
public class CustomerController {

	@Autowired
	public CustomerDAOImpl CustomerDAOImpl;

	public void setCustomerDAOImpl(CustomerDAOImpl customerDAOImpl) {
		CustomerDAOImpl = customerDAOImpl;
	}
    
	@RequestMapping(value = "/newCustomerPage", method=RequestMethod.POST)
	public String createCustomerPage() {
		System.out.println("------CustomerController------createCustomerPage()-->");
		return "newCustomer";
	}
	
	@RequestMapping(value = "/newCustomer")
	public String createCustomer(
			@RequestParam("accountNumber") String accountNumber,
			@RequestParam("customerName") String customerName,
			@RequestParam("age") String age,
			@RequestParam("accountType") String accountType) {
		Customer customer = new Customer(Integer.parseInt(accountNumber), customerName, Integer.parseInt(age), accountType);
		System.out.println("------CustomerController------createCustomer()-->");
		CustomerDAOImpl.createCustomer(customer);
		
		return "success";
	}
}

