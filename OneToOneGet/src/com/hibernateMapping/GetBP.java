package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetBP {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();
		
		Object o = session.get(Publisher.class, new Integer(101));
		Publisher p = (Publisher)o;
		System.out.println(p.getPublisherName());
		
		Book b = p.getB();
		System.out.println(b.getBookName());
		
		session.close();
		System.out.println("One to One is Done..!!");
		f.close();
	}

}
