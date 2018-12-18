package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateMovieDirector {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
		// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Director d = new Director();

		d.setDirectorId(1);
		d.setDirectorName("Director2");

		// Child objects

		Movie m1 = new Movie();
		m1.setMovieId(104);
		m1.setMovieName("3 idiot");
	

		Movie m2 = new Movie();
		m2.setMovieId(105);
		m2.setMovieName("Holiday");
	

		Movie m3 = new Movie();
		m3.setMovieId(106);
		m3.setMovieName("Up");
		

		// One to many
		
	 /*  Set s = new HashSet();
		 
		 s.add(m1); 
		 s.add(m2);
		 s.add(m3);
		  
		 d.setChildren(s);  */
		 

		m1.setParentObjects(d);
		m2.setParentObjects(d);
		m3.setParentObjects(d);   

		Transaction tx = session.beginTransaction();

	 // session.save(d);
		session.save(m1);
		session.save(m2);
		session.save(m3);   

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();
	}

}
