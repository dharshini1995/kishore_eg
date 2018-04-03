package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD {
	
	public static void main(String[] args) {
		System.out.println("Doing upate operation by passing id at runime");
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		System.out.print("Enter id");
		int tempId=sc.nextInt();
		sc.nextLine();
		Employee e=(Employee) s.get(Employee.class, tempId);
		if(e != null)
			
		{
			System.out.println("Old name"+e.getName());
			System.out.println("Enter name to update");
			String tempName=sc.nextLine();
			e.setName(tempName);
			System.out.println("New Name"+e.getName());
			
			s.update(e);
			tx.commit();
		}
		
		else
		{
			System.err.println("Sorry id"+ tempId +"not found");
		}
		s.close();
		sf.close();
		sc.close();
		
	}
	

}
