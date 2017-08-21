package com.vis.model;

public class SavingsAccount {
	int accountNumber;
	double availableBalence;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAvailableBalence() {
		return availableBalence;
	}

	public void setAvailableBalence(double availableBalence) {
		this.availableBalence = availableBalence;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber
				+ ", availableBalence=" + availableBalence + "]";
	}

}
