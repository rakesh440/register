package com.vis.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.vis.model.Customer;

public class CustomerDAOImpl {

	private SessionFactory sessionFactory;
	private HibernateTemplate hibernateTemplate;
	private TransactionTemplate transactionTemplate;
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate){
		this.hibernateTemplate=hibernateTemplate;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void createCustomer(Customer customer) {
		
		System.out.println("------CustomerDAOImpl------save()-->"+customer);
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(customer);
		tx.commit();
		session.close();
	}
	
	@SuppressWarnings("unchecked")
	public boolean transferMoney(final int fromAccountNumber,final int toAccountNumber,final double amount){
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		boolean res=(Boolean)transactionTemplate.execute(new TransactionCallback(){

			@Override
			public Object doInTransaction(TransactionStatus transactionStatus) {
				boolean status=false;
				try{
					int r1=hibernateTemplate.bulkUpdate("update savingsaccount set availableBalence=availableBalence-? where accountNumber=?", new Object[]{new Double(amount),new Integer(fromAccountNumber)});
					int r2=hibernateTemplate.bulkUpdate("update savingsaccount set availableBalence=availableBalence+? where accountNumber=?", new Object[]{new Double(amount),new Integer(toAccountNumber)});
					if(r1==0||r2==0){
						status=false;
						transactionStatus.setRollbackOnly();
					}
					else{
					    status=true;
					}
				}
				catch(Exception e){
					status=false;
					transactionStatus.setRollbackOnly();
				}
				return new Boolean(status);
			}
			
		});
					
		return res;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> list() {
		Session session = this.sessionFactory.openSession();
		List<Customer> personList = session.createQuery("from Customer").list();
		session.close();
		return personList;
	}
}
