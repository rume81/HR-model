package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HSupportingData;

public class SupportingDataMapper extends BaseMapper implements RowMapper<HSupportingData> {
	
	public HSupportingData mapRow(ResultSet rs, int rowNum) throws SQLException {
		HSupportingData sd = new HSupportingData();
		
		if (findColumnNames(rs, "id")) {
		    sd.setId(rs.getString("id"));
		}
		if(findColumnNames(rs, "datavalue")) {
			sd.setDatavalue(rs.getString("datavalue"));
		}
		if(findColumnNames(rs, "valuetype")) {
			sd.setValuetype(rs.getString("valuetype"));
		}
		
		return sd;
	}

}
