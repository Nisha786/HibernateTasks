package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateDP {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory(); 

		Session session = f.openSession(); 
		// Parent Object
		Department d = new Department();

		d.setDid(1);
		d.setDname("Department");

		// Child objects

		Professor p1 = new Professor();
		p1.setPid(101);
		p1.setPname("Professor1");

		Professor p2 = new Professor();
		p2.setPid(102);
		p2.setPname("Professor2");

		Professor p3 = new Professor();
		p3.setPid(103);
		p3.setPname("Professor3");

		// One to many

	/*	Set set = new HashSet();

		set.add(p1);
		set.add(p2);
		set.add(p3);

		d.setProfessor(set);   */

	// Many to one
		
		 p1.setParentObjects(d); 
		 p2.setParentObjects(d);
		 p3.setParentObjects(d);
		 

		Transaction tx = session.beginTransaction();

	//	session.save(d);
		
		 session.save(p1); 
		 session.save(p2); 
		 session.save(p3);
		 

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();
	}

}
