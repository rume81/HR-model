package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HSysProperty;

public class SysPropertyMapper extends BaseMapper implements RowMapper<HSysProperty> {
    public HSysProperty mapRow(ResultSet rs, int rowNum) throws SQLException {
	HSysProperty ob = new HSysProperty();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "prop_name");
	if (colindex > 0) {
	    ob.setProp_name(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "prop_value");
	if (colindex > 0) {
	    ob.setProp_value(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "deleted");
	if (colindex > 0) {
	    ob.setDeleted(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "modifierid");
	if (colindex > 0) {
	    ob.setModId(rs.getString(colindex));
	}
	
	return ob;
    }
}