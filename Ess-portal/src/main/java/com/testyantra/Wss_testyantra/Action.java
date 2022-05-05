package com.testyantra.Wss_testyantra;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Action {

	@SuppressWarnings("resource")

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("resume");
	EntityManager entityManager = factory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	public void register() {
		Scanner scanner = new Scanner(System.in);
		Employeeinfo employeeinfo = new Employeeinfo();
		System.out.println("enter the employee-id");
		employeeinfo.setEmployee_ID(scanner.nextInt());
		System.out.println("enter the employee-name");
		employeeinfo.setEmployee_Name(scanner.next());
		System.out.println("enter the email-id");
		employeeinfo.setEmail(scanner.next());
		System.out.println("enter the Password");
		employeeinfo.setPassword(scanner.next());
		System.out.println("enter the employeetype");
		employeeinfo.setEmployee_Type(scanner.next());
		transaction.begin();
		entityManager.persist(employeeinfo);
		transaction.commit();
		System.out.println("registered");
	}

	@SuppressWarnings({ "resource", "unlikely-arg-type" })
	public void login() {

		Scanner scanner2 = new Scanner(System.in);
		System.out.println("enter the employeeid");
		int loginid = scanner2.nextInt();
		System.out.println("enter the password");
		String password = scanner2.next();
		Query createQuery = entityManager.createQuery("select Employee_ID from Employeeinfo");
		List<Employeeinfo> list = createQuery.getResultList();
		boolean contains = list.contains(loginid);
		if (contains) {
			Employeeinfo find = entityManager.find(Employeeinfo.class, loginid);
			String password2 = find.getPassword();
			System.out.println(password2);
			boolean equals = password2.equals(password);
			if (equals) {
				System.out.println("login successfull " + find.getEmployee_Name());

				String employee_Type = find.getEmployee_Type();
				if (employee_Type.equals("employee")) {
					System.out.println("welcome employee" + find.getEmployee_Name());
					System.out.println("press 1 to all status of leave status");
					System.out.println("press 2 to show leave request");
					Leaveactions leaveactions = new Leaveactions();
					@SuppressWarnings("unused")
					int choice = scanner2.nextInt();
					switch (choice) {
					case 1:
						leaveactions.showstatus(loginid);
						break;
					case 2:
						leaveactions.getLeave(loginid);
						break;
					default:
						System.out.println("enter the proper option");
						break;
					}
				} else {
					System.out.println("welcome manager" + find.getEmployee_Name());
					System.out.println("press 1 to show all the requests");
					System.out.println("press 2 to accept/reject the requests");
					Manageractions manageractions = new Manageractions();

					int choice = scanner2.nextInt();
					switch (choice) {
					case 1:
						manageractions.showall();
						break;
					case 2:
						manageractions.order();
						break;
					default:
						System.out.println("enter the crt option");
						break;
					}

				}

			} else {
				System.out.println("incorrect password");
			}
		} else {
			System.out.println("user doesnot exits");
		}

	}

}
