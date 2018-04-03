package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	

	@Autowired
	private EmployeeDAO dao;
	
	public void insert(Employee e) {
		dao.add(e);
	}
	
	
	public List<Employee> getEmployees() {
		return dao.getAllEmployees();
	}


	public void update(int id) {
		dao.update(id);
		
	}


	public void delete(int id) {
		dao.delete(id);
		
	}
	
	



}
