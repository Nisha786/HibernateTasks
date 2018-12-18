package com.hibernateMapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdatePP {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Object o = session.get(Person.class, new Integer(201));
		Person p = (Person) o;
		p.setPersonName("Nisha");
		Passport b = p.getP();
		b.setPassportName("Passport2");
		
		Transaction tx = session.beginTransaction();

		session.update(p);
		tx.commit();
		session.close();
		System.out.println("One To one is Done for updating all parents with childs...!");
		f.close();

	}
}
