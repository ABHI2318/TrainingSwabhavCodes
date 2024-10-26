package com.aurion.model;

public interface IUserManager {
    void addUserDetails();
    User selectUser();
    void displayContacts(User user);
}
