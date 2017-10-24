package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HMonthlyStatus;

public class HMonthlyStatusMapper extends BaseMapper implements RowMapper<HMonthlyStatus> {

    public HMonthlyStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
	HMonthlyStatus ob = new HMonthlyStatus();
	
	if (findColumnNames(rs, "emp_id")) {
	    ob.setEmp_id(rs.getInt("emp_id"));
	}
	
	if (findColumnNames(rs, "employee_name")) {
	    ob.setEmployee_name(rs.getString("employee_name"));
	}
	
	if (findColumnNames(rs, "month")) {
	    ob.setMonth(rs.getString("month"));
	}
	
	if (findColumnNames(rs, "year")) {
	    ob.setYear(rs.getString("year"));
	}
	
	if (findColumnNames(rs, "total_working_day")) {
	    ob.setTotal_working_day(rs.getInt("total_working_day"));
	}
	
	if (findColumnNames(rs, "present")) {
	    ob.setPresent(rs.getInt("present"));
	}
	
	if (findColumnNames(rs, "absent")) {
	    ob.setAbsent(rs.getInt("absent"));
	}
	
	if (findColumnNames(rs, "leaves")) {
	    ob.setLeave(rs.getInt("leaves"));
	}
	
	if (findColumnNames(rs, "lwp")) {
	    ob.setLwp(rs.getInt("lwp"));
	}
	
	if (findColumnNames(rs, "late")) {
	    ob.setLate(rs.getInt("late"));
	}
	
	if (findColumnNames(rs, "overtimehours")) {
	    ob.setOvertimehours(rs.getString("overtimehours"));
	}
	
	if (findColumnNames(rs, "deficithours")) {
	    ob.setDeficithours(rs.getString("deficithours"));
	}
	
	if (findColumnNames(rs, "holidayovertime")) {
	    ob.setHolidayovertime(rs.getString("holidayovertime"));
	}
	
	if (findColumnNames(rs, "totalworkinghours")) {
	    ob.setTotalworkinghours(rs.getString("totalworkinghours"));
	}
	
	if (findColumnNames(rs, "absulateworkinghours")) {
	    ob.setAbsulateworkinghours(rs.getString("absulateworkinghours"));
	}
	
	if (findColumnNames(rs, "presentWorkingHours")) {
	    ob.setPresentWorkingHours(rs.getString("presentWorkingHours"));
	}
	
	return ob;
    }

}
