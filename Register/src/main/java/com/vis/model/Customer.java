package com.vis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Customer")
public class Customer {
 
	@Id
    @Column(name="accountNumber")
    private int accountNumber;
	
	public Customer(int accountNumber, String customerName, int age,
			String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.age = age;
		this.accountType = accountType;
		
	}

	@Column(name="customerName")
	private String customerName;
    @Column(name="age")    
    private int age;
    @Column(name="accountType")
    private String accountType;
    
    
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

		   	   
     
}
