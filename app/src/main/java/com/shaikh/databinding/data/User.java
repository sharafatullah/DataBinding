package com.shaikh.databinding.data;

public class User {

    String strfName;
    String strlName;
    String strDesignation;
    int intSalary;

    public User(String strfName, String strlName, String strDesignation, int intSalary) {
        this.strfName = strfName;
        this.strlName = strlName;
        this.strDesignation = strDesignation;
        this.intSalary = intSalary;
    }

    public String getStrfName() {
        return strfName;
    }

    public void setStrfName(String strfName) {
        this.strfName = strfName;
    }

    public String getStrlName() {
        return strlName;
    }

    public void setStrlName(String strlName) {
        this.strlName = strlName;
    }

    public String getStrDesignation() {
        return strDesignation;
    }

    public void setStrDesignation(String strDesignation) {
        this.strDesignation = strDesignation;
    }

    public int getIntSalary() {
        return intSalary;
    }

    public void setIntSalary(int intSalary) {
        this.intSalary = intSalary;
    }
}
