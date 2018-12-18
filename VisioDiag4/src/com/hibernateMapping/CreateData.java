package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Employee e = new Employee();

		e.setEid(1);
		e.setEname("Emp1");

		// Child objects

		Project p1 = new Project();
		p1.setPid(101);
		p1.setPname("Project1");

		Project p2 = new Project();
		p2.setPid(102);
		p2.setPname("Project2");

		Project p3 = new Project();
		p3.setPid(103);
		p3.setPname("Project3");
		// add child object to set, as 3rd party set in parent
		Set s = new HashSet();
		
		s.add(p1);
		s.add(p2);
		s.add(p3);

		e.setChildren(s);

		Transaction tx = session.beginTransaction();

		session.save(e);

		tx.commit();
		session.close();
		System.out.println("One To Many is Done..!!");
		f.close();
	}

}
