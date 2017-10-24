package com.webhawks.Hawks_model;

/**
 * @author OS-10 Monsur
 *
 */
public class HMonthlyStatus {
    private Integer emp_id;
    private String employee_name;
    private String month;
    private String year;
    private Integer total_working_day;
    private Integer present;
    private Integer absent;
    private Integer leave;
    private Integer lwp;
    private Integer late;
    private String overtimehours;
    private String deficithours;
    private String holidayovertime;
    private String totalworkinghours;
    private String absulateworkinghours;
    private String presentWorkingHours;
    
    public Integer getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }
    public Integer getTotal_working_day() {
        return total_working_day;
    }
    public void setTotal_working_day(Integer total_working_day) {
        this.total_working_day = total_working_day;
    }
    public Integer getPresent() {
        return present;
    }
    public void setPresent(Integer present) {
        this.present = present;
    }
    public Integer getAbsent() {
        return absent;
    }
    public void setAbsent(Integer absent) {
        this.absent = absent;
    }
    public Integer getLeave() {
        return leave;
    }
    public void setLeave(Integer leave) {
        this.leave = leave;
    }
    public Integer getLate() {
        return late;
    }
    public void setLate(Integer late) {
        this.late = late;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getOvertimehours() {
        return overtimehours;
    }
    public void setOvertimehours(String overtimehours) {
        this.overtimehours = overtimehours;
    }
    public String getTotalworkinghours() {
        return totalworkinghours;
    }
    public void setTotalworkinghours(String totalworkinghours) {
        this.totalworkinghours = totalworkinghours;
    }
    public String getAbsulateworkinghours() {
        return absulateworkinghours;
    }
    public void setAbsulateworkinghours(String absulateworkinghours) {
        this.absulateworkinghours = absulateworkinghours;
    }
    public String getPresentWorkingHours() {
        return presentWorkingHours;
    }
    public void setPresentWorkingHours(String presentWorkingHours) {
        this.presentWorkingHours = presentWorkingHours;
    }
    public String getDeficithours() {
        return deficithours;
    }
    public void setDeficithours(String deficithours) {
        this.deficithours = deficithours;
    }
    public String getHolidayovertime() {
        return holidayovertime;
    }
    public void setHolidayovertime(String holidayovertime) {
        this.holidayovertime = holidayovertime;
    }
    public Integer getLwp() {
        return lwp;
    }
    public void setLwp(Integer lwp) {
        this.lwp = lwp;
    }
    
    
}
