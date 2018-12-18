package com.hibernaDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.hibernaDemo.EmployeeDTO;

public class TestData {

	public void like(Session session) {

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("id"));
		pl.add(Projections.property("firstName"));
		pl.add(Projections.property("lastName"));
		pl.add(Projections.property("salary"));
		cri.setProjection(pl);
		cri.add(Restrictions.like("lastName", "s%"));

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {

			Object[] obj = (Object[]) it.next();

			Integer id = (Integer) obj[0];
			String firstName = (String) obj[1];
			String lastName = (String) obj[2];
			Double salary = (Double) obj[3];
			System.out.println(id + "\t" + firstName + "\t" + lastName + "\t" + salary);
		}
	}
	public void where(Session session) {

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("id"));
		pl.add(Projections.property("firstName"));
		pl.add(Projections.property("lastName"));
		//pl.add(Projections.property("salary"));
		cri.setProjection(pl);
		cri.add(Restrictions.like("lastName", "Ansari"));

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {

			Object[] obj = (Object[]) it.next();

			Integer id = (Integer) obj[0];
			String firstName = (String) obj[1];
			String lastName = (String) obj[2];
			//Double salary = (Double) obj[3];
			System.out.println(id + "\t" + firstName + "\t" + lastName);
		}
	}
	
	public void between(Session session) {

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("id"));
		pl.add(Projections.property("firstName"));
		pl.add(Projections.property("lastName"));
		pl.add(Projections.property("salary"));
		cri.setProjection(pl);
		cri.add(Restrictions.between("salary",10000.0 ,23000.0));

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {

			Object[] obj = (Object[]) it.next();

			Integer id = (Integer) obj[0];
			String firstName = (String) obj[1];
			String lastName = (String) obj[2];
			Double salary = (Double) obj[3];
			System.out.println(id + "\t" + firstName + "\t" + lastName + "\t" + salary);
		}
	}
	
	public void setMaxResults(Session session) {

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("id"));
		pl.add(Projections.property("firstName"));
		pl.add(Projections.property("lastName"));
		pl.add(Projections.property("salary"));
		cri.setProjection(pl);
		cri.setMaxResults(5);
		
		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {

			Object[] obj = (Object[]) it.next();

			Integer id = (Integer) obj[0];
			String firstName = (String) obj[1];
			String lastName = (String) obj[2];
			Double salary = (Double) obj[3];
			System.out.println(id + "\t" + firstName + "\t" + lastName + "\t" + salary);
		}
	}
	
	public void setFirstResults(Session session) {

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("id"));
		pl.add(Projections.property("firstName"));
		pl.add(Projections.property("lastName"));
		pl.add(Projections.property("salary"));
		cri.setProjection(pl);
		cri.setFirstResult(5);
		
		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {

			Object[] obj = (Object[]) it.next();

			Integer id = (Integer) obj[0];
			String firstName = (String) obj[1];
			String lastName = (String) obj[2];
			Double salary = (Double) obj[3];
			System.out.println(id + "\t" + firstName + "\t" + lastName + "\t" + salary);
		}
	}
	
	public void gourpBy(Session session) {

		Object obj;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.groupProperty("firstName"));
		cri.setProjection(pl);
		cri.setMaxResults(5);
		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			obj = (Object) it.next();
			String FirstName = (String) obj;
			System.out.println("FirstName : " + FirstName);
		}
	}
	
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		TestData td = new TestData();

		//td.like(session);
		//td.where(session);
		//td.between(session);
		//td.setFirstResults(session);
		//td.setMaxResults(session);
		td.gourpBy(session);
	}

}
