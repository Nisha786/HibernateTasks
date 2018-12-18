package com.hibernateMapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CourseAndLectureDelete {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession();

		Query qry = session.createQuery("from Lecture l");
		List l = qry.list();
		Iterator it = l.iterator();

		Transaction tx = session.beginTransaction();

		while (it.hasNext()) {

			Object o = it.next();
			Lecture s = (Lecture) o;
			session.delete(s);
		}
		tx.commit();

		session.close();
		System.out.println("many to one delete done..!!");
		f.close();
	}

}
