package demotoday;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class practiceRowMapper implements RowMapper<practice> {

	public practice mapRow(ResultSet arg0, int arg1) throws SQLException {
		
		practice p=new practice(arg0.getString(1), arg0.getInt(2));
		
		
		return p;
	}
	
	

}
