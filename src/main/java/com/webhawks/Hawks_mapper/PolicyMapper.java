/* ========================================
* AMS v. 1.0 class library
* ========================================
*
* http://www.ams.com
*
* (C) Copyright 2016-2020, by EY.
*
* --------------------
* PolicyMapper.java
* --------------------
* Created on Oct 31, 2017
*
* Revision: 
* Author: Abdullah-Al-Monsur (ALA)
* Source: 
* Id:  
*
* Oct 31, 2017: Original version (ALA)
*
*/
package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HPolicy;
import com.webhawks.Hawks_model.HUpload;

public class PolicyMapper extends BaseMapper implements RowMapper<HPolicy> {
    
    public HPolicy mapRow(ResultSet rs, int rowNum) throws SQLException {
	HPolicy ob = new HPolicy();
	
	int colindex = 0;
	
	colindex = findColumn(rs, "id");
	if (colindex > 0) {
	    ob.setId(rs.getInt(colindex));
	}
	
	colindex = findColumn(rs, "policy_name");
	if (colindex > 0) {
	    ob.setPolicy_name(rs.getString(colindex));
	}
	
	colindex = findColumn(rs, "policy_file");
	if (colindex > 0) {
	    HUpload nda = new HUpload();
	    nda.setPath(rs.getString(colindex));
	    ob.setPolicy_file(nda);
	}
	
	return ob;
    }
}
