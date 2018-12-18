package com.hibernateDemo;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Clientprogram {

	public static void main(String[] args) throws Exception {

		Product e = new Product();
		e.setId(0);
		e.setFirstName("Nisha");
		e.setLastName("Ansari");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.update(e);
		tx.commit();

		System.out.println("Object Updated successfully.....!!");
		session.close();
	}

}