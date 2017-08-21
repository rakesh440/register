package com.vis.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vis.model.UserRegistration;
import com.vis.service.RegistrationDAO;

@Repository
public class RegistrationDAOImpl implements RegistrationDAO {

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public void registerUser(UserRegistration userRegistration) {
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(userRegistration);	
		session.getTransaction().commit();
	}

}
