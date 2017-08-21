package com.vis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name="BankEmployeeCredentials")
	public class BankEmployee {
		@Id
        @Column(name="userName")
		private String userName;
        
        @Column(name="passWord")
		private String passWord;

		public BankEmployee(String userName, String passWord) {
			super();
			this.userName = userName;
			this.passWord = passWord;
		}

		public BankEmployee() {
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassWord() {
			return passWord;
		}

		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}

	}
