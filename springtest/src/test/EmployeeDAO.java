package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
	@Autowired
	private JdbcTemplate template;
	
	public void add(Employee e ){
		template.update("insert into employee values(?,?,?,?)",
				new Object[]{e.getId(),e.getName(),e.getSalary(),e.getDesignation()});
}
	
	
	public List<Employee> getAllEmployees() {
		List<Employee> list = template.query("select * from Employee", 
				new EmployeeRowMapper());
		return list;
	}

	public void update(int id)
	{
		
		//template.update("update table employee where id=" ,e.getId()); 
				
	}
	


	public void delete(int id) {
		//template.delete("delete from employee where id=", e.getId());
		
	}
	
	
		
	}



