package unidirectional;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		Student st = new Student();
		st.setFirstName("Shahzad");
		st.setLastName("Hussain");
		
		Mail m1 = new Mail();
		m1.setUsername("hussainshahzad");
		m1.setPassword("india123");
		m1.setStudent(st);
		
		Mail m2 = new Mail();
		m2.setUsername("hussainshahzad255");
		m2.setPassword("india123");
		m2.setStudent(st);
		//st.setMails(new Mail[]{m1,m2});
		
		Transaction tx = s1.beginTransaction();
		s1.persist(st);
		s1.persist(m1);
		s1.persist(m2);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
