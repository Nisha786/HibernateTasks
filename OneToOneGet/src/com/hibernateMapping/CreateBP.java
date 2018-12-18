package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateBP {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Book b = new Book();
		b.setBookId(101);
		b.setBookName("The Secret");

		Publisher p = new Publisher();
		p.setPublisherId(501);
		p.setPublisherName("Rhonda Byrne");
		p.setB(b);

		Transaction tx = session.beginTransaction();

		session.save(p);

		tx.commit();

		session.close();
		System.out.println("One to One is Done..!!");
		f.close();
	}

}
