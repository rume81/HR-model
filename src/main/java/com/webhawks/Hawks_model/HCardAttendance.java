package com.webhawks.Hawks_model;

/**
 * @author OS-10 Monsur
 *
 */
public class HCardAttendance extends HObject {
    private Long ATTID;
    private Long USERID;
    private String CHECKTIME;
    private String CHECKTYPE;
    private Long VERIFYCODE;
    private String SENSORID;
    private String Memoinfo;
    private String WorkCode;
    private String sn;
    private Integer UserExtFmt;
    public Long getUSERID() {
        return USERID;
    }
    public void setUSERID(Long uSERID) {
        USERID = uSERID;
    }
    public String getCHECKTIME() {
        return CHECKTIME;
    }
    public void setCHECKTIME(String cHECKTIME) {
        CHECKTIME = cHECKTIME;
    }
    public String getCHECKTYPE() {
        return CHECKTYPE;
    }
    public void setCHECKTYPE(String cHECKTYPE) {
        CHECKTYPE = cHECKTYPE;
    }
    public Long getVERIFYCODE() {
        return VERIFYCODE;
    }
    public void setVERIFYCODE(Long vERIFYCODE) {
        VERIFYCODE = vERIFYCODE;
    }
    public String getSENSORID() {
        return SENSORID;
    }
    public void setSENSORID(String sENSORID) {
        SENSORID = sENSORID;
    }
    public String getMemoinfo() {
        return Memoinfo;
    }
    public void setMemoinfo(String memoinfo) {
        Memoinfo = memoinfo;
    }
    public String getWorkCode() {
        return WorkCode;
    }
    public void setWorkCode(String workCode) {
        WorkCode = workCode;
    }
    public String getSn() {
        return sn;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }
    public Integer getUserExtFmt() {
        return UserExtFmt;
    }
    public void setUserExtFmt(Integer userExtFmt) {
        UserExtFmt = userExtFmt;
    }
    public Long getATTID() {
        return ATTID;
    }
    public void setATTID(Long aTTID) {
        ATTID = aTTID;
    }
    
}
