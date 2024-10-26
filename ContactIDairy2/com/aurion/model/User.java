package com.aurion.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private boolean isActive;
    private List<contact> contacts;

    public User(int userId, String firstName, String lastName, boolean isActive) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.contacts = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<contact> getContacts() {
        return contacts;
    }

    public void addContact(contact contact) {
        this.contacts.add(contact);
    }
}