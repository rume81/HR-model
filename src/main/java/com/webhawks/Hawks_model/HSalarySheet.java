package com.webhawks.Hawks_model;

public class HSalarySheet extends HPaySlip {
    private String join_date;
    private String designation;
    
    public String getJoin_date() {
        return join_date;
    }
    public void setJoin_date(String join_date) {
        this.join_date = join_date;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
