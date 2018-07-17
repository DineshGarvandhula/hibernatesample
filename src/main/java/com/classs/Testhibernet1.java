package com.classs;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.hiber.Testhibernet;

public class Testhibernet1 {
	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure("hibernet.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
            System.out.println("Started");
		Testhibernet test = new Testhibernet();
		test.setId(10);
		test.setName("Suresh");
		test.setMarks("925");
		test.setSchool("sandaya school");
		session.save(test);
		
	session.beginTransaction().commit();
	System.out.println("hello");

	}

}
