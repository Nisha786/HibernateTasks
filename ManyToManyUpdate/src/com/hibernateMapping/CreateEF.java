package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateEF {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession();

	    Engineer e1 = new Engineer();
		e1.setEngineerId(101);
		e1.setEngineerName("Ayushi Kothari");

		Engineer e2 = new Engineer();
		e2.setEngineerId(102);
		e2.setEngineerName("Priya Kothari");

		Field f1 = new Field();
		f1.setFieldId(501);
		f1.setFieldName("Field1");

		Field f2 = new Field();
		f2.setFieldId(502);
		f2.setFieldName("Field2");

		Set s = new HashSet();
		s.add(f1);
		s.add(f2);

		e1.setFields(s);
		e2.setFields(s);

		Transaction tx = session.beginTransaction();

		session.save(e1);
		session.save(e2);

		tx.commit();

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		f.close();
	}

}
