package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData2 {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); // Load
																								// Factory

		Session s = sessionFactory.openSession(); // create session
		Employee2 e = (Employee2) s.get(Employee2.class, 4);

		System.out.println(e.getId());
		System.out.println(e.getFirstName());
		System.out.println(e.getLastName());
		System.out.println("successfully fetched details");

		s.close();

	}
}
