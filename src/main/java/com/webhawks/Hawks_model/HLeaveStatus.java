package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @author OS-10 Monsur
 *
 */
public class HLeaveStatus extends HObject {
    private Integer id;
    private Integer leave_id;
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
    public Integer getLeave_id() {
        return leave_id;
    }
    public void setLeave_id(Integer leave_id) {
        this.leave_id = leave_id;
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
