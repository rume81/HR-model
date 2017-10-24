package com.webhawks.Hawks_model;

public class HNotice extends HObject {
    private Integer notice_id;
    private String title;
    private String details;
    private String expdate;
    private String accesslist;
    
    public Integer getNotice_id() {
        return notice_id;
    }
    public void setNotice_id(Integer notice_id) {
        this.notice_id = notice_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public String getExpdate() {
        return expdate;
    }
    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }
    public String getAccesslist() {
        return accesslist;
    }
    public void setAccesslist(String accesslist) {
        this.accesslist = accesslist;
    }
}
