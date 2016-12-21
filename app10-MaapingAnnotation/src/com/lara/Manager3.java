package com.lara;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager3
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		Person p1 = (Person) s1.load(Person.class, 102);
		p1.setFirstName("Suman");
		p1.setAge(25);
		Transaction tx = s1.beginTransaction();
		s1.update(p1);
		tx.commit();
		System.out.println("done");
	}
}
