package com.hibernateMapping;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetMH {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession(); // create session

		Object o = session.get(Mobile.class, new Integer(101));
		Mobile m = (Mobile) o;
		System.out.println(m.getMid() + "\t" + m.getMname());

		Set s = m.getHotspots();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			Object o1 = it.next();
			Hotspot h = (Hotspot) o1;

			System.out.println("---------------------------");
			System.out.println(h.getHid() + "\t" + h.getHname());
			System.out.println("---------------------------");
		}

		session.close();
		System.out.println("One To Many is Done for selecting.....!");
		f.close();

	}

}
