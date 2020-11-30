package com.org.day5;

import java.util.ArrayList;
import java.util.List;

public class Service {

	List<Account> list = new ArrayList<Account>();
	
	public void add(Account a) {
		list.add(a);
	}
	
	public Account findByAccNo(int accNo) {
		for(Account a: list) {
			if(a.getAccNo() == accNo) {
				return a;
			}
		}
		return null;
	}
	
	public Iterable<Account> display(){
		return list;
	}
	
	public void remove(int accNo) {
		for(Account a: list) {
			if(a.getAccNo() == accNo) {
				System.out.println(a);
				list.remove(a);
			}
		}
	}
	
	public List<Account> displayByBalance(){
		List<Account> balance = new ArrayList<>();
		for(Account a: list) {
			if(a.getAccBalance() < 1000.0) {
				balance.add(a);
			}
		}
		return balance;
	}
}
