package com.hibernateDemo;

import java.util.Iterator;
import java.util.List;
import com.hibernateDemo.*;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class StoreData {

	public void orderBy(Session s) {
		Query query = s.createQuery("from Employee where FIRSTNAME like 'n%' order by LASTNAME");
		List list = query.list();
		Iterator iter = list.iterator(); // iterate list

		Employee e;

		while (iter.hasNext()) {
			e = (Employee) iter.next();

			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void count(Session s) {
		Query query = s.createQuery("select count(*) from Employee"); 																	// order
		List list = query.list();

		System.out.println(list.get(0));
	}

	public void and(Session s) {
		Query query = s.createQuery("from Employee where FIRSTNAME='Sahil' AND ID ='7'"); // Arrange

		List list = query.list();
		Iterator iter = list.iterator(); // iterate list

		Employee e;

		while (iter.hasNext()) {
			e = (Employee) iter.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void or(Session s) {
		Query query = s.createQuery("from Employee where LASTNAME='Ashish' OR ID ='5'"); 
		List list = query.list();
		Iterator iter = list.iterator(); // iterate list

		Employee e;

		while (iter.hasNext()) {
			e = (Employee) iter.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void not(Session s) {
		Query query = s.createQuery("from Employee where NOT LASTNAME = 'Soni'");
		List list = query.list();
		Iterator iter = list.iterator();

		Employee e;

		while (iter.hasNext()) {
			e = (Employee) iter.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void groupBy(Session s) {
		Query query = s.createQuery("from Employee where NOT LASTNAME = 'Ansari'");
		List list = query.list();
		Iterator iter = list.iterator();

		Employee e;

		while (iter.hasNext()) {
			e = (Employee) iter.next();
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName());
		}
	}

	public void table(Session s) {
		Query query = s.createSQLQuery("select ID, FIRSTNAME from Employee");
		List list = query.list();
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Object[] o;
			o = (Object[]) iter.next();
			Integer Id = (Integer) o[0];

			String firstName = (String) o[1];
			System.out.println(Id + "\t" + firstName);
		}
	}

	public void distinct(Session s) {
		Query query = s.createQuery("DISTINCT lastName from Employee");
		List list = query.list();
		Iterator iter = list.iterator();

		Employee e;

		while (iter.hasNext()) {
			e = (Employee) iter.next();
			System.out.println(e.getLastName());
		}
	}

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory(); // Load
																								// Factory

		Session s = sessionFactory.openSession(); // create session

		StoreData sd = new StoreData();

		//sd.orderBy(s);
		// sd.count(s);
		// sd.and(s);
		// sd.or(s);
		// sd.not(s);
		// sd.groupBy(s);
		// sd.table(s);
		sd.distinct(s);
		//sd.where(s);

		System.out.println("successfully Done");
		s.close();
	}

}
