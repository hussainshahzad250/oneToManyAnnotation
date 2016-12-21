package com.lara;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
public class Manager12 
{
	public static void main(String[] args) 
	{
		Session s1 = Util.getSession();
		Criteria ctr = s1.createCriteria(Person.class);
		//ctr.add(Restrictions.idEq(1));
		
		/*Criterion c1 = Restrictions.idEq(1);
		ctr.add(c1);*/
		List<Person> person = ctr.list();	
		for(Person p1 : person)
		{
			System.out.println();
			System.out.print(p1.getPersonId() + ", ");
			System.out.print(p1.getFirstName() + ", ");
			System.out.print(p1.getLastName() + ", ");
			System.out.println(p1.getAge() + ", ");
			System.out.println("************************");
		}
	}
}
