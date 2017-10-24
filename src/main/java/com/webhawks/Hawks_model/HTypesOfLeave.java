package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @author OS-10 Monsur
 *
 */
public class HTypesOfLeave extends HObject {
    private Integer id;
    private String leavetype;
    private Boolean isquota;
    private Boolean iscontinue;
    private Float leavededuct;
    private Integer deductfrom;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLeavetype() {
        return leavetype;
    }
    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype;
    }
    public Boolean getIsquota() {
        return isquota;
    }
    public void setIsquota(Boolean isquota) {
        this.isquota = isquota;
    }
    public Boolean getIscontinue() {
        return iscontinue;
    }
    public void setIscontinue(Boolean iscontinue) {
        this.iscontinue = iscontinue;
    }
    public void escapeEcmaScript()
    {
	leavetype = StringEscapeUtils.escapeEcmaScript(leavetype);
    }
    public Float getLeavededuct() {
        return leavededuct;
    }
    public void setLeavededuct(Float leavededuct) {
        this.leavededuct = leavededuct;
    }
	public Integer getDeductfrom() {
		return deductfrom;
	}
	public void setDeductfrom(Integer deductfrom) {
		this.deductfrom = deductfrom;
	}    
}
