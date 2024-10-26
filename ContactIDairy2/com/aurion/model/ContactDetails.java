package com.aurion.model;

import java.util.ArrayList;
import java.util.List;

public class ContactDetails {
    private List<Mobile> mobiles;
    private List<email> emails;

   
    public ContactDetails() {
        this.mobiles = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    
    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public List<email> getEmails() {
        return emails;
    }

 
    public void addMobile(Mobile mobile) {
        mobiles.add(mobile);
    }

    public void addEmail(email email) {
        emails.add(email);
    }

    public void removeMobile(Mobile mobile) {
        mobiles.remove(mobile);
    }

    public void removeEmail(email email) {
        emails.remove(email);
    }


    public void updateMobile(int index, Mobile mobile) {
        if (index >= 0 && index < mobiles.size()) {
            mobiles.set(index, mobile);
        }
    }

    public void updateEmail(int index, email email) {
        if (index >= 0 && index < emails.size()) {
            emails.set(index, email);
        }
    }
}
