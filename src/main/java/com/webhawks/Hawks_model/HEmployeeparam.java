package com.webhawks.Hawks_model;

/**
 * @author OS-10 Monsur
 *
 */
public class HEmployeeparam extends HObject {
    private Integer id;
    private Integer emp_id;
    private Boolean autolunchinput;
    
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
    public Boolean getAutolunchinput() {
        return autolunchinput;
    }
    public void setAutolunchinput(Boolean autolunchinput) {
        this.autolunchinput = autolunchinput;
    }
    
    
}
