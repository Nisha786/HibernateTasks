package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateSC {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession();

		// Parent Objects

		Student s1 = new Student();
		s1.setSid(101);
		s1.setSname("Pinky");

		Student s2 = new Student();
		s2.setSid(102);
		s2.setSname("Saleena");

		// Child Objects

		Class c1 = new Class();
		c1.setCid(501);
		c1.setCname("abc");

		Class c2 = new Class();
		c2.setCid(502);
		c2.setCname("xyz");

		Set s = new HashSet();
		s.add(c1);
		s.add(c2);

		s1.setClasses(s);
		s2.setClasses(s);

		Transaction tx = session.beginTransaction();

		session.save(s1);
		session.save(s2);

		tx.commit();

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		f.close();

	}

}
