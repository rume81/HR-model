package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HLeaveQuota;

/**
 * @author OS-10 Monsur
 *
 */
public class LeaveQuotaMapper extends BaseMapper implements RowMapper<HLeaveQuota> {

    public HLeaveQuota mapRow(ResultSet rs, int rowNum) throws SQLException {
	HLeaveQuota quota = new HLeaveQuota();
	
	if (findColumnNames(rs, "emp_id")) {
	    quota.setEmp_id(rs.getInt("emp_id"));
	}
	
	if (findColumnNames(rs, "type_id")) {
	    quota.setType_id(rs.getInt("type_id"));
	}
	
	if (findColumnNames(rs, "year")) {
	    quota.setYear(rs.getString("year"));
	}
	
	if (findColumnNames(rs, "expdate")) {
	    String ed = DateFormate().format(rs.getDate("expdate"));
	    quota.setExpdate(ed);
	}
	
	if (findColumnNames(rs, "quota")) {
	    quota.setQuota(rs.getFloat("quota"));
	}
	
	if (findColumnNames(rs, "used")) {
	    quota.setUsed(rs.getFloat("used"));
	}
	
	return quota;
    }

}
