package com.hibernateMapping;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SLDelete {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();
		
		Query qry = session.createQuery("from School s");
		List l = qry.list();
		Iterator it = l.iterator();

		Transaction tx = session.beginTransaction();

		while (it.hasNext()) {

			Object o = it.next();
			School s = (School) o;
			session.delete(s);
		}

		tx.commit();

		session.close();
		System.out.println("One To Many is Done for deleting all parents with childs...!");
		f.close();

	}
}
