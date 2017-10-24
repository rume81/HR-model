package com.webhawks.Hawks_model;

public class HEducation extends HObject {
    private Integer id;
    private Integer degreesequence;
    private Integer emp_id;
    private Integer degreetypes_id;
    private String passingyear;
    private String skills;
    private String certificate;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getDegreesequence() {
        return degreesequence;
    }
    public void setDegreesequence(Integer degreesequence) {
        this.degreesequence = degreesequence;
    }
    public Integer getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(Integer emp_id) {
        this.emp_id = emp_id;
    }
    public Integer getDegreetypes_id() {
        return degreetypes_id;
    }
    public void setDegreetypes_id(Integer degreetypes_id) {
        this.degreetypes_id = degreetypes_id;
    }
    public String getPassingyear() {
        return passingyear;
    }
    public void setPassingyear(String passingyear) {
        this.passingyear = passingyear;
    }
    public String getSkills() {
        return skills;
    }
    public void setSkills(String skills) {
        this.skills = skills;
    }
    public String getCertificate() {
        return certificate;
    }
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }
}
