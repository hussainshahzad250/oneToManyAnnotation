package com.lara;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class Manager13 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Query qry = s1.createQuery("from Person");
		
		List<Person> person = qry.list();
		for(Person p1 : person)
		{
			System.out.println();
			System.out.print(p1.getPersonId() + ", ");
			System.out.print(p1.getFirstName() + ", ");
			System.out.print(p1.getLastName() + ", ");
			System.out.println(p1.getAge() + ", ");
			System.out.println();
			System.out.println("+++++++++++++++++++++++");
			System.out.println();
		}
	}
}
