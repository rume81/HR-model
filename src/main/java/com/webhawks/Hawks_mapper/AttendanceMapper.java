package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HAttendance;


/**
 * @author OS-10 Monsur
 *
 */
public class AttendanceMapper extends BaseMapper implements RowMapper<HAttendance> {
    public HAttendance mapRow(ResultSet rs, int rowNum) throws SQLException {
	HAttendance attendance = new HAttendance();
	
	int colindex = 0;
		
	colindex = findColumn(rs, "att_id");
	if (colindex > 0) {
	    attendance.setAtt_id(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "emp_id");
	if (colindex > 0) {
	    attendance.setEmp_id(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "att_date");
	if (colindex > 0) {
	    attendance.setAtt_date(DateFormate().format(rs.getDate(colindex)));
	}
	
	colindex = findColumn(rs, "att_time");
	if (colindex > 0) {
	    Time time = rs.getTime(colindex);
	    attendance.setAtt_time(TimeFormate().format(time));
	}
		
	colindex = findColumn(rs, "att_inout");
	if (colindex > 0) {
	    attendance.setAtt_inout(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "day_sequence");
	if (colindex > 0) {
	    attendance.setDay_sequence(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "deleted");
	if (colindex > 0) {
	    attendance.setDeleted(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "modifierid");
	if (colindex > 0) {
	    attendance.setModId(rs.getString(colindex));
	}
	
	return attendance;
    }
    

}
