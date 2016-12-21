package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Manager5 
{

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setPersonId(101);
		p1.setFirstName("Shahzad");
		p1.setLastName("Alam");
		p1.setAge(22);
		
		Configuration c1 = new Configuration();
		c1.configure();
		SessionFactory sf = c1.buildSessionFactory();
		Session s2 = sf.openSession();
		
		s2.beginTransaction();
		s2.save(p1);
		s2.getTransaction().commit();
		s2.flush();
		s2.close();
		System.out.println("done");
	}
}
