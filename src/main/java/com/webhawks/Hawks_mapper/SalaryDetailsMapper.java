package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HSalaryDetails;

public class SalaryDetailsMapper extends BaseMapper implements RowMapper<HSalaryDetails> {
    public HSalaryDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
	HSalaryDetails ob = new HSalaryDetails();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "salid");
	if (colindex > 0) {
	    ob.setSalid(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "emp_id");
	if (colindex > 0) {
	    ob.setEmp_id(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "emp_finance_id");
	if (colindex > 0) {
	    ob.setEmp_finance_id(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "gross");
	if (colindex > 0) {
	    ob.setGross(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "basic");
	if (colindex > 0) {
	    ob.setBasic(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "housing");
	if (colindex > 0) {
	    ob.setHousing(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "medical");
	if (colindex > 0) {
	    ob.setMedical(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "transport");
	if (colindex > 0) {
	    ob.setTransport(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "lunch");
	if (colindex > 0) {
	    ob.setLunch(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "tax");
	if (colindex > 0) {
	    ob.setTax(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "applieddate");
	if (colindex > 0) {
	    Date apd = rs.getDate(colindex);
	    if (null != apd)
		ob.setApplieddate(DateFormate().format(apd));
	    else
		ob.setApplieddate("");
	}
	
	colindex = findColumn(rs, "status");
	if (colindex > 0) {
	    ob.setStatus(rs.getBoolean(colindex));
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
