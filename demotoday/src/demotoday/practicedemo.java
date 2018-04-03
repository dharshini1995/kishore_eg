package demotoday;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class practicedemo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		practice p=(practice)context.getBean("sample");
		practiceservice service=(practiceservice) context.getBean("service");
		 Scanner sc=new Scanner(System.in);
		 /*System.out.println("Enter name");
		 String name=sc.next();
		 p.setName(name);
		 System.out.println("Enter age");
		 int age=sc.nextInt();
		 p.setAge(age);
		service.insert(p);
		
		List<practice> list=service.displayAll();
		for(practice p1: list) {
			System.out.println(p1.getName()+ " "+p1.getAge()+" ");
		}
		
		System.out.println("****Deletion operation****");
		System.out.println("Enter name");
		String name1=sc.next();
		p.setName(name1);
		service.delete(p);
		System.out.println("Deletion completed");*/
		
		System.out.println("Updation ");
		System.out.println("Enter name for updation");
		p.setName(sc.next());
		System.out.println("Enter salary for updation");
		float s=sc.nextFloat();	
		//service.update();
		System.out.println("Enter designation");
		p.setDesignation(sc.next());
		service.update(p);
		

		
	}

}
