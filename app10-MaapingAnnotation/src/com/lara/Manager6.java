package com.lara;

import java.util.Scanner;

import org.hibernate.Session;

public class Manager6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Session s1 = Util.getSession();
		Person p1 = null;
		s1.beginTransaction();
		do
		{
			p1 = new Person();
			System.out.println("enterId");
			p1.setPersonId(Integer.parseInt(sc.next()));
			System.out.println("enter FirstName");
			p1.setFirstName(sc.next());
			System.out.println("enter LastName");
			p1.setLastName(sc.next());
			System.out.println("enter age");
			p1.setAge(Integer.parseInt(sc.next()));
			s1.save(p1);
			System.out.println("do you want one more?(y/n)");
		}
		while("y".equals(sc.next()));
		{
			s1.getTransaction().commit();
			System.out.println("Task Completed.");
		}		
	}
}
