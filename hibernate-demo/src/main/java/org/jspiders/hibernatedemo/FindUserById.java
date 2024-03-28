package org.jspiders.hibernatedemo;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FindUserById {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee id to print the detail");
		int id = sc.nextInt();
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		Employee e = s.get(Employee.class,id);
		if(e!=null) {
			System.out.println("Employee ID:"+e.getId());
			System.out.println("Employee Name:"+e.getName());
			System.out.println("Employee Salary:"+e.getSalary());
			System.out.println("Employee Phone:"+e.getPhone());
			System.out.println("Employee Designation:"+e.getDsg());
		}
		else {
			System.err.println("You have enterd an invalid Employee ID");
		}
		
	}

}
