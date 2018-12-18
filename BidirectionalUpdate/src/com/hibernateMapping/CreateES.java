package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateES {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load Factory

		Session session = f.openSession(); // create session
		
		ElectronicComponent e = new ElectronicComponent(); // Parent Object

		e.setEid(1);
		e.setEname("Board");

		// Child objects

		Switch s1 = new Switch();
		s1.setSid(101);
		s1.setSname("S1");

		Switch s2 = new Switch();
		s2.setSid(102);
		s2.setSname("S2");

		Switch s3 = new Switch();
		s3.setSid(103);
		s3.setSname("S3");

		// One to many

		
	/*	  Set set = new HashSet();
		  
		  set.add(s1); 
		  set.add(s2); 
		  set.add(s3);
		  
		  e.setChildren(set);   */
		 

		// Many to one

		s1.setParentObjects(e);
		s2.setParentObjects(e);
		s3.setParentObjects(e);   

		Transaction tx = session.beginTransaction();

  //	session.save(e);
        session.save(s1);
		session.save(s2);
		session.save(s3); 

		tx.commit();
		session.close();
	//	System.out.println("One To Many is Done..!!");
		System.out.println("Many To One is Done..!!");
		f.close();

	}

}
