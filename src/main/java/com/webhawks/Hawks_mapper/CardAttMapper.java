package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HCardAttendance;

/**
 * @author OS-10 Monsur
 *
 */
public class CardAttMapper extends BaseMapper implements RowMapper<HCardAttendance> {

    public HCardAttendance mapRow(ResultSet rs, int rowNum) throws SQLException {
	HCardAttendance att = new HCardAttendance();
	//SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	if (findColumnNames(rs, "ATTID")) {
	    att.setATTID(rs.getLong("ATTID"));
	}
	
	if (findColumnNames(rs, "USERID")) {
	    att.setUSERID(rs.getLong("USERID"));
	}
	
	if (findColumnNames(rs, "CHECKTIME")) {
	    att.setCHECKTIME(rs.getString("CHECKTIME"));
	}
	
	if (findColumnNames(rs, "CHECKTYPE")) {
	    att.setCHECKTYPE(rs.getString("CHECKTYPE"));
	}
	
	if (findColumnNames(rs, "VERIFYCODE")) {
	    att.setVERIFYCODE(rs.getLong("VERIFYCODE"));
	}
	
	if (findColumnNames(rs, "SENSORID")) {
	    att.setSENSORID(rs.getString("SENSORID"));
	}
	
	if (findColumnNames(rs, "Memoinfo")) {
	    att.setMemoinfo(rs.getString("Memoinfo"));
	}
	
	if (findColumnNames(rs, "WorkCode")) {
	    att.setWorkCode(rs.getString("WorkCode"));
	}
	
	if (findColumnNames(rs, "sn")) {
	    att.setSn(rs.getString("sn"));
	}
	
	if (findColumnNames(rs, "UserExtFmt")) {
	    att.setUserExtFmt(rs.getInt("UserExtFmt"));
	}
	
	if (findColumnNames(rs, "deleted")) {
	    att.setDeleted(rs.getBoolean("deleted"));
	}
	
	if (findColumnNames(rs, "modifierid")) {
	    att.setModId(rs.getString("modifierid"));
	}
	
	return att;
    }

}
