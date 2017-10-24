package com.webhawks.Hawks_model;

import java.util.Date;

import org.apache.commons.lang3.StringEscapeUtils;

public class HOfficeOutgoing extends HObject {
	private Integer id;
    private Integer emp_id;
    private Date date;
    private String ftime;
    private String ttime;
    private String reason;
    private Integer status;  //0-raised, 1-rejected, 2-approved
    private Integer approvar1;
    private Integer approvar2;
    private Integer approvar3;
    private Integer approvar4;
    private Integer approvar5;
    private Boolean app1state;
    private Boolean app2state;
    private Boolean app3state;
    private Boolean app4state;
    private Boolean app5state;
    private String apllieddate;
    private String modifydate;
    
    public void escapeEcmaScript()
    {
	reason = StringEscapeUtils.escapeEcmaScript(reason);    
    }
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFtime() {
		return ftime;
	}
	public void setFtime(String ftime) {
		this.ftime = ftime;
	}
	public String getTtime() {
		return ttime;
	}
	public void setTtime(String ttime) {
		this.ttime = ttime;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getApprovar1() {
		return approvar1;
	}
	public void setApprovar1(Integer approvar1) {
		this.approvar1 = approvar1;
	}
	public Integer getApprovar2() {
		return approvar2;
	}
	public void setApprovar2(Integer approvar2) {
		this.approvar2 = approvar2;
	}
	public Integer getApprovar3() {
		return approvar3;
	}
	public void setApprovar3(Integer approvar3) {
		this.approvar3 = approvar3;
	}
	public Integer getApprovar4() {
		return approvar4;
	}
	public void setApprovar4(Integer approvar4) {
		this.approvar4 = approvar4;
	}
	public Integer getApprovar5() {
		return approvar5;
	}
	public void setApprovar5(Integer approvar5) {
		this.approvar5 = approvar5;
	}
	public Boolean getApp1state() {
		return app1state;
	}
	public void setApp1state(Boolean app1state) {
		this.app1state = app1state;
	}
	public Boolean getApp2state() {
		return app2state;
	}
	public void setApp2state(Boolean app2state) {
		this.app2state = app2state;
	}
	public Boolean getApp3state() {
		return app3state;
	}
	public void setApp3state(Boolean app3state) {
		this.app3state = app3state;
	}
	public Boolean getApp4state() {
		return app4state;
	}
	public void setApp4state(Boolean app4state) {
		this.app4state = app4state;
	}
	public Boolean getApp5state() {
		return app5state;
	}
	public void setApp5state(Boolean app5state) {
		this.app5state = app5state;
	}
	public String getApllieddate() {
		return apllieddate;
	}
	public void setApllieddate(String apllieddate) {
		this.apllieddate = apllieddate;
	}
	public String getModifydate() {
		return modifydate;
	}
	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}
}
