package com.test.thread;

public class Krishna extends Thread{
	
	Account account;
	public Krishna(Account account) {
		this.account=account;
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			account.withdraw(100);
		}
		
	}
	

}
