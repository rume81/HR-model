package com.webhawks.Hawks_model;

/**
 * @author OS-10 Monsur
 *
 */
public class HLeaveQuota extends HObject {
    private Integer emp_id;
    private Integer type_id;
    private String year;
    private String expdate;
    private Float quota;
    private Float used;
    
    public Integer getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    public Integer getType_id() {
        return type_id;
    }
    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getExpdate() {
        return expdate;
    }
    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }
    public Float getQuota() {
        return quota;
    }
    public void setQuota(Float quota) {
        this.quota = quota;
    }
    public Float getUsed() {
        return used;
    }
    public void setUsed(Float used) {
        this.used = used;
    }
    public Float getAvailable(){
	return  quota - used;
    }
}
