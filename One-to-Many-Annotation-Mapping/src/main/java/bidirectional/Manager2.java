package bidirectional;

import org.hibernate.Session;

import unidirectional.Util;

public class Manager2
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		Student st = (Student) s1.load(Student.class, 1);
		System.out.println(st.getFirstName());
		System.out.println(st.getLastName());
		
	}

}
