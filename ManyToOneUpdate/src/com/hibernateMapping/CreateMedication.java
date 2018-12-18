package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateMedication {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory(); // Load
		// Factory

		Session session = f.openSession(); // create session
		// Parent Object
		Person p = new Person();

		p.setPersonId(1);
		p.setPersonName("Person1");

		// Child objects

		Medication m1 = new Medication();
		m1.setMedicationId(101);
		m1.setMedicationName("Medication1");
		m1.setParentObjects(p);

		Medication m2 = new Medication();
		m2.setMedicationId(102);
		m2.setMedicationName("Medication2");
		m2.setParentObjects(p);

		Medication m3 = new Medication();
		m3.setMedicationId(103);
		m3.setMedicationName("Medication3");
		m3.setParentObjects(p);
		Transaction tx = session.beginTransaction();

		session.save(m1);
		session.save(m2);
		session.save(m3);

		tx.commit();
		session.close();
		System.out.println("Many To One is Done..!!");
		f.close();

	}

}
