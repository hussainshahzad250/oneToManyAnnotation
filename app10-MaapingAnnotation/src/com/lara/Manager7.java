package com.lara;

import org.hibernate.Session;

public class Manager7 
{
	public static void main(String[] args) 
	{
		Session s1 = (Session) Util.getSession();
		Person p1 = (Person) s1.load(Person.class, 1);
		System.out.println("==================================");
		System.out.print(p1.getPersonId() + ", ");
		System.out.print(p1.getFirstName() + ", ");
		System.out.print(p1.getLastName() + ", ");
		System.out.println(p1.getAge());
		System.out.println("done");
		
	}

}
