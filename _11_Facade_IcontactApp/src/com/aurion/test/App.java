package com.aurion.test;

import com.aurion.model.ContactManagementFacade;
import com.aurion.model.User;

public class App {

    private static ContactManagementFacade facade = new ContactManagementFacade();

    public static void main(String[] args) {
        
        facade.addUserDetails();

        boolean continueApp = true;

        
        while (continueApp) {
            User selectedUser = facade.selectUser();
            if (selectedUser == null) {
                continueApp = false;
                break;
            }

            facade.manageUserContacts(selectedUser);

            System.out.print("Do you want to exit the application? (y/n): ");
            if (new java.util.Scanner(System.in).next().equalsIgnoreCase("y")) {
                continueApp = false;
            }
        }
    }
}
