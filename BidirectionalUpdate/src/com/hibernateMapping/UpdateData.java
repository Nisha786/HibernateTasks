package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		ElectronicComponent e = new ElectronicComponent(); // parent object
		e.setEid(1);
		e.setEname("Board");

		Switch s1 = new Switch(); // Child object
		s1.setSid(104);
		s1.setSname("Switch1");

		Switch s2 = new Switch(); 
		s2.setSid(105);
		s2.setSname("Switch2");

		Set s = new HashSet();

		s.add(s1);
		s.add(s2);

		e.setChildren(s);

		Transaction tx = session.beginTransaction();
		session.update(e);
		tx.commit();
		session.close();
		System.out.println("One to many is done successfully.....!!");
		f.close();
	}

}
