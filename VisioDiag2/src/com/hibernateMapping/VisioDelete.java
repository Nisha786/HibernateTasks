package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VisioDelete {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session s = f.openSession();

		Object o = s.get(Flipkart.class, new Integer(1));
		Flipkart fk = (Flipkart) o;
		Transaction tx = s.beginTransaction();
		s.delete(fk);
		tx.commit();

		s.close();
		System.out.println("One To Many is Done for delete..!!");
		f.close();
	}

}
