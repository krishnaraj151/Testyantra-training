package com.testyantra.Wss_testyantra;

import java.util.Scanner;


public class App {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
Action action = new Action();

		while (true) {
			System.out.println("press 1 to register employee");
			System.out.println("press 2 to login");
			System.out.println("enter the choice");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				action.register();
				break;
			case 2:
				action.login();
				break;
			case 3:
				System.exit(1);
				break;
			default:
				System.out.println("enter the proper option");
				break;
			}

		}

	}
}
