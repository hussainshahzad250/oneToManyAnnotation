package unidirectional;

import org.hibernate.Session;

public class Manager2
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		
		Student st = (Student) s1.get(Student.class, 1);
		System.out.println(st.getId());
		System.out.println(st.getFirstName());
		System.out.println(st.getLastName());
		
		/*Address add = (Address) s1.load(Address.class, 1);
		System.out.println(add.getAddressId());
		System.out.println(add.getHouseNo());
		System.out.println(add.getStreetName());
		System.out.println("Student ID = " + add.getStudent().getId());
		System.out.println("First name =" + add.getStudent().getFirstName());
		System.out.println("Last Name = " + add.getStudent().getLastName());*/
	}

}
