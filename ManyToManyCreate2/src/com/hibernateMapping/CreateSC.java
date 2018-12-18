package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateSC {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession();
		
		Transaction tx = session.beginTransaction();

		Stock s = new Stock();
		s.setStockId(201);
		s.setStockName("PADINI");

		Category c1 = new Category();
		c1.setCategoryId(501);
		c1.setName("Consumer");
		Category c2 = new Category();
		c2.setCategoryId(502);
		c2.setName("INVESTMENT");

		Set categories = new HashSet();
		categories.add(c1);
		categories.add(c2);

		s.setCategories(categories);

		session.save(s);

		tx.commit();
		System.out.println("Done");
		session.close();
	}

}
