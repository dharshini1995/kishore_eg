package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		/*Identifier  id= (Identifier) context.getBean("b1");
         id.display();*/
         /*Identifier  id1= (Identifier) context.getBean("b2");
         id1.display();*/
         
         /*Customer c=(Customer )context.getBean("c1");
         c.getInformation();*/
		
		Address address=(Address) context.getBean("b2");
		Bank bank1= (Bank) context.getBean("bank");
		System.out.println(bank1.getLocations());

	}

	
	

}
