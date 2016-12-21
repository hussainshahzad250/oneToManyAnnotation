package bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Address")
@GenericGenerator(name="gen",strategy="foreign",parameters=@Parameter(name="property",value="student"))

public class Address
{
	@Id
	@GeneratedValue(generator="gen")
	private int addressid;
	private String houseNo;
	private String streetName;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Student student;
	
	public int getAddressid()
	{
		return addressid;
	}
	public void setAddressid(int addressid)
	{
		this.addressid = addressid;
	}
	public String getHouseNo()
	{
		return houseNo;
	}
	public void setHouseNo(String houseNo)
	{
		this.houseNo = houseNo;
	}
	public String getStreetName()
	{
		return streetName;
	}
	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}
	public Student getStudent()
	{
		return student;
	}
	public void setStudent(Student student)
	{
		this.student = student;
	}
	
}
