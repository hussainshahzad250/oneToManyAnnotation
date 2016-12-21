package bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Student
{
	@Id
	private int id;
	private String firstName;
	private String lastName;
	@OneToOne(cascade=CascadeType.ALL)
	private Address permanentAddress;
	
	public Address getPermanentAddress()
	{
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress)
	{
		this.permanentAddress = permanentAddress;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
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
	

}
