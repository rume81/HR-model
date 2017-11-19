package com.webhawks.Hawks_model;

public class HPolicy extends HObject {
    private Integer id;
    private String policy_name;
    private HUpload policy_file;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPolicy_name() {
        return policy_name;
    }
    public void setPolicy_name(String policy_name) {
        this.policy_name = policy_name;
    }
    public HUpload getPolicy_file() {
        return policy_file;
    }
    public void setPolicy_file(HUpload policy_file) {
        this.policy_file = policy_file;
    }
    
    
}
