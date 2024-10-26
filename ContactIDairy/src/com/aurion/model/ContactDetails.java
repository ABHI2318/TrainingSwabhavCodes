package com.aurion.model;

import java.util.ArrayList;
import java.util.List;

public class ContactDetails {
    private List<Mobile> mobiles = new ArrayList<>();
    private List<email> emails = new ArrayList<>();

    public List<Mobile> getMobiles() {
        return mobiles;
    }

    public void addMobile(Mobile mobile) {
        this.mobiles.add(mobile);
    }

    public List<email> getEmails() {
        return emails;
    }

    public void addEmail(email email) {
        this.emails.add(email);
    }
}
