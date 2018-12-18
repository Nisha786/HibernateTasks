package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setFirstName("Priya");
		e.setLastName("Kothari"); // prepare employee

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); // Load Factory

		Session s = sessionFactory.openSession(); // create session
		Transaction t = s.beginTransaction();

		s.save(e); // insert e
		t.commit();
		System.out.println("successfully saved");
		s.close();

	}
}