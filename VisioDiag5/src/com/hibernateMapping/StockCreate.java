package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StockCreate {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
																					// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Stock s = new Stock();

		s.setStockId(1);
		s.setStockName("Stock1");

		// Child objects

		StockRecord r1 = new StockRecord();
		r1.setRecordId(101);
		r1.setRecordName("Record1");
		r1.setParentObjects(s);

		StockRecord r2 = new StockRecord();
		r2.setRecordId(102);
		r2.setRecordName("Record2");
		r2.setParentObjects(s);

		Transaction tx = session.beginTransaction();

		session.save(r1);
		session.save(r2);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();

	}

}
