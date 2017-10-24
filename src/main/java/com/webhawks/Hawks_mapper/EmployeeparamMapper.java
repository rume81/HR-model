package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HEmployeeparam;

/**
 * @author OS-10 Monsur
 *
 */
public class EmployeeparamMapper extends BaseMapper implements RowMapper<HEmployeeparam> {

    public HEmployeeparam mapRow(ResultSet rs, int rowNum) throws SQLException {
	HEmployeeparam empparam = new HEmployeeparam();
	
	if (findColumnNames(rs, "id")) {
	    empparam.setId(rs.getInt("id"));
	}
	
	if (findColumnNames(rs, "emp_id")) {
	    empparam.setEmp_id(rs.getInt("emp_id"));
	}
	
	if (findColumnNames(rs, "autolunchinput")) {
	    empparam.setAutolunchinput(rs.getBoolean("autolunchinput"));
	}
	
	if (findColumnNames(rs, "deleted")) {
	    empparam.setDeleted(rs.getBoolean("deleted"));
	}
	
	if (findColumnNames(rs, "modifierid")) {
	    empparam.setModId(rs.getString("modifierid"));
	}
	
	return empparam;
    }

}
