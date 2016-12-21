package unidirectional;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		Student st = new Student();
		st.setId(1);
		st.setFirstName("Shahzad");
		st.setLastName("Hussain");
		Address add = new Address();
		add.setHouseNo("123/T");
		add.setStreetName("Sahebganj");
		add.setStudent(st);
		Transaction tx = s1.beginTransaction();
		s1.persist(st);
		s1.save(add);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}

}
