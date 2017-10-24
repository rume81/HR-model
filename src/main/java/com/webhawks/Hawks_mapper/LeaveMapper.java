package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HLeave;
import com.webhawks.Hawks_model.HLeaveQuota;
import com.webhawks.Hawks_model.HTypesOfLeave;

/**
 * @author OS-10 Monsur
 *
 */
public class LeaveMapper extends BaseMapper implements RowMapper<HLeave> {
    public HLeave mapRow(ResultSet rs, int rowNum) throws SQLException {
	HLeave leave = new HLeave();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "id");
	if (colindex > 0) {
	    leave.setId(rs.getInt("id"));
	}
	
	colindex = findColumn(rs, "emp_id");
	if (colindex > 0) {
	    leave.setEmp_id(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "fdate");
	if (colindex > 0) {
	    String fd = DateFormate().format(rs.getDate(colindex));
	    leave.setFdate(fd);
	}
	
	colindex = findColumn(rs, "tdate");
	if (colindex > 0) {
	    String td = DateFormate().format(rs.getDate(colindex));
	    leave.setTdate(td);
	}
	
	colindex = findColumn(rs, "days");
	if (colindex > 0) {
	    leave.setDays(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "leavetype");
	if (colindex > 0) {
	    HTypesOfLeave obj = new HTypesOfLeave();
	    obj.setId(rs.getInt(colindex));
	    colindex = findColumn(rs, "typename");
	    if (colindex > 0) {
		obj.setLeavetype(rs.getString(colindex));
	    }
	    leave.setLeavetype(obj);
	}
	
	colindex = findColumn(rs, "quotayear");
	if (colindex > 0) {
	    HLeaveQuota obj = new HLeaveQuota();
	    obj.setYear(rs.getString(colindex));
	    
	    leave.setLeavequota(obj);
	}
	
	colindex = findColumn(rs, "reason");
	if (colindex > 0) {
	    leave.setReason(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "status");
	if (colindex > 0) {
	    leave.setStatus(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "approvar1");
	if (colindex > 0) {
	    leave.setApprovar1(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "approvar2");
	if (colindex > 0) {
	    leave.setApprovar2(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "approvar3");
	if (colindex > 0) {
	    leave.setApprovar3(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "approvar4");
	if (colindex > 0) {
	    leave.setApprovar4(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "approvar5");
	if (colindex > 0) {
	    leave.setApprovar5(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "app1state");
	if (colindex > 0) {
	    leave.setApp1state(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "app2state");
	if (colindex > 0) {
	    leave.setApp2state(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "app3state");
	if (colindex > 0) {
	    leave.setApp3state(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "app4state");
	if (colindex > 0) {
	    leave.setApp4state(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "app5state");
	if (colindex > 0) {
	    leave.setApp5state(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "deleted");
	if (colindex > 0) {
	    leave.setDeleted(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "modifierid");
	if (colindex > 0) {
	    leave.setModId(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "apllieddate");
	if (colindex > 0) {
	    String apllieddate = DateFormate().format(rs.getDate(colindex));
	    leave.setApllieddate(apllieddate);
	}
	
	colindex = findColumn(rs, "modifydate");
	if (colindex > 0) {
	    String modifydate = DateFormate().format(rs.getDate(colindex));
	    leave.setModifydate(modifydate);
	}
	
	colindex = findColumn(rs, "fdate");
	if (colindex > 0) {
		leave.setSortdate(rs.getDate(colindex));
	}
	
	return leave;
    }

}
