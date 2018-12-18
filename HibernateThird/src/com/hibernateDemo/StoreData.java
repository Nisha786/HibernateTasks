package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); // Load
		// Factory
        Session s = sessionFactory.openSession();

		Employee1 e = new Employee1();
		e.setId(3);
		e.setFirstName("Shivani");
		e.setLastName("Sahu");

		Transaction t = s.beginTransaction();

		s.delete(e);
		t.commit();
		System.out.println("successfully deleted");
		s.close();

	}

}
