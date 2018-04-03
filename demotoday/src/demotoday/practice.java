package demotoday;

public class practice {
	
	private String name;
	private int age;
	private float salary;
	private String designation;
	public practice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public practice(String name, int age, float salary, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.designation = designation;
	}
	
}

