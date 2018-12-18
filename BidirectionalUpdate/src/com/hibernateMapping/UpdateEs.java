package com.hibernateMapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEs {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		// One to many

		   Object o = session.get(ElectronicComponent.class, new Integer(1)); 
		   ElectronicComponent e = (ElectronicComponent) o;
		   Transaction tx = session.beginTransaction(); 
		   session.update(e);
		 

		// Many to One

	/*	Query qry = s.createQuery("from Car c");
		List l = qry.list();
		Iterator it = l.iterator();

		Transaction tx = s.beginTransaction();

		while (it.hasNext()) {

			Object o = it.next();
			Car c = (Car) o;
			session.delete(c);
		}   */

		session.close();
		System.out.println("One To Many is Done for delete..!!");
	// 	System.out.println("Many To One is Done for delete..!!");
		f.close();
	}

}
