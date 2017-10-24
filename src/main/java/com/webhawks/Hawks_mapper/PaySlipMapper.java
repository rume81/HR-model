package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HPaySlip;

public class PaySlipMapper extends BaseMapper implements RowMapper<HPaySlip> {

    public HPaySlip mapRow(ResultSet rs, int rowNum) throws SQLException {
	HPaySlip ob = new HPaySlip();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "emp_id");
	if (colindex > 0) {
	    ob.setEmp_id(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "month");
	if (colindex > 0) {
	    ob.setMonth(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "year");
	if (colindex > 0) {
	    ob.setYear(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "emp_name");
	if (colindex > 0) {
	    ob.setEmp_name(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "emp_finance_id");
	if (colindex > 0) {
	    ob.setEmp_finance_id(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "swdm");
	if (colindex > 0) {
	    ob.setSwdm(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "awdm");
	if (colindex > 0) {
	    ob.setAwdm(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "appleave");
	if (colindex > 0) {
	    ob.setAppleave(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "absent");
	if (colindex > 0) {
	    ob.setAbsent(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "awhm");
	if (colindex > 0) {
	    ob.setAwhm(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "oaom");
	if (colindex > 0) {
	    ob.setOaom(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "gross");
	if (colindex > 0) {
	    ob.setGross(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "basic");
	if (colindex > 0) {
	    ob.setBasic(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "dbpr");
	if (colindex > 0) {
	    ob.setDbpr(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "hbpr");
	if (colindex > 0) {
	    ob.setHbpr(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "nodwm");
	if (colindex > 0) {
	    ob.setNodwm(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "nohwm");
	if (colindex > 0) {
	    ob.setNohwm(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "hoo");
	if (colindex > 0) {
	    ob.setHoo(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "ohih");
	if (colindex > 0) {
	    ob.setOhih(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "htns");
	if (colindex > 0) {
	    ob.setHtns(rs.getFloat(colindex));
	}
	
	colindex = findColumn(rs, "tpl");
	if (colindex > 0) {
	    ob.setTpl(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "nots");
	if (colindex > 0) {
	    ob.setNots(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "bstbp");
	if (colindex > 0) {
	    ob.setBstbp(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "soow");
	if (colindex > 0) {
	    ob.setSoow(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "soho");
	if (colindex > 0) {
	    ob.setSoho(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "pftnh");
	if (colindex > 0) {
	    ob.setPftnh(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "sfapl");
	if (colindex > 0) {
	    ob.setSfapl(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "bta");
	if (colindex > 0) {
	    ob.setBta(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "ha");
	if (colindex > 0) {
	    ob.setHa(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "ma");
	if (colindex > 0) {
	    ob.setMa(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "ta");
	if (colindex > 0) {
	    ob.setTa(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "bonus");
	if (colindex > 0) {
	    ob.setBonus(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "arrear_bonus");
	if (colindex > 0) {
	    ob.setArrear_bonus(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "hma");
	if (colindex > 0) {
	    ob.setHma(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "cfhi");
	if (colindex > 0) {
	    ob.setCfhi(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "lwp");
	if (colindex > 0) {
	    ob.setLwp(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "lunch");
	if (colindex > 0) {
	    ob.setLunch(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "tax");
	if (colindex > 0) {
	    ob.setTax(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "arrears");
	if (colindex > 0) {
	    ob.setArrears(rs.getDouble(colindex));
	}
	
	colindex = findColumn(rs, "slipstate");
	if (colindex > 0) {
	    ob.setSlipstate(rs.getInt(colindex));
	}
	
	return ob;
    }

}
