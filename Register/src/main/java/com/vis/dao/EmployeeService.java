package com.vis.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.support.TransactionTemplate;

import com.vis.model.UserRegistration;

public class EmployeeService {
	
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	private TransactionTemplate transactionTemplate;
	
	public void register(UserRegistration e){
		
	}
}
