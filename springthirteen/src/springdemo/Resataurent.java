package springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class Resataurent {
	
	private String sample;

	public Resataurent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSample() {
		return sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("This is ini method");
	}
	
	@PreDestroy
	public void desroy()
	{
		System.out.println("This is destroy method");
	}
	
	public void greetCustomer()
	{
		System.out.println("Welcome to our restaurent");
	}

	
	
	

}
