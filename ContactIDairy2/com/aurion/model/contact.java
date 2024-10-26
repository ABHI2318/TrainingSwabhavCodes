package com.aurion.model;

import java.util.ArrayList;
import java.util.List;

public class contact {
    private int contact_id;
    private String firstName;
    private String lastName;
    private List<ContactDetails> contactDetails;

    public contact(int contact_id, String firstName, String lastName) {
        this.contact_id = contact_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactDetails = new ArrayList<>();
    }

    public int getContact_id() {
        return contact_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    public void addContactDetail(ContactDetails details) {
        contactDetails.add(details);
    }
}
