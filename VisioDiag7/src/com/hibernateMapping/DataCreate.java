package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DataCreate {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
		// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Course c = new Course();

		c.setCid(1);
		c.setCname("Course1");

		// Child objects

		Lecture l1 = new Lecture();
		l1.setLid(101);
		l1.setLname("Lecture1");
		l1.setParentObjects(c);

		Lecture l2 = new Lecture();
		l2.setLid(102);
		l2.setLname("Lecture2");
		l2.setParentObjects(c);

		Lecture l3 = new Lecture();
		l3.setLid(103);
		l3.setLname("Lecture3");
		l3.setParentObjects(c);

		Transaction tx = session.beginTransaction();

		session.save(l1);
		session.save(l2);
		session.save(l3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();

	}

}
