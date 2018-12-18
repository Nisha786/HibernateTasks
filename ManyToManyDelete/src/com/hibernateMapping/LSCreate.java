package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LSCreate {

	public static void main(String[] args) {
		
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession();

		School s1 = new School();
		s1.setSid(101);
		s1.setSname("Central Academy");

		School s2 = new School();
		s2.setSid(102);
		s2.setSname("Little Star");

		Location l1 = new Location();
		l1.setLid(501);
		l1.setLname("abc");

		Location l2 = new Location();
		l2.setLid(502);
		l2.setLname("xyz");

		Set s = new HashSet();
		s.add(s1);
		s.add(s2);

		l1.setSchools(s);
		l2.setSchools(s);

		Transaction tx = session.beginTransaction();

		session.save(l1);
		session.save(l2);
		tx.commit();
		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		f.close();
	}

}
