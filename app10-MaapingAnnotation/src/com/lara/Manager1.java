package com.lara;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();

		Person p1 = new Person();
		p1.setPersonId(100);
		p1.setFirstName("Shahzad");
		p1.setLastName("Hussain");
		p1.setAge(25);
		Person p2 = new Person();
		p2.setPersonId(102);
		p2.setFirstName("EJAZ");
		p2.setLastName("Kumar");
		p2.setAge(25);
		// s1.beginTransaction();
		Transaction tx = s1.beginTransaction();

		s1.save(p1);
		s1.save(p2);
		tx.commit();
		// s1.getTransaction().commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}

}
