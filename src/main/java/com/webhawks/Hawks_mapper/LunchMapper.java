package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HLunch;

/**
 * @author OS-10 Monsur
 *
 */
public class LunchMapper extends BaseMapper implements RowMapper<HLunch> {

    public HLunch mapRow(ResultSet rs, int rowNum) throws SQLException {
	HLunch lunch = new HLunch();
	
	if (findColumnNames(rs, "lunch_id")) {
	    lunch.setLunch_id(rs.getInt("lunch_id"));
	}
	
	if (findColumnNames(rs, "emp_id")) {
	    lunch.setEmp_id(rs.getInt("emp_id"));
	}
	
	if (findColumnNames(rs, "name")) {
	    lunch.setName(rs.getString("name"));
	}
	
	if (findColumnNames(rs, "lunch_date")) {
	    lunch.setLunch_date(DateFormate().format(rs.getDate("lunch_date")));
	}
	
	if (findColumnNames(rs, "lunch_status")) {
	    lunch.setLunch_status(rs.getBoolean("lunch_status"));
	}
	
	if (findColumnNames(rs, "lunch_count")) {
	    lunch.setLunch_count(rs.getInt("lunch_count"));
	}
		
	if (findColumnNames(rs, "deleted")) {
	    lunch.setDeleted(rs.getBoolean("deleted"));
	}
	
	if (findColumnNames(rs, "modifierid")) {
	    lunch.setModId(rs.getString("modifierid"));
	}
	
	return lunch;
    }

}
