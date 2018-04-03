package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springtest {
	
	

	public static void main(String [] args)
	{
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Resataurent r =(Resataurent)context.getBean("restaurentObject");
    ((AbstractApplicationContext)context).registerShutdownHook();
    
    r.greetCustomer();
	}
}
