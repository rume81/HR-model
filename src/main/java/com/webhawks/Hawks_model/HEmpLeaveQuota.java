package com.webhawks.Hawks_model;

import java.util.ArrayList;
import java.util.List;

public class HEmpLeaveQuota extends HObject {
    private HEmployee emp;
    private List<HLeaveQuota> quota;
    
    public HEmpLeaveQuota()
    {
	quota = new ArrayList<HLeaveQuota>();
    }

    public HEmployee getEmp() {
        return emp;
    }

    public void setEmp(HEmployee emp) {
        this.emp = emp;
    }

    public List<HLeaveQuota> getQuota() {
        return quota;
    }

    public void setQuota(List<HLeaveQuota> quota) {
        this.quota = quota;
    }
}
