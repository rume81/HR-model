package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;

public class HTeam extends HObject {
    private Integer teamId;
    private String teamName;
    private Integer companyId;
    
    public Integer getTeamId() {
        return teamId;
    }
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void escapeEcmaScript()
    {
	teamName = StringEscapeUtils.escapeEcmaScript(teamName);
    }
    public Integer getCompanyId() {
        return companyId;
    }
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
    
}
