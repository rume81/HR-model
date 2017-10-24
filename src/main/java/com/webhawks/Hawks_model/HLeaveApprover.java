package com.webhawks.Hawks_model;

/**
 * @author OS-10 Monsur
 *
 */
public class HLeaveApprover extends HObject {
    private Integer id;
    private Integer emp_id;
    private Integer approver_id;
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
    public Integer getApprover_id() {
        return approver_id;
    }
    public void setApprover_id(Integer approver_id) {
        this.approver_id = approver_id;
    }
}
