package com.hibernateDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TestData {

	public void fSelect(Session session) {

		DetachedCriteria dcrit = DetachedCriteria.forClass(EmployeeDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("id"));
		p.add(Projections.property("firstName"));
		p.add(Projections.property("lastName"));
		p.add(Projections.property("salary"));
		dcrit.setProjection(Projections.id());
		List l = dcrit.getExecutableCriteria(session).list();
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
	
	public void whereLike(Session session) {
		EmployeeDTO ed;
		DetachedCriteria dcrit = DetachedCriteria.forClass(EmployeeDTO.class);
		//dcrit.add(Restrictions.like("firstName", "S%"));
		dcrit.add(Restrictions.eq("id", 10));

		List l = dcrit.getExecutableCriteria(session).list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t"+ ed.getSalary());
		}
	}
	
	public void orderBy(Session session) {
		EmployeeDTO ed;
		DetachedCriteria dcrit = DetachedCriteria.forClass(EmployeeDTO.class);
		//dcrit.addOrder(Order.asc("firstName"));
		dcrit.addOrder(Order.desc("salary"));

		List l = dcrit.getExecutableCriteria(session).list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t"+ ed.getSalary());
		}
	}
	
	public void setFirstResults(Session session) {
		EmployeeDTO ed;
		DetachedCriteria dcrit = DetachedCriteria.forClass(EmployeeDTO.class);
		//dcrit.addOrder(Order.asc("firstName"));
		//dcrit.setFirstResults(5); // cast error
		//dcrit.setMaxResults(5); // cast error

		List l = dcrit.getExecutableCriteria(session).list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t"+ ed.getSalary());
		}
	}
	
	public void whereBetween(Session session) {
		EmployeeDTO ed;
		DetachedCriteria dcrit = DetachedCriteria.forClass(EmployeeDTO.class);
		dcrit.add(Restrictions.between("salary", new Double(8000.0), new Double(23000.0)));

		List l = dcrit.getExecutableCriteria(session).list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t"+ ed.getSalary());
		}
	}

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		TestData td = new TestData();

		//td.fSelect(session);
		//td.whereLike(session);
		//td.orderBy(session);
		//td.setFirstResults(session);
		  td.whereBetween(session);
		  session.close();
	}
}
