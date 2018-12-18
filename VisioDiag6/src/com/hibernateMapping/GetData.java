package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession(); // create session

		Object o = session.get(Accountant.class, new Integer(103));
		Accountant b = (Accountant) o;
		System.out.println(b.getAccountantId() + "\t" + b.getAccountantName());
		Account a = b.getParentObjects();
		System.out.println(a.getAccountId() + "\t" + a.getAccountName());

		session.close();
		System.out.println("many to one select is done..!!");
		f.close();
	}

}
