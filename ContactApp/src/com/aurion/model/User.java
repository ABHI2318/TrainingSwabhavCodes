package com.aurion.model;

import java.util.ArrayList;

public class User {
	private int userId;
    private String firstName;
    private String lastName;
    private ArrayList<IContact> contacts;
	public User(int userId, String firstName, String lastName, ArrayList<IContact> contacts) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contacts = contacts;
	}
	
	public void addContact(IContact contact) {
        contacts.add(contact);
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

    public ArrayList<IContact> getContacts() {
        return contacts;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User ID: ").append(userId)
          .append(", Name: ").append(firstName).append(" ").append(lastName)
          .append(", Contacts: \n");

        for (IContact contact : contacts) {
            sb.append(contact.toString()).append("\n");
        }
        return sb.toString();
    }

}
