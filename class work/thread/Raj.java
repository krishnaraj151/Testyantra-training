package com.test.thread;

public class Raj extends Thread {
	
	Account account;
	public Raj(Account account) {
		this.account=account;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			account.withdraw(100);
		}
		
	}

}
