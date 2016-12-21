package com.lara;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person1")
public class Person
{
	@Id
	@Column(name = "p_id")
	private int PersonId;
	@Column(name = "fist_Name")
	private String firstName;
	private String lastName;
	private int age;

	public int getPersonId()
	{
		return PersonId;
	}

	public void setPersonId(int personId)
	{
		PersonId = personId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
