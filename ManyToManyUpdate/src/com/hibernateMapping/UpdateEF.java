package com.hibernateMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEF {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
        Session session = f.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    Field f1 = (Field)session.get(Field.class, 502);
	    f1.setFieldName("Civil");
	
	    session.update(f1);
	    tx.commit();
	    System.out.println("Successfully Done Update Many To Many...!!");
	    session.close();
	}

}
