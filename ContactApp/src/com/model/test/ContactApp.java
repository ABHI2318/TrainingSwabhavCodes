package com.model.test;

import com.aurion.model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a user
        System.out.println("Enter User ID:");
        int userId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter User First Name:");
        String userFirstName = scanner.nextLine();
        System.out.println("Enter User Last Name:");
        String userLastName = scanner.nextLine();
        ArrayList<IContact> contacts=new ArrayList<>();

        User user = new User(userId, userFirstName, userLastName,contacts);

        // Input for number of contacts
        System.out.println("How many contacts do you want to add?");
        int numberOfContacts = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Adding contacts
        for (int i = 0; i < numberOfContacts; i++) {
            System.out.println("Enter Contact ID:");
            int contactId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.println("Enter Contact First Name:");
            String contactFirstName = scanner.nextLine();
            System.out.println("Enter Contact Last Name:");
            String contactLastName = scanner.nextLine();
            System.out.println("Enter Contact Type (email/mobile):");
            String contactType = scanner.nextLine();

            IContactType contactTypeObj = null;

            if (contactType.equalsIgnoreCase("email")) {
                System.out.println("Enter Email Address:");
                String email = scanner.nextLine();
                contactTypeObj = new Email(email); // Create Email object
            } else if (contactType.equalsIgnoreCase("mobile")) {
                System.out.println("Enter Mobile Number:");
                String mobile = scanner.nextLine();
                contactTypeObj = new Mobile(mobile); // Create Mobile object
            }

            // Create a Contact and add it to the user
            IContact contact = new ContactImpl(contactId, contactFirstName, contactLastName, contactTypeObj);
            user.addContact(contact); // This should now work correctly
        }

        // Display user and contact information
        System.out.println("User and Contact Details:");
        System.out.println(user);

        scanner.close();
    }
}
