package com.hibernateDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpData {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); // Load Factory

		Session s = sessionFactory.openSession(); // create session
		Transaction t = s.beginTransaction();

		Query query = s.createQuery("from Employee4 where FIRSTNAME like 'n%'");// fetch all data start from n
		List list = query.list();
		Iterator iter = list.iterator(); // iterate list

		Employee4 e;

		while (iter.hasNext()) {
			e = (Employee4) iter.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}

		t.commit();
		System.out.println("successfully Done");
		s.close();
	}

}
