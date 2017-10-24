package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HWorkInfo;

/**
 * @author OS-10 Monsur
 *
 */
public class WorkInfoMapper extends BaseMapper implements RowMapper<HWorkInfo> {
    public HWorkInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
	HWorkInfo workinfo = new HWorkInfo();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "id");
	if (colindex > 0) {
	    workinfo.setId(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "emp_id");
	if (colindex > 0) {
	    workinfo.setEmp_id(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "office_start");
	if (colindex > 0) {
	    workinfo.setOffice_start(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "working_hour");
	if (colindex > 0) {
	    workinfo.setWorking_hour(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "weekend");
	if (colindex > 0) {
	    workinfo.setWeekend(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "from_date");
	if (colindex > 0) {
	    workinfo.setFrom_date(DateFormate().format(rs.getDate(colindex)));
	}
	
	colindex = findColumn(rs, "status");
	if (colindex > 0) {
	    workinfo.setStatus(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "deleted");
	if (colindex > 0) {
	    workinfo.setDeleted(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "modifierid");
	if (colindex > 0) {
	    workinfo.setModId(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "lunchExcluded");
	if (colindex > 0) {
	    workinfo.setLunchExclude(rs.getInt(colindex));
	}
	
	return workinfo;
    }
}
