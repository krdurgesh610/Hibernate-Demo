package org.jspiders.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Employee e = s.get(Employee.class , 4);
		if(e!=null) {
			e.setName("XYZ");
			e.setDsg("Senior Softwere Developer");
			e.setSalary(1000000);
			e.setPhone(55488558);
			Transaction t = s.beginTransaction();
			t.commit();
		}
		else {
			System.err.println("Invalid Id");
		}
	}

}
