package com.lara;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.hibernate.Session;

public class Manager11 
{
	public static void main(String[] args) 
	{
		Session s1=Util.getSession();
		FileReader fin=null;
		BufferedReader bin=null;
		
		try
		{
			fin=new FileReader("person.txt");
			bin=new BufferedReader(fin);
			String row=bin.readLine();
			Person p1=null;
			s1.beginTransaction();
			String[] Data;
			
			while(row!=null)
			{
				Data=row.split(",");
				p1=new Person();
				p1.setPersonId(Integer.parseInt(Data[0].trim()));
				p1.setFirstName(Data[1].trim());
				p1.setLastName(Data[2].trim());
				p1.setAge(Integer.parseInt(Data[3].trim()));
				s1.save(p1);
				row=bin.readLine();
			}
			s1.getTransaction().commit();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
		}
		System.out.println("done");
	}
}
