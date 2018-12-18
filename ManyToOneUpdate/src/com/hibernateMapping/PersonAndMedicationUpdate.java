package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonAndMedicationUpdate {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session session = f.openSession();

		Person p = new Person(); // parent object
		p.setPersonId(1);
		p.setPersonName("Person1");

		Medication m1 = new Medication(); // Child object
		m1.setMedicationId(104);
		m1.setMedicationName("Medication4");
		m1.setParentObjects(p);

		Medication m2 = new Medication();
		m2.setMedicationId(105);
		m2.setMedicationName("Medication5");
		m2.setParentObjects(p);

		Transaction tx = session.beginTransaction();
		session.update(p);
		tx.commit();
		session.close();
		System.out.println("Many to One is done successfully.....!!");
		f.close();
	}

}
