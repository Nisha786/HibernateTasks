package com.hibernateDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); // Load
																								// Factory

		Session s = sessionFactory.openSession(); // create session
		Transaction t = s.beginTransaction();

		Query query = s.createQuery("select e.id, e.firstName, e.lastName from Employee e");
		List rows = query.list();
		Iterator iter = rows.iterator();

		Object[] columns;

		System.out.println("ID\tFIRSTNAME\tLASTNAME");

		while (iter.hasNext()) {
			columns = (Object[]) iter.next();
			Integer ID = (Integer) columns[0];
			String FIRSTNAME = (String) columns[1];
			String LASTNAME = (String) columns[2];
			System.out.println(ID + "\t" + FIRSTNAME + "\t" + LASTNAME);
		}

		t.commit();
		System.out.println("successfully Done");
		s.close();
	}

}
