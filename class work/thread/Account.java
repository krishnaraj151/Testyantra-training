package com.test.thread;

public class Account {
	
	double balance;
	
	
	public Account(double balance) {
		this.balance=balance;
	}
	
	public synchronized void withdraw(int amount) {
		if(amount<balance) {
			balance=balance-amount;
		}
	}
	
	
	public void deposit(int amount) {
		balance=balance+amount;
	}
	
	public void getbalance() {
		System.out.println("the balance left is ="+balance);
	}

}
