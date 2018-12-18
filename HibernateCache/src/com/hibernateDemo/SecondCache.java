package com.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondCache {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session s1 = f.openSession();
		for (int i = 0; i <= 4; i++) {

			Thread.sleep(5000);
			EmployeeData e = (EmployeeData) s1.load(EmployeeData.class, 7);
			System.out.println(e.getId() + "\t" + e.getFirstName() + "\t" + e.getLastName() + "\t" + e.getSalary());
		}
		s1.close();

		Session s2 = f.openSession();
		EmployeeData e2 = (EmployeeData) s2.load(EmployeeData.class, 8);
		System.out.println(e2.getSalary());
		System.out.println("Successfully Done");

		s2.close();

	}
}
