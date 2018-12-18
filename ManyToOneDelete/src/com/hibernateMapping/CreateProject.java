package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateProject {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession(); 
		// Parent Object
		Project p = new Project();

		p.setProjectId(1);
		p.setContactName("Contact1");

		// Child objects

		StakeHolder s1 = new StakeHolder();
		s1.setContactId(101);
		s1.setRollName("Roll1");
		s1.setParentObjects(p);

		StakeHolder s2 = new StakeHolder();
		s2.setContactId(102);
		s2.setRollName("Roll2");
		s2.setParentObjects(p);

		StakeHolder s3 = new StakeHolder();
		s3.setContactId(103);
		s3.setRollName("Roll3");
		s3.setParentObjects(p);

		Transaction tx = session.beginTransaction();

		session.save(s1);
		session.save(s2);
		session.save(s3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();
	}

}
