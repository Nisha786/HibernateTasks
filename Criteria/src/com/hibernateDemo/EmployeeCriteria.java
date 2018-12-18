package com.hibernateDemo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployeeCriteria {

	public void selectNotEqual(Session session) {
		EmployeeDTO ed;

		System.out.println(System.currentTimeMillis());

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		cri.add(Restrictions.ne("firstName", "Nisha"));
		List l = cri.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t" + ed.getSalary());

		}
		System.out.println(System.currentTimeMillis());
	}

	public void fSelect(Session session) {

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.property("id"));
		pl.add(Projections.property("firstName"));
		pl.add(Projections.property("lastName"));
		pl.add(Projections.property("salary"));
		cri.setProjection(pl);

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
		EmployeeDTO ed;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		cri.add(Restrictions.like("lastName", "s%"));

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName());

		}
	}

	public void whereLike(Session session) {
		EmployeeDTO ed;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		cri.add(Restrictions.like("firstName", "S%"));
		//cri.add(Restrictions.eq("id", 10));

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t"+ ed.getSalary());
		}
	}

	public void whereOR(Session session) {
		EmployeeDTO ed;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		cri.add(Restrictions.or(Restrictions.like("firstName", "Nisha"), Restrictions.eq("lastName", "Soni")));

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t"+ ed.getSalary());

		}
	}

	public void whereBetween(Session session) {
		EmployeeDTO ed;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		cri.add(Restrictions.between("salary", new Double(8000.0), new Double(23000.0)));

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t"+ ed.getSalary());
		}
	}

	public void orderBy(Session session) {
		EmployeeDTO ed;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		//cri.addOrder(Order.asc("firstName"));
		cri.addOrder(Order.desc("salary"));

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t"+ ed.getSalary());
		}
	}

	public void setFirstRecord(Session session) {

		EmployeeDTO ed;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		cri.setFirstResult(4);

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t" + ed.getSalary());
		}
	}

	public void setMaxRecord(Session session) {

		EmployeeDTO ed;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		cri.setMaxResults(4);

		List l = cri.list();
		Iterator it = l.iterator();
		while (it.hasNext()) {
			ed = (EmployeeDTO) it.next();
			System.out.println(ed.getId() + "\t" + ed.getFirstName() + "\t" + ed.getLastName() + "\t" + ed.getSalary());
		}
	}

	public void createAliases(Session session) {

		EmployeeDTO ed;
		Criteria cri = session.createCriteria(EmployeeDTO.class, "e");
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("id"));
		p.add(Projections.property("firstName"));
		p.add(Projections.property("lastName"));
		p.add(Projections.property("salary"));
		cri.setProjection(p);
		cri.createAlias("id", "id");
		cri.createAlias("first.Name", "firstName");
		cri.createAlias("last.Name", "lastName");
		cri.createAlias("salary", "Salary");

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

	public void count(Session session) {

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.count("id"));
		 pl.add(Projections.max("salary"));
		// pl.add(Projections.min("salary"));
		// pl.add(Projections.sum("salary"));
		cri.setProjection(pl);

		List l = cri.list();
		System.out.println("Count : " + l.get(0));
	}

	public void rowCount(Session session) {

		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.rowCount());
		cri.setProjection(pl);

		List l = cri.list();
		System.out.println("Count : " + l.get(0));
	}

	public void gourpBy(Session session) {

		Object obj;
		Criteria cri = session.createCriteria(EmployeeDTO.class);
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.rowCount()); // count(*)
		pl.add(Projections.groupProperty("firstName"));
		cri.setProjection(pl);
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

		EmployeeCriteria ec = new EmployeeCriteria();

		// ec.selectNotEqual(session);
		// ec.fSelect(session);
		// ec.where(session);
		// ec.whereLike(session);
		// ec.whereOR(session);
		// ec.whereBetween(session);
		// ec.orderBy(session);
		// ec.setFirstRecord(session);
		// ec.setMaxRecord(session);
		// ec.createAliases(session); //query Exception..we can create alias only for associations not for the fields of an association.
		// ec.count(session);
		// ec.rowCount(session);
		   ec.gourpBy(session);

		session.close();
	}
}
