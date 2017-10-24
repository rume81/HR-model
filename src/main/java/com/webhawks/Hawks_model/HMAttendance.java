package com.webhawks.Hawks_model;

/**
 * @author OS-10 Monsur
 *
 */
public class HMAttendance {
    private Integer emp_id;
    private String employee_name;
    private String att_date;
    private String att_weekday;
    private String att_in;
    private String att_out;
    private String status;
    private boolean weekend;
    private boolean holiday;
    private boolean leave;
    private boolean lwp;
    private boolean absent;
    private boolean isLate;
    private String wrkTime;
    private String team;
    
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
    public String getAtt_in() {
        return att_in;
    }
    public void setAtt_in(String att_in) {
        this.att_in = att_in;
    }
    public String getAtt_out() {
        return att_out;
    }
    public void setAtt_out(String att_out) {
        this.att_out = att_out;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }
    public boolean isWeekend() {
        return weekend;
    }
    public boolean isHoliday() {
        return holiday;
    }
    public boolean isLeave() {
        return leave;
    }
    public void setLeave(boolean leave) {
        this.leave = leave;
    }
    public boolean isAbsent() {
        return absent;
    }
    public void setAbsent(boolean absent) {
        this.absent = absent;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public boolean isLate() {
        return isLate;
    }
    public void setLate(boolean isLate) {
        this.isLate = isLate;
    }
    public String getWrkTime() {
        return wrkTime;
    }
    public void setWrkTime(String wrkTime) {
        this.wrkTime = wrkTime;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public boolean isLwp() {
        return lwp;
    }
    public void setLwp(boolean lwp) {
        this.lwp = lwp;
    }
    public String getAtt_weekday() {
        return att_weekday;
    }
    public void setAtt_weekday(String att_weekday) {
        this.att_weekday = att_weekday;
    }
    
}
