package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager 
{

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setId(101);
		p1.setFirstName("Shahzad");
		
		Person p2 = new Person();
		p2.setId(102);
		p2.setFirstName("Rahul");

		Person p3 = new Person();
		p3.setId(103);
		p3.setFirstName("Ejaz");
		
		Person p4 = new Person();
		p4.setId(104);
		p4.setFirstName("Sami");
		
		Configuration c1 = new Configuration();
		c1.configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s1 = sf.openSession();
		
		s1.beginTransaction();
		s1.save(p1);
		s1.save(p2);
		s1.save(p3);
		s1.save(p4);
		s1.getTransaction().commit();
		System.out.println("done");
	}
}
