package com.aurion.model;

public class ContactImpl implements IContact {
	 private int contactId;
	    private String firstName;
	    private String lastName;
	    private IContactType contactType;

	    public ContactImpl(int contactId, String firstName, String lastName, IContactType contactType) {
	        this.contactId = contactId;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.contactType = contactType;
	    }

	    @Override
	    public int getContactId() {
	        return contactId;
	    }

	    @Override
	    public String getFirstName() {
	        return firstName;
	    }

	    @Override
	    public String getLastName() {
	        return lastName;
	    }

	    @Override
	    public IContactType getContactType() {
	        return contactType;
	    }

	    @Override
	    public String toString() {
	        return "Contact ID: " + contactId + ", Name: " + firstName + " " + lastName + ", " + contactType.toString();
	    }

}
