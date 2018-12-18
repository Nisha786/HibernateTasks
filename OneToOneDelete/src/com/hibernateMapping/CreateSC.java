package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateSC {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		State s = new State();
		s.setStateId(201);
		s.setStateName("MadhyaPradesh");

		City c = new City();
		c.setCityId(501);
		c.setCityName("Indore");
		c.setS(s);

		Transaction tx = session.beginTransaction();

		session.save(c);

		tx.commit();

		session.close();
		System.out.println("One to One is Done..!!");
		f.close();
	}

}
