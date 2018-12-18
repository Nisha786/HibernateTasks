package com.hibernateDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestData {

	public void like(Session session) {
		EmployeeN e;
		Query qry = session.getNamedQuery("findEmployeeByName");
		qry.setParameter("firstName", new String("a%"));
		List l = qry.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			e = (EmployeeN) it.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void and(Session session) {
		EmployeeN e;
		Query qry = session.getNamedQuery("findEmployeeByName");
		qry.setParameter("firstName", new String("Sahil"));
		qry.setParameter("lastName", new String("Ansari"));
		List l = qry.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			e = (EmployeeN) it.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void orderBy(Session session) {
		EmployeeN e;
		Query qry = session.getNamedQuery("findEmployeeByName");

		List l = qry.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			e = (EmployeeN) it.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void or(Session session) {
		EmployeeN e;
		Query qry = session.getNamedQuery("findEmployeeByName");
		qry.setParameter("firstName", new String("Sahil"));
		qry.setParameter("lastName", new String("Ansari"));
		List l = qry.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			e = (EmployeeN) it.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void groupBy(Session s) {
		Query qry = s.getNamedQuery("findEmployeeByName");
		List list = qry.list();
		Iterator iter = list.iterator();

		while (iter.hasNext()) {
			Object[] o;
			o = (Object[]) iter.next();
			Integer id = (Integer)o[0];
			String firstName = (String)o[1];
			String lastName = (String) o[2];
	
			System.out.println(id+"\t"+firstName + "\t" + lastName);
		}
	}

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session s = sessionFactory.openSession();
		TestData sd = new TestData();

		// sd.like(s);
		// sd.and(s);
		// sd.orderBy(s);
		// sd.or(s);
		sd.groupBy(s);
		s.close();
		sessionFactory.close();
	}

}
