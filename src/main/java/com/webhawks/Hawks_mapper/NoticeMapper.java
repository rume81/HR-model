package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HNotice;

public class NoticeMapper extends BaseMapper implements RowMapper<HNotice> {
    public HNotice mapRow(ResultSet rs, int rowNum) throws SQLException {
	HNotice ob = new HNotice();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "notice_id");
	if (colindex > 0) {
	    ob.setNotice_id(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "title");
	if (colindex > 0) {
	    ob.setTitle(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "details");
	if (colindex > 0) {
	    ob.setDetails(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "expdate");
	if (colindex > 0) {
	    ob.setExpdate(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "accesslist");
	if (colindex > 0) {
	    ob.setAccesslist(rs.getString(colindex));
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
