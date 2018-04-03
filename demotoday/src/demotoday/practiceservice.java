package demotoday;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class practiceservice {
	@Autowired
	private practiceDAO dao;
	
	public void insert(practice p)
	{
		dao.insert(p);
		System.out.println("Inserted successsfully");
	}
	
	public List<practice> displayAll()
	{
		return dao.display();
	}
	
	public void delete(practice p)
	{
		dao.delete(p);
	}
	
	public void update(practice p)
	{
		dao.update(p);
	}

}
