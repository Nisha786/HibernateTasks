package com.hibernateMapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		System.out.println("Product Name Filter");
		System.out.println("-------------------");

		// enabling the proname filter
		session.enableFilter("proname");
		Query query = session.createQuery("from Product p");
		List list = query.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Product p = (Product) it.next();
			System.out.println("Products Name which starting with 'c' : " + p.getProname());
		}

		// disabling the proname filter after the operation
		session.disableFilter("proname");
		System.out.println("price Filter");
		System.out.println("-------------------");
		// enabling the price filter
		Filter filter = session.enableFilter("priceFilter");
		filter.setParameter("price", 1000);
		Query query2 = session.createQuery("from Product p");
		List list2 = query2.list();
		Iterator it2 = list2.iterator();
		while (it2.hasNext()) {
			Product p = (Product) it2.next();
			System.out.println("proname whose prices are  >= 10000 : " + p.getProname());
		}

		// disabling the price filter after the operation
		session.disableFilter("priceFilter");

		session.clear();
		session.close();
	}

}
