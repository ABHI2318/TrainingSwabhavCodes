package com.aurion.model;

public interface IContactManager {
    void addContact(User user);
    void removeContact(User user);
    void updateContact(User user);
    void manageUserContacts(User selectedUser);
}
