package com.vis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MoneyTransferController {
	
	@RequestMapping(value="/creditHome")
	public String transferHome() {		
		return "moneyTransfer";
	}
	
	
	@RequestMapping(value="/moneyTransferCont")
	public String transferMoney(int fromAccountNumber, int toAccountNumber,double amount) {		
		return "success";
	}	
	
}