package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VisioSave {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
																					// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Question q = new Question();

		q.setQid(1);
		q.setQname("Question1");

		// Child objects

		Answer a1 = new Answer();
		a1.setAid(101);
		a1.setAname("Answer1");

		Answer a2 = new Answer();
		a2.setAid(102);
		a2.setAname("Answer2");

		Answer a3 = new Answer();
		a3.setAid(103);
		a3.setAname("Answer3");

		// add child object to set, as 3rd party set in parent
		Set s = new HashSet();

		s.add(a1);
		s.add(a2);
		s.add(a3);

		q.setChildren(s);

		Transaction tx = session.beginTransaction();

		session.save(q);

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		f.close();
	}

}
