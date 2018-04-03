package test;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("service");
		Employee employee = (Employee) context.getBean("EmployeeObject");

		Scanner sc=new Scanner(System.in);
		
		String name;
		int id;
		double salary;
		String designation;

		int options;
		
		
		do
		{
			System.out.println("Enter the options");
			System.out.println("1)	Add   2) Delete by Id  3) Display All  4) Update by id  5) Exit");
			 options=sc.nextInt();
			switch(options)
			{
		
				case 1:System.out.println("******** Employee Management System ******");
						System.out.println("Performing insert");
						System.out.println("Enter id");
						id=sc.nextInt();
						System.out.println("Enter name");
						name=sc.next();
						System.out.println("Enter salary");
						salary=sc.nextDouble();
						sc.nextLine();
						System.out.println("Enter designation");
						designation=sc.next();
						sc.nextLine();
						service.insert(employee);
						System.out.println("**** Employee information stored successfully**");
						System.out.println("******** Employee Management System ********");

						break;
					 
				case 2: System.out.println("Enter id");
					id=sc.nextInt();
					service.update(id);
					
					break;
		 
				case 3:
					List<Employee> employeeList = service.getEmployees();
					for(Employee e : employeeList) {
						System.out.println(e.getId()+ " "+e.getName()+" "+e.getSalary()+" "+e.getDesignation());
					}
					
					System.out.println("******** Employee Management System ********");

					break;

			
				case 4:
					
					System.out.println("Enter id");
				id=sc.nextInt();
				
				String o;
				o=sc.next();
				do{
					System.out.println("***A Sub menu to update the following***");
					System.out.println("(a)	Name	(b) Salary 	(c) Designation	(d) Exit");
					switch(o)
					{
					case "a":System.out.println("Enter name");
							name=sc.next();
							service.delete(id);
							break;
					case "b":System.out.println("Enter salary");
					salary=sc.nextDouble();
					service.delete(id);
					break;
					case "c":System.out.println("Enter designation");
					designation=sc.next();
					service.delete(id);
					break;
					case "d":break;
					}
					System.out.println("*** Sub menu exits***");
					System.out.println("******** Employee Management System ********");

					
					
				}while(o!="d");
				
				
				break;
				
		 
				case 5:System.out.println("***Main menu exits***");
						System.out.println("****Thank you for visiting*****");
					    break;
					 
		}
		
		}while(options!=5);
		

	}

}
