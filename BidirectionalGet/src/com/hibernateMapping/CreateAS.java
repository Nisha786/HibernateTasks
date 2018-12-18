package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateAS {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
		// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Artist a = new Artist();

		a.setArtistId(1);
		a.setArtistName("Artist1");

		// Child objects

		Song s1 = new Song();
		s1.setSongId(101);
		s1.setSongName("Song1");


		Song s2 = new Song();
		s2.setSongId(102);
		s2.setSongName("Song2");
		
		Song s3 = new Song();
		s3.setSongId(103);
		s3.setSongName("Song3");
		
		// One to many
		
		  Set set = new HashSet();
		  
		  set.add(s1); 
		  set.add(s2); 
		  set.add(s3);
		  
		  a.setChildren(set);
		 

	 /* s1.setParentObjects(a);
		s2.setParentObjects(a);
		s3.setParentObjects(a);    */

		Transaction tx = session.beginTransaction();

		session.save(a);
	/*	session.save(s1);
		session.save(s2);
		session.save(s3);   */

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();

	}

}
