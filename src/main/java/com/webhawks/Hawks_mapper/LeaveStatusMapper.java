package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HLeaveStatus;

/**
 * @author OS-10 Monsur
 *
 */
public class LeaveStatusMapper extends BaseMapper implements RowMapper<HLeaveStatus> {

    public HLeaveStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
	HLeaveStatus leaveStatus = new HLeaveStatus();
	
	if (findColumnNames(rs, "id")) {
	    leaveStatus.setId(rs.getInt("id"));
	}
	
	if (findColumnNames(rs, "leave_id")) {
	    leaveStatus.setLeave_id(rs.getInt("leave_id"));
	}
	
	if (findColumnNames(rs, "approver_id")) {
	    leaveStatus.setApprover_id(rs.getInt("approver_id"));
	}
	
	if (findColumnNames(rs, "comments")) {
	    leaveStatus.setComments(rs.getString("comments"));
	}
	
	if (findColumnNames(rs, "approvalstate")) {
	    leaveStatus.setApprovalstate(rs.getInt("approvalstate"));
	}
	
	if (findColumnNames(rs, "date")) {
	    leaveStatus.setDate(DateFormate().format(rs.getDate("date")));
	}
	
	if (findColumnNames(rs, "approvarSeq")) {
	    leaveStatus.setApprovarSeq(rs.getInt("approvarSeq"));
	}
	
	if (findColumnNames(rs, "deleted")) {
	    leaveStatus.setDeleted(rs.getBoolean("deleted"));
	}
	
	if (findColumnNames(rs, "modifierid")) {
	    leaveStatus.setModId(rs.getString("modifierid"));
	}
	
	return leaveStatus;
    }
    
}
