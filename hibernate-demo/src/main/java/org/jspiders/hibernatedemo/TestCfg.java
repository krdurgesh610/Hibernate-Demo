package org.jspiders.hibernatedemo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestCfg {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
//		cfg.configure();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
	}
}