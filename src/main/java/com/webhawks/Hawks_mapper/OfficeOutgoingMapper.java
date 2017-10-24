package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.webhawks.Hawks_model.HOfficeOutgoing;

public class OfficeOutgoingMapper extends BaseMapper implements RowMapper<HOfficeOutgoing> {

	public HOfficeOutgoing mapRow(ResultSet rs, int rowNum) throws SQLException {
		HOfficeOutgoing ot = new HOfficeOutgoing();
		
		if (findColumnNames(rs, "id")) {
		    ot.setId(rs.getInt("id"));
		}
		
		if (findColumnNames(rs, "emp_id")) {
		    ot.setEmp_id(rs.getInt("emp_id"));
		}
		
		if (findColumnNames(rs, "date")) {
			ot.setDate(rs.getDate("date"));
		}
		
		if (findColumnNames(rs, "ftime")) {
		    String td = TimeFormate().format(rs.getTime("ftime"));
		    ot.setFtime(td);
		}
		
		if (findColumnNames(rs, "ttime")) {
		    String td = TimeFormate().format(rs.getTime("ttime"));
		    ot.setTtime(td);
		}
						
		if (findColumnNames(rs, "reason")) {
		    ot.setReason(rs.getString("reason"));
		}
		
		if (findColumnNames(rs, "status")) {
		    ot.setStatus(rs.getInt("status"));
		}
		
		if (findColumnNames(rs, "approvar1")) {
		    ot.setApprovar1(rs.getInt("approvar1"));
		}
		
		if (findColumnNames(rs, "approvar2")) {
		    ot.setApprovar2(rs.getInt("approvar2"));
		}
		
		if (findColumnNames(rs, "approvar3")) {
		    ot.setApprovar3(rs.getInt("approvar3"));
		}
		
		if (findColumnNames(rs, "approvar4")) {
		    ot.setApprovar4(rs.getInt("approvar4"));
		}
		
		if (findColumnNames(rs, "approvar5")) {
		    ot.setApprovar5(rs.getInt("approvar5"));
		}
		
		if (findColumnNames(rs, "app1state")) {
		    ot.setApp1state(rs.getBoolean("app1state"));
		}
		
		if (findColumnNames(rs, "app2state")) {
		    ot.setApp2state(rs.getBoolean("app2state"));
		}
		
		if (findColumnNames(rs, "app3state")) {
		    ot.setApp3state(rs.getBoolean("app3state"));
		}
		
		if (findColumnNames(rs, "app4state")) {
		    ot.setApp4state(rs.getBoolean("app4state"));
		}
		
		if (findColumnNames(rs, "app5state")) {
		    ot.setApp5state(rs.getBoolean("app5state"));
		}
		
		if (findColumnNames(rs, "deleted")) {
		    ot.setDeleted(rs.getBoolean("deleted"));
		}
		
		if (findColumnNames(rs, "modifierid")) {
		    ot.setModId(rs.getString("modifierid"));
		}
		
		if (findColumnNames(rs, "apllieddate")) {
		    String apllieddate = DateFormate().format(rs.getDate("apllieddate"));
		    ot.setApllieddate(apllieddate);
		}
		
		if (findColumnNames(rs, "modifydate")) {
		    String modifydate = DateFormate().format(rs.getDate("modifydate"));
		    ot.setModifydate(modifydate);
		}
		
		return ot;
	    
	}
	
}
