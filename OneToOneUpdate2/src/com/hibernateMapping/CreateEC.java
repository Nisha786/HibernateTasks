package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateEC {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Car c = new Car();
		c.setCarId(401);
		c.setCarName("BMW");

		Engine e = new Engine();
		e.setEngineId(501);
		e.setEngineName("Engine1");
		e.setC(c);

		Transaction tx = session.beginTransaction();

		session.save(e);

		tx.commit();

		session.close();
		System.out.println("One to One is Done..!!");
		f.close();
	}

}
