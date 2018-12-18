package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); 

		Session session = f.openSession(); 
		// Parent Object
		Student s = new Student();

		s.setStudentId(1);
		s.setStudentName("Nisha");

		// Child objects

		Address a1 = new Address();
		a1.setAddrId(101);
		a1.setCity("Indore");
		a1.setParentObjects(s);

		Address a2 = new Address();
		a2.setAddrId(102);
		a2.setCity("Pune");
		a2.setParentObjects(s);
		
		Address a3 = new Address();
		a3.setAddrId(103);
		a3.setCity("Banglore");
		a3.setParentObjects(s);
		
		Transaction tx = session.beginTransaction();

		session.save(a1);
		session.save(a2);
		session.save(a3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();
	}

}
