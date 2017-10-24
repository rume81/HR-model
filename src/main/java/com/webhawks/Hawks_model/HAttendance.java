package com.webhawks.Hawks_model;

public class HAttendance extends HObject {
    private Integer att_id;
    private Integer emp_id;
    private String att_date;
    private String att_time;
    private Integer att_inout;
    private Integer day_sequence;
    
    public Integer getAtt_id() {
        return att_id;
    }
    public void setAtt_id(Integer att_id) {
        this.att_id = att_id;
    }
    public Integer getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    
    public String getAtt_date() {
        return att_date;
    }
    public void setAtt_date(String att_date) {
        this.att_date = att_date;
    }
    public String getAtt_time() {
        return att_time;
    }
    public void setAtt_time(String att_time) {
        this.att_time = att_time;
    }
    public Integer getAtt_inout() {
        return att_inout;
    }
    public void setAtt_inout(Integer att_inout) {
        this.att_inout = att_inout;
    }
    public Integer getDay_sequence() {
        return day_sequence;
    }
    public void setDay_sequence(Integer day_sequence) {
        this.day_sequence = day_sequence;
    } 
}
