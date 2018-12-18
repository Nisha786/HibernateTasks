package com.hibernateMapping;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession(); // create session

		Object o = session.get(Employee.class, new Integer(1));
		Employee e = (Employee) o;
		System.out.println(e.getEid());
		System.out.println(e.getEname());

		Set s = e.getChildren();
		Iterator it = s.iterator();

		while (it.hasNext()) {

			Object o1 = it.next();
			Project p = (Project) o1;
			System.out.println("---------------------------");
			System.out.println("Customer objects...");
			System.out.println("---------------------------");
			System.out.println(p.getPid() + "\t" + p.getPname() + "\t" + p.getForevenId());
			System.out.println("---------------------------");
		}

		session.close();
		System.out.println("One To Many is Done for selecting.....!");
		f.close();

	}

}
