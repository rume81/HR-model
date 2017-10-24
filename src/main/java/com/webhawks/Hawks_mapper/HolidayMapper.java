package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HEmployee;
import com.webhawks.Hawks_model.HHoliday;

/**
 * @author OS-10 Monsur
 *
 */
public class HolidayMapper extends BaseMapper implements RowMapper<HHoliday> {
    public HHoliday mapRow(ResultSet rs, int rowNum) throws SQLException {
	HHoliday holiday = new HHoliday();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "id");
	if (colindex > 0) {
	    holiday.setId(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "holiday_desc");
	if (colindex > 0) {
	    holiday.setHoliday_desc(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "date_from");
	if (colindex > 0) {
	    Date df = rs.getDate(colindex);
	    if(null != df)
		holiday.setDate_from(DateFormate().format(df));
	    else
		holiday.setDate_from("");
	}
	
	colindex = findColumn(rs, "date_to");
	if (colindex > 0) {
	    Date dt = rs.getDate(colindex);
	    if(null != dt)
		holiday.setDate_to(DateFormate().format(dt));
	    else
		holiday.setDate_to("");
	}
	
	colindex = findColumn(rs, "holiday_year");
	if (colindex > 0) {
	    holiday.setHoliday_year(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "deleted");
	if (colindex > 0) {
	    holiday.setDeleted(rs.getBoolean(colindex));
	}
	
	colindex = findColumn(rs, "modifierid");
	if (colindex > 0) {
	    holiday.setModId(rs.getString(colindex));
	}
	
	return holiday;
    }
}
