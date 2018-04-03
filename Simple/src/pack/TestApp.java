package pack;

public class TestApp {
	public static void main(String[] args) {
		System.out.println("Welcome to eclipse");
		for(String s:args){
			System.out.println(s);
			Employee emp=new Employee("Priya",22);
			System.out.println(emp);
			Manager mgr=new Manager("Sumathy",45,10);
			System.out.println(mgr);
			
		}
	}

}
