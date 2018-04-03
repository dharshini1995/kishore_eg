package demotoday;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class practiceDAO {


   @Autowired
	private JdbcTemplate template;
	

	
	public void insert (practice p)
	{
		
			template.update("insert into practice values(?,?)", 
						new Object[] { p.getName(), p.getAge()});
	}
	
	
	public List<practice>display()
	{
		List<practice> list=template.query("select * from practice",new practiceRowMapper());
		return list;
	}
	
	public void delete(practice p)
	{
		template.update("delete from practice where name=?",new Object[]{p.getName()});
	}
	
	public void update(practice p)
	{
		String q="update practice set salary=? ,designation=? where name=?";
		template.update(q,p.getSalary(),p.getDesignation(),p.getName());
	}

	}

