package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEC {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Object o = session.get(Engine.class, new Integer(401));
		Engine e = (Engine) o;
		e.setEngineName("Engine2");
		Car c = e.getC();
		c.setCarName("Porsche");

		Transaction tx = session.beginTransaction();

		session.update(e);
		tx.commit();
		session.close();
		System.out.println("One To one is Done for updating all parents with childs...!");
		f.close();
	}

}
