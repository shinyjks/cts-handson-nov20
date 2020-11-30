package com.org.day5;

public class Account {

	private int accNo;
	private float accBalance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accNo, float accBalance) {
		super();
		this.accNo = accNo;
		this.accBalance = accBalance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(float accBalance) {
		this.accBalance = accBalance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accBalance=" + accBalance + "]";
	}
	
}
