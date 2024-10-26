package com.aurion.model;

public class email {
	 private String address;
	 private ContactType contactType;
	    
	    public email(String address) {
	        this.address = address;
	        this.contactType = ContactType.EMAIL; 
	    }

	    public String getAddress() {
	        return address;
	    }

	    public ContactType getContactType() {
	        return contactType;
	    }

	    @Override
	    public String toString() {
	        return "Email [address=" + address + ", contactType=" + contactType + "]";
	    }
	}
