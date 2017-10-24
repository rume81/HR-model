package com.webhawks.Hawks_model;

public class HSalaryDetails extends HObject {
    private Integer salid;
    private Integer emp_id;
    private String emp_finance_id;
    private Double gross;
    private Double basic;
    private Double housing;
    private Double medical;
    private Double transport;
    private Double lunch;
    private Double tax;
    private String applieddate;
    private Boolean status;
    
    public Integer getSalid() {
        return salid;
    }
    public void setSalid(Integer salid) {
        this.salid = salid;
    }
    public Integer getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    public String getEmp_finance_id() {
        return emp_finance_id;
    }
    public void setEmp_finance_id(String emp_finance_id) {
        this.emp_finance_id = emp_finance_id;
    }
    public Double getGross() {
        return gross;
    }
    public void setGross(Double gross) {
        this.gross = gross;
    }
    public Double getBasic() {
        return basic;
    }
    public void setBasic(Double basic) {
        this.basic = basic;
    }
    public Double getHousing() {
        return housing;
    }
    public void setHousing(Double housing) {
        this.housing = housing;
    }
    public Double getMedical() {
        return medical;
    }
    public void setMedical(Double medical) {
        this.medical = medical;
    }
    public Double getTransport() {
        return transport;
    }
    public void setTransport(Double transport) {
        this.transport = transport;
    }
    public String getApplieddate() {
        return applieddate;
    }
    public void setApplieddate(String applieddate) {
        this.applieddate = applieddate;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Double getLunch() {
        return lunch;
    }
    public void setLunch(Double lunch) {
        this.lunch = lunch;
    }
    public Double getTax() {
        return tax;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }
}
