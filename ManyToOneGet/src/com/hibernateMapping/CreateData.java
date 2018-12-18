package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
		// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Company c = new Company();

		c.setCompanyId(1);
		c.setCompanyName("TCS");

		// Child objects

		Department d1 = new Department();
		d1.setDepartmentId(101);
		d1.setDepartmentName("A");
		d1.setParentObjects(c);

		Department d2 = new Department();
		d2.setDepartmentId(102);
		d2.setDepartmentName("B");
		d2.setParentObjects(c);

		Department d3 = new Department();
		d3.setDepartmentId(103);
		d3.setDepartmentName("C");
		d3.setParentObjects(c);

		Transaction tx = session.beginTransaction();

		session.save(d1);
		session.save(d2);
		session.save(d3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();

	}

}
