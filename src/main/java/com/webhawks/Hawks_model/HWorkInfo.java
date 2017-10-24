package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @author OS-10 Monsur
 *
 */
public class HWorkInfo extends HObject {
    private Integer id;
    private Integer emp_id;
    private Float office_start;
    private Float working_hour;
    private String weekend;
    private String from_date;
    private Boolean status;
    private Integer lunchExclude;
    
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
    public Float getOffice_start() {
        return office_start;
    }
    public void setOffice_start(Float office_start) {
        this.office_start = office_start;
    }
    public Float getWorking_hour() {
        return working_hour;
    }
    public void setWorking_hour(Float working_hour) {
        this.working_hour = working_hour;
    }
    public String getWeekend() {
        return weekend;
    }
    public void setWeekend(String weekend) {
        this.weekend = weekend;
    }
    public String getFrom_date() {
        return from_date;
    }
    public void setFrom_date(String from_date) {
        this.from_date = from_date;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Integer getLunchExclude() {
        return lunchExclude;
    }
    public void setLunchExclude(Integer lunchExclude) {
        this.lunchExclude = lunchExclude;
    }
    
    
}
