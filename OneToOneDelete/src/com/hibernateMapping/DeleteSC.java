package com.hibernateMapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteSC {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Object o = session.get(City.class, new Integer(201));
		City c = (City) o;
		Transaction tx = session.beginTransaction();
		session.delete(c);

		tx.commit();

		session.close();
		System.out.println("One To one is Done for deleting all parents with childs...!");
		f.close();
	}

}
