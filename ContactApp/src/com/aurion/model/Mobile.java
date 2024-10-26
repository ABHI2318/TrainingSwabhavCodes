package com.aurion.model;

public class Mobile implements IContactType {  // Remove abstract
    private String email;

    public Mobile(String email) {
        this.email = email;
    }

    @Override
    public String getType() {
        return "Email";
    }

    @Override
    public String getValue() {
        return email;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", Email: " + email;
    }
}
