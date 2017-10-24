package com.webhawks.Hawks_mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.webhawks.Hawks_model.HTeam;


public class TeamMapper extends BaseMapper implements RowMapper<HTeam> {
    public HTeam mapRow(ResultSet rs, int rowNum) throws SQLException {
	HTeam team = new HTeam();
	
	if (findColumnNames(rs, "teamId")) {
	    team.setTeamId(rs.getInt("teamId"));
	}
	
	if (findColumnNames(rs, "teamName")) {
	    team.setTeamName(rs.getString("teamName"));
	}
	
	if (findColumnNames(rs, "companyId")) {
	    team.setCompanyId(rs.getInt("companyId"));
	}
	
	if (findColumnNames(rs, "deleted")) {
	    team.setDeleted(rs.getBoolean("deleted"));
	}
	
	if (findColumnNames(rs, "modifierid")) {
	    team.setModId(rs.getString("modifierid"));
	}
	
	return team;
    }
}
