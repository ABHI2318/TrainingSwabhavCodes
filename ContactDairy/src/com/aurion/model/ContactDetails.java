package com.aurion.model;



import java.util.ArrayList;
import java.util.List;

public class ContactDetails  {
	 private List<Mobile> mobiles; 
	 private List<email> emails;
	 
	 
	 public ContactDetails() {
	        this.mobiles = new ArrayList<>();
	        this.emails = new ArrayList<>();
	    }


	 // Methods to add mobile and email
    public void addMobile(Mobile mobile) {
        mobiles.add(mobile);
    }

    public void addEmail(email email) {
        emails.add(email);
    }

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public List<email> getEmails() {
        return emails;
    }


	@Override
	public String toString() {
		return "ContactDetails [mobiles=" + mobiles + ", emails=" + emails + "]";
	}


	 public boolean removeMobile(String mobileNumber) {
	        
	        return mobiles.removeIf(mobile -> mobile.getNumber().equals(mobileNumber));
	    }  
	 
	 public boolean removeEmail(String emailAddress) {
	      
	        return emails.removeIf(email -> email.getAddress().equals(emailAddress));
	    }
	
	
}
