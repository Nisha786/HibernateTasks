package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Flipkart fk = new Flipkart();

		fk.setFid(1);
		fk.setFname("abc");

		// Child objects

		Orders o1 = new Orders();
	    o1.setOid(101);
		o1.setOname("Shirt");

		Orders o2 = new Orders();
		o2.setOid(102);
		o2.setOname("Jeans");

		Orders o3 = new Orders();
		o3.setOid(103);
		o3.setOname("Grocery");
		
		// add child object to set, as 3rd party set in parent
		Set s = new HashSet();
		
		s.add(o1);
		s.add(o2);
		s.add(o3);

		fk.setChildren(s);

		Transaction tx = session.beginTransaction();

		session.save(fk);

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		f.close();
	}

}
