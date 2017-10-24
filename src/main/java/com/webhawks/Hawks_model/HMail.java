package com.webhawks.Hawks_model;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * @author OS-10 Monsur
 *
 */
public class HMail extends HObject {
    private Integer mail_id;
    private String from;
    private String to;
    private String cc;
    private String bcc;
    private String subject;
    private String date;
    private String msg;
    private Integer status;
    private String sendTime;
    
    public void escapeEcmaScript()
    {
	from = StringEscapeUtils.escapeEcmaScript(from);   
	to = StringEscapeUtils.escapeEcmaScript(to); 
	cc = StringEscapeUtils.escapeEcmaScript(cc); 
	bcc = StringEscapeUtils.escapeEcmaScript(bcc);
	subject = StringEscapeUtils.escapeEcmaScript(subject);
	msg = StringEscapeUtils.escapeEcmaScript(msg);
    }
    
    public Integer getMail_id() {
        return mail_id;
    }
    public void setMail_id(Integer mail_id) {
        this.mail_id = mail_id;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public String getCc() {
        return cc;
    }
    public void setCc(String cc) {
        this.cc = cc;
    }
    public String getBcc() {
        return bcc;
    }
    public void setBcc(String bcc) {
        this.bcc = bcc;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getSendTime() {
        return sendTime;
    }
    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    
}
