package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Mother m = new Mother(); // parent object
		m.setMid(1);
		m.setMname("M1");

		Children c1 = new Children(); // Child object
		c1.setCid(103);
		c1.setCname("Child3");

		Children c2 = new Children();
		c2.setCid(104);
		c2.setCname("Child4");

		Set s = new HashSet();

		s.add(c1);
		s.add(c2);

		m.setChild(s);

		Transaction tx = session.beginTransaction();
		session.update(m);
		tx.commit();
		session.close();
		System.out.println("One to many is done successfully.....!!");
		f.close();
	}

}
