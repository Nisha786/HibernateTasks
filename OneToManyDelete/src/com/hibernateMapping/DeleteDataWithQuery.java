package com.hibernateMapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDataWithQuery {

	public static void main(String[] args) {
		
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session s = f.openSession();
		
		Query qry =s.createQuery("from Manager m");
		List l=qry.list();
		Iterator it = l.iterator();

		Transaction tx = s.beginTransaction();

		while(it.hasNext())
		{

		Object o = it.next();
		Manager m = (Manager) o;
		s.delete(m);
		}

		tx.commit();

		s.close();
		System.out.println("One To Many is Done for deleting all parents with childs...!");
		f.close();
	}

}
