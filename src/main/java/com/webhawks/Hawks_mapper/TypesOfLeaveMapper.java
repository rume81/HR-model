package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HTypesOfLeave;

/**
 * @author OS-10 Monsur
 *
 */
public class TypesOfLeaveMapper extends BaseMapper implements RowMapper<HTypesOfLeave> {

    public HTypesOfLeave mapRow(ResultSet rs, int rowNum) throws SQLException {
	HTypesOfLeave typesOfLeave = new HTypesOfLeave();
	
	if (findColumnNames(rs, "id")) {
	    typesOfLeave.setId(rs.getInt("id"));
	}
	
	if (findColumnNames(rs, "leavetype")) {
	    typesOfLeave.setLeavetype(rs.getString("leavetype"));
	}
	
	if (findColumnNames(rs, "deleted")) {
	    typesOfLeave.setDeleted(rs.getBoolean("deleted"));
	}
	
	if (findColumnNames(rs, "modifierid")) {
	    typesOfLeave.setModId(rs.getString("modifierid"));
	}
	
	if (findColumnNames(rs, "isquota")) {
	    typesOfLeave.setIsquota(rs.getBoolean("isquota"));
	}
	
	if (findColumnNames(rs, "iscontinue")) {
	    typesOfLeave.setIscontinue(rs.getBoolean("iscontinue"));
	}
	
	if (findColumnNames(rs, "leavededuct")) {
	    typesOfLeave.setLeavededuct(rs.getFloat("leavededuct"));
	}
	
	if (findColumnNames(rs, "deductfrom")) {
	    typesOfLeave.setDeductfrom(rs.getInt("deductfrom"));
	}
	
	return typesOfLeave;
    }

}
