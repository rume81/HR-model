package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @author OS-10 Monsur
 *
 */
public class HHoliday extends HObject {
    private Integer id;
    private String holiday_desc;
    private String date_from;
    private String date_to;
    private Integer holiday_year;
    
    public void escapeEcmaScript()
    {
	holiday_desc = StringEscapeUtils.escapeEcmaScript(holiday_desc);    
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getHoliday_desc() {
        return holiday_desc;
    }
    public void setHoliday_desc(String holiday_desc) {
        this.holiday_desc = holiday_desc;
    }
    public String getDate_from() {
        return date_from;
    }
    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }
    public String getDate_to() {
        return date_to;
    }
    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }
    public Integer getHoliday_year() {
        return holiday_year;
    }
    public void setHoliday_year(Integer holiday_year) {
        this.holiday_year = holiday_year;
    }
    
}
