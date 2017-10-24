package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HOfficeOutgoingStatus;

public class OfficeOutgoingStatusMapper extends BaseMapper implements RowMapper<HOfficeOutgoingStatus> {

	public HOfficeOutgoingStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
		HOfficeOutgoingStatus status = new HOfficeOutgoingStatus();
		
		if (findColumnNames(rs, "id")) {
			status.setId(rs.getInt("id"));
		}
		
		if (findColumnNames(rs, "outgoing_id")) {
			status.setOutgoing_id(rs.getInt("outgoing_id"));
		}
		
		if (findColumnNames(rs, "approver_id")) {
			status.setApprover_id(rs.getInt("approver_id"));
		}
		
		if (findColumnNames(rs, "comments")) {
			status.setComments(rs.getString("comments"));
		}
		
		if (findColumnNames(rs, "approvalstate")) {
			status.setApprovalstate(rs.getInt("approvalstate"));
		}
		
		if (findColumnNames(rs, "date")) {
			status.setDate(DateFormate().format(rs.getDate("date")));
		}
		
		if (findColumnNames(rs, "approvarSeq")) {
			status.setApprovarSeq(rs.getInt("approvarSeq"));
		}
		
		if (findColumnNames(rs, "deleted")) {
			status.setDeleted(rs.getBoolean("deleted"));
		}
		
		if (findColumnNames(rs, "modifierid")) {
			status.setModId(rs.getString("modifierid"));
		}
		
		return status;
	}

}
