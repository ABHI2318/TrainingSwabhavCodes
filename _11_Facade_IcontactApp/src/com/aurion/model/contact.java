package com.aurion.model;

import java.util.ArrayList;
import java.util.List;

public class contact {
    private int contact_id;
    private String firstName;
    private String lastName;
    private List<ContactDetails> contactDetails = new ArrayList<>();

    public contact(int contact_id, String firstName, String lastName) {
        this.contact_id = contact_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getContact_id() {
        return contact_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<ContactDetails> getContactDetails() {
        return contactDetails;
    }

    public void addContactDetail(ContactDetails contactDetail) {
        this.contactDetails.add(contactDetail);
    }
}
