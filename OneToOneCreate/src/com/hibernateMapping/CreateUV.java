package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateUV {

	public static void main(String[] args) {

		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Vehicle v = new Vehicle();
		v.setVehicleId(100);
		v.setVehicleName("Car");

		User u = new User();
		u.setUserid(506);
		u.setUserName("Jarry");
		u.setV(v);

		Transaction tx = session.beginTransaction();

		session.save(u);

		tx.commit();

		session.close();
		System.out.println("One to One is Done..!!");
		f.close();
	}

}
