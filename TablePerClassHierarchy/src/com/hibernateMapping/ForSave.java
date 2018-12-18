package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ForSave {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();

		Session session = f.openSession();
		
		CreditCard c=new CreditCard();

        c.setPaymentId(10);
        c.setAmount(2500);
        c.setCreditCardType("Visa");

        Cheque c1=new Cheque();

        c1.setPaymentId(11);
        c1.setAmount(2600);
        c1.setChequeType("ICICI");

        Transaction tx = session.beginTransaction();
        session.save(c);
        session.save(c1);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        f.close();
	}

}
