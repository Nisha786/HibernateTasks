package com.hibernateDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserData {

	public void like(Session session) {
		Employee e;
		Query qry = session.getNamedQuery("findEmployeeByName");
		qry.setParameter("firstName", new String("Nisha"));
		List l = qry.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			e = (Employee) it.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}
	
	public void and(Session session) {
		Employee e;
		Query qry = session.getNamedQuery("findEmployeeByName");
		qry.setParameter("firstName", new String("Sahil"));
		qry.setParameter("lastName", new String("Ansari"));
		List l = qry.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			e = (Employee) it.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void orderBy(Session session) {
		Employee e;
		Query qry = session.getNamedQuery("MyName");
		List l = qry.list();
		Iterator it = l.iterator();
		
		while (it.hasNext()) {
			e = (Employee) it.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}
	
	public void or(Session session) {
		Employee e;
		Query qry = session.getNamedQuery("findEmployeeByName");
		qry.setParameter("firstName", new String("Sahil"));
		qry.setParameter("lastName", new String("Ansari"));
		List l = qry.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			e = (Employee) it.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		UserData sd = new UserData();


		sd.like(s);
		//sd.and(s);
		//sd.orderBy(s);
		//sd.or(s);
		s.close();
		sessionFactory.close();
	}

}
