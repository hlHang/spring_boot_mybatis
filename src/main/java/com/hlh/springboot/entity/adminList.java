package com.hlh.springboot.entity;



public class adminList {
    private Integer adminNo;
    private String adminName;
    private String adminPassword;

    public adminList(Integer adminNo, String adminName, String adminPassword) {
        this.adminNo = adminNo;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    public adminList() {
        super();
    }

    public Integer getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(Integer adminNo) {
        this.adminNo = adminNo;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
