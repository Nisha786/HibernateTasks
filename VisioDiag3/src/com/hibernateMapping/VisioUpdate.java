package com.hibernateMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VisioUpdate {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Student s = new Student(); // parent object
		s.setSid(1);
		s.setSname("Student1");

		StudentFees f1 = new StudentFees(); // Child object
		f1.setFeeId(103);
		f1.setBatch("C");

		StudentFees f2 = new StudentFees(); 
		f2.setFeeId(104);
		f2.setBatch("D");
		
		Set set = new HashSet();

		set.add(f1);
		set.add(f2);

		s.setChildren(set);

		Transaction tx = session.beginTransaction();
		session.update(s);
		tx.commit();
		session.close();
		System.out.println("One to many is done successfully.....!!");
		f.close();
	}

}
