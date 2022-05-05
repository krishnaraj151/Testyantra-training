package com.testyantra.Wss_testyantra;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Manageractions {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("resume");
	EntityManager entityManager = factory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	
	@SuppressWarnings({ "unused", "unlikely-arg-type" })
	public void order() {
	
		Scanner scanner = new Scanner(System.in);	
		System.out.println("enter the employee id");
		int statusid=scanner.nextInt();
		Query createQuery = entityManager.createQuery("select Employee_ID from Leaveinfo");
		List<Leaveinfo> list = createQuery.getResultList();
		boolean contains = list.contains(statusid);
		if(contains) {
			System.out.println("enter the status u want to set");
			String status=scanner.next();
			Leaveinfo find = entityManager.find(Leaveinfo.class, statusid);
			find.setLeave_Status(status);
			System.out.println("status set successfully");
			transaction.begin();
			entityManager.persist(find);
			transaction.commit();
		}
		else {
			System.out.println("no requets from the employee");
		}
	}

	public void showall() {
		System.out.println("all the requests from the leavetable");
		Query createQuery = entityManager.createQuery("from Leaveinfo");
		List<Leaveinfo> list = createQuery.getResultList();
		System.out.println(list);
	}
	
	

}
