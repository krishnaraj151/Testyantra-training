package com.testyantra.Wss_testyantra;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Leaveactions {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("resume");
	EntityManager entityManager = factory.createEntityManager();
	EntityTransaction transaction = entityManager.getTransaction();

	@SuppressWarnings("resource")
	public  void getLeave(int loginid) {
		Scanner scanner = new Scanner(System.in);
		Leaveinfo leaveinfo = new Leaveinfo();
		leaveinfo.setEmployee_ID(loginid);
		System.out.println("enter the leave date");
		leaveinfo.setLeave_Date(scanner.next());
		leaveinfo.setLeave_Status("pending");
		transaction.begin();
		entityManager.persist(leaveinfo);
		transaction.commit();
	}

	public void showstatus(int loginid) {
//		Query createQuery = entityManager.createQuery("select Employee_ID from Leaveinfo");
//		List<Leaveinfo> list = createQuery.getResultList();
//		System.out.println(list);
		
		Query createQuery = entityManager.createQuery("from Leaveinfo where Employee_ID=:number");
		createQuery.setParameter("number",loginid);
		Object singleResult = createQuery.getSingleResult();
		System.out.println(singleResult);
		
		
	}

}
