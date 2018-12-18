package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session s = f.openSession();

		Object o = s.get(Manager.class,new Integer(1));
		Manager m = (Manager)o;
		Transaction tx = s.beginTransaction();
		s.delete(m);
		tx.commit();

		s.close();
		System.out.println("One To Many is Done for delete..!!");
		f.close();
	}

}
