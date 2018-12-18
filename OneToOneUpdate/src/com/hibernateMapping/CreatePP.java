package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreatePP {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Passport s = new Passport();
		s.setPassportId(201);
		s.setPassportName("Passport");

		Person c = new Person();
		c.setPersonId(501);
		c.setPersonName("Indore");
		c.setP(s);

		Transaction tx = session.beginTransaction();

		session.save(c);

		tx.commit();

		session.close();
		System.out.println("One to One is Done..!!");
		f.close();
	}

}
