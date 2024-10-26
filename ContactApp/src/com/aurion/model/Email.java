package com.aurion.model;

public class Email implements IContactType {  // Remove abstract
    private String mobile;

    public Email(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String getType() {
        return "Mobile";
    }

    @Override
    public String getValue() {
        return mobile;
    }

    @Override
    public String toString() {
        return "Mobile [mobile=" + mobile + "]";
    }
}
