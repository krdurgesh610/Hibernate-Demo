package org.jspiders.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Employee e = new Employee();
		e.setId(35);
		e.setName("Pushpa");
		e.setDsg("Softwere Developer");
		e.setSalary(12345);
		e.setPhone(5548479L);
		e.setPassword("Srivalli");
		s.saveOrUpdate(e);
		Transaction t = s.beginTransaction();
		t.commit();
	}

}
