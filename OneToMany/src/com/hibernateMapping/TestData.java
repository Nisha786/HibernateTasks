package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Vendor v = new Vendor();

		v.setVid(1);
		v.setVname("Vendor1");

		// Child objects

		Customer c1 = new Customer();
		c1.setCid(101);
		c1.setCname("Cust1");

		Customer c2 = new Customer();
		c2.setCid(102);
		c2.setCname("Cust2");

		Customer c3 = new Customer();
		c3.setCid(103);
		c3.setCname("Cust3");
		// add child object to set, as 3rd party set in parent
		Set s = new HashSet();
		
		s.add(c1);
		s.add(c2);
		s.add(c3);

		v.setChildren(s);

		Transaction tx = session.beginTransaction();

		session.save(v);

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		f.close();
	}

}
