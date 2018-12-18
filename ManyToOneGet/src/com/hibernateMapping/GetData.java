package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession(); // create session

		Object o = session.get(Department.class, new Integer(103));
		Department d = (Department) o;
		System.out.println(d.getDepartmentId() + "\t" + d.getDepartmentName());
		Company c = d.getParentObjects();
		System.out.println(c.getCompanyId() + "\t" + c.getCompanyName());

		session.close();
		System.out.println("many to one select is done..!!");
		f.close();
	}

}
