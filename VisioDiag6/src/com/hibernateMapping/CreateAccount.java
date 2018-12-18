package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateAccount {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
																					// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Account a = new Account();

		a.setAccountId(1);
		a.setAccountName("Account1");

		// Child objects

		Accountant b1 = new Accountant();
		b1.setAccountantId(101);
		b1.setAccountantName("Ac1");
		b1.setParentObjects(a);

		Accountant b2 = new Accountant();
		b2.setAccountantId(102);
		b2.setAccountantName("Ac2");
		b2.setParentObjects(a);

		Accountant b3 = new Accountant();
		b3.setAccountantId(103);
		b3.setAccountantName("Ac3");
		b3.setParentObjects(a);

		Transaction tx = session.beginTransaction();

		session.save(b1);
		session.save(b2);
		session.save(b3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();

	}

}
