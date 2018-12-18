package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateMH {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession();

		Mobile m1 = new Mobile();
		m1.setMid(101);
		m1.setMname("RedMi");

		Mobile m2 = new Mobile();
		m2.setMid(102);
		m2.setMname("Blackberry");

		Hotspot h1 = new Hotspot();
		h1.setHid(501);
		h1.setHname("abc");

		Hotspot h2 = new Hotspot();
		h2.setHid(502);
		h2.setHname("xyz");

		Set s = new HashSet();
		s.add(h1);
		s.add(h2);

		m1.setHotspots(s);
		m2.setHotspots(s);

		Transaction tx = session.beginTransaction();

		session.save(m1);
		session.save(m2);

		tx.commit();

		session.close();
		System.out.println("Many To Many Bi-Directional is Done..!!");
		f.close();

	}

}
