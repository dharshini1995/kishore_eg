package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s= sf.openSession();
		/*String hibernateQuery="select obj  from pack.Employee obj where obj.salary>20000";
		Query query=s.createQuery(hibernateQuery);
		@SuppressWarnings("rawtypes")
		List list=query.list();
		@SuppressWarnings("rawtypes")
		Iterator it=list.iterator();
		while(it.hasNext())  {
			Employee e = (Employee) it.next();
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		
		System.out.println("To retrieve only names of the employee");
		String secondquery="select obj.name from pack.Employee obj ";
		Query query2=s.createQuery(secondquery);
		@SuppressWarnings("rawtypes")
		List list2=query2.list();
		@SuppressWarnings("rawtypes")
		Iterator it2=list2.iterator();
		while(it2.hasNext()) {
			String empNames = (String)it2.next();
			System.out.println(empNames);
		}*/
		
		String hql="select e.name,e.salary from pack.Employee e";
		Query query=s.createQuery(hql);
	
		List list=query.list();
	
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object[]obj=(Object [])it.next();
			String name=(String )obj[0];
			Double salary=(Double)obj[1];
			System.out.println("Name "+name+" Salary "+salary);
			
		}
		sf.close();
		s.close();
		}

}
