package com.test.thread;

public class Atm {
  public static void main(String[] args) {
	Account account = new Account(10000);
	Krishna krishna = new Krishna(account);
	Raj raj = new Raj(account);
	
	krishna.start();
	raj.start();
	
	try {
		Thread.sleep(1000);
		account.getbalance();
	} catch (Exception e) {
	
	}
}

}
