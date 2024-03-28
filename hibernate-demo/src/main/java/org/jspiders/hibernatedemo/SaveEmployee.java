package org.jspiders.hibernatedemo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setDsg("Software Engineer");
		e.setName("Ram");
		e.setPhone(12345L);
		e.setSalary(4567.25);
		e.setPassword("abc1123");
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		int id = (int) s.save(e);
		Transaction t = s.beginTransaction();
		t.commit();
		System.out.println("Employee Saved with id:-"+id);
	}
}
