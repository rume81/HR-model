package com.webhawks.Hawks_model;

public class HProfileAs extends HObject {
    private Integer id;
    private Integer emp_id;
    private String designation1;
    private String designation2;
    private Integer teamid;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    public String getDesignation1() {
        return designation1;
    }
    public void setDesignation1(String designation1) {
        this.designation1 = designation1;
    }
    public String getDesignation2() {
        return designation2;
    }
    public void setDesignation2(String designation2) {
        this.designation2 = designation2;
    }
    public Integer getTeamid() {
        return teamid;
    }
    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }
}
