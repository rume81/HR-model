package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HLeaveApprover;
import com.webhawks.Hawks_model.HOfficeOutgoingApprover;

/**
 * @author OS-10 Monsur
 *
 */
public class OfficeOutgoingApproverMapper extends BaseMapper implements RowMapper<HOfficeOutgoingApprover> {

    public HOfficeOutgoingApprover mapRow(ResultSet rs, int rowNum) throws SQLException {
    HOfficeOutgoingApprover approver = new HOfficeOutgoingApprover();
	
	if (findColumnNames(rs, "id")) {
	    approver.setId(rs.getInt("id"));
	}
	
	if (findColumnNames(rs, "emp_id")) {
	    approver.setEmp_id(rs.getInt("emp_id"));
	}
	
	if (findColumnNames(rs, "approver_id")) {
	    approver.setApprover_id(rs.getInt("approver_id"));
	}
	
	if (findColumnNames(rs, "deleted")) {
	    approver.setDeleted(rs.getBoolean("deleted"));
	}
	
	if (findColumnNames(rs, "modifierid")) {
	    approver.setModId(rs.getString("modifierid"));
	}
	return approver;
    }

}
