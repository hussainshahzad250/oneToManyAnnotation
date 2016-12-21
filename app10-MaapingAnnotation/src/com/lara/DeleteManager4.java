package com.lara;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteManager4 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Person p1 = (Person) s1.load(Person.class, 101);
		Transaction tx = s1.beginTransaction();
		s1.delete(p1);
		tx.commit();
		System.out.println("done");
	}

}
