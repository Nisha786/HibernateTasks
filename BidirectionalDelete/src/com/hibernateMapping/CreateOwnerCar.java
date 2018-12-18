package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateOwnerCar {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
		// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Owner a = new Owner();

		a.setOwnerId(1);
		a.setOwnerName("Nisha");

		// Child objects

		Car c1 = new Car();
		c1.setCarId(101);
		c1.setCarName("BMW");

		Car c2 = new Car();
		c2.setCarId(102);
		c2.setCarName("Jaguar");

		Car c3 = new Car();
		c3.setCarId(103);
		c3.setCarName("Porsche");

		// One to many

		/*
		 * Set set = new HashSet();
		 * 
		 * set.add(c1); set.add(c2); set.add(c3);
		 * 
		 * a.setChildren(set);
		 */

		// Many to one

		c1.setParentObjects(a);
		c2.setParentObjects(a);
		c3.setParentObjects(a);

		Transaction tx = session.beginTransaction();

		// session.save(a);
		session.save(c1);
		session.save(c2);
		session.save(c3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();
	}

}
