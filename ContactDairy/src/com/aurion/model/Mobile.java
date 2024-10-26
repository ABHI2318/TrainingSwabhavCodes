package com.aurion.model;



public class Mobile extends ContactDetails  {

	    private String number;
	    private ContactType contactType; 

	    public Mobile(String number) {
	        this.number = number;
	        this.contactType = ContactType.MOBILE; 
	    }

	    public String getNumber() {
	        return number;
	    }

	    public ContactType getContactType() {
	        return contactType;
	    }

	    @Override
	    public String toString() {
	        return "Mobile [number=" + number + ", contactType=" + contactType + "]";
	    }
	}

