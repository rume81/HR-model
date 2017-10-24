package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;

public class HResignationStatus extends HObject {
    private Integer id;
    private Integer resig_id;
    private Integer approver_id;
    private String comments;
    private Integer approvalstate;
    private String date;
    private Integer approvarSeq;
    
    public void escapeEcmaScript()
    {
	comments = StringEscapeUtils.escapeEcmaScript(comments);    
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResig_id() {
        return resig_id;
    }

    public void setResig_id(Integer resig_id) {
        this.resig_id = resig_id;
    }

    public Integer getApprover_id() {
        return approver_id;
    }

    public void setApprover_id(Integer approver_id) {
        this.approver_id = approver_id;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(Integer approvalstate) {
        this.approvalstate = approvalstate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getApprovarSeq() {
        return approvarSeq;
    }

    public void setApprovarSeq(Integer approvarSeq) {
        this.approvarSeq = approvarSeq;
    }

}
