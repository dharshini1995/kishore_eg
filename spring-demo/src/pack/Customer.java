package pack;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	
	private Identifier id;
	
	
	private Address address;

	public Customer() {
		super();
		System.out.println("Defaul construcor is called");
	}

	public Customer(Identifier id) {
		super();
		
		System.out.println("Parametrized construcor is called");
		this.id = id;
	}

	public Identifier getId() {
		return id;
	}

	public void setId(Identifier id) {
		System.out.println("setId () is called ");
		this.id = id;
	}
	
	public void getInformation()
	{
		id.display();
	}
	
	
	

}
