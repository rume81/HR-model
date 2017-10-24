package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @author OS-10 Monsur
 *
 */
public class HLunch extends HObject {
    private Integer lunch_id;
    private Integer emp_id;
    private String name;
    private String lunch_date;
    private Boolean lunch_status;
    private Integer lunch_count;
    
    public void escapeEcmaScript()
    {
	name = StringEscapeUtils.escapeEcmaScript(name);    
    }
    
    public Integer getLunch_id() {
        return lunch_id;
    }
    public void setLunch_id(Integer lunch_id) {
        this.lunch_id = lunch_id;
    }
    public Integer getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLunch_date() {
        return lunch_date;
    }
    public void setLunch_date(String lunch_date) {
        this.lunch_date = lunch_date;
    }
    public Boolean getLunch_status() {
        return lunch_status;
    }
    public void setLunch_status(Boolean lunch_status) {
        this.lunch_status = lunch_status;
    }
    public Integer getLunch_count() {
        return lunch_count;
    }
    public void setLunch_count(Integer lunch_count) {
        this.lunch_count = lunch_count;
    }
    
}
