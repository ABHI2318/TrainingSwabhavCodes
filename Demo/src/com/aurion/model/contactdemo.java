package com.aurion.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Contact {
    private int contactID;
    private String firstName;
    private String lastName;
    private ArrayList<String> mobileNumbers;
    private ArrayList<String> emails;

    public Contact(int contactID, String firstName, String lastName) {
        this.contactID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumbers = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public void addMobileNumber(String mobileNumber) {
        mobileNumbers.add(mobileNumber);
    }

    public void addEmail(String email) {
        emails.add(email);
    }

    public void displayContact() {
        System.out.println(contactID + ": " + firstName + " " + lastName);
        for (String mobile : mobileNumbers) {
            System.out.println("  Mobile: " + mobile);
        }
        for (String email : emails) {
            System.out.println("  Email: " + email);
        }
    }

    public int getContactID() {
        return contactID;
    }
}

class User {
    private int userID;
    private String firstName;
    private String lastName;
    private HashMap<Integer, Contact> contacts;

    public User(int userID, String firstName, String lastName) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getContactID(), contact);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact contact : contacts.values()) {
                contact.displayContact();
            }
        }
    }

    public int getUserID() {
        return userID;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Contact getContact(int contactID) {
        return contacts.get(contactID);
    }
}

public class contactdemo {
    private static HashMap<Integer, User> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many users would you like to add? ");
        int userCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < userCount; i++) {
            System.out.println("Enter details for User " + (i + 1) + ": ");
            System.out.print("User ID: ");
            int userID = Integer.parseInt(scanner.nextLine());
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            users.put(userID, new User(userID, firstName, lastName));
        }

        while (true) {
            System.out.println("Select a user to manage contacts:");
            for (User user : users.values()) {
                System.out.println(user.getUserID() + ": " + user.getFullName());
            }
            System.out.print("Enter User ID or 0 to exit: ");
            int selectedUserID = Integer.parseInt(scanner.nextLine());

            if (selectedUserID == 0) {
                break;
            }

            User selectedUser = users.get(selectedUserID);
            if (selectedUser == null) {
                System.out.println("Invalid User ID.");
                continue;
            }

            System.out.println("Managing contacts for: " + selectedUser.getFullName());
            while (true) {
                System.out.println("1.Add contact 2.Remove contact 3.Update contact 4.Display contacts 5.Exit");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    System.out.println("Enter details for Contact: ");
                    System.out.print("Contact ID: ");
                    int contactID = Integer.parseInt(scanner.nextLine());
                    System.out.print("First Name: ");
                    String contactFirstName = scanner.nextLine();
                    System.out.print("Last Name: ");
                    String contactLastName = scanner.nextLine();

                    Contact contact = new Contact(contactID, contactFirstName, contactLastName);
                    while (true) {
                        System.out.println("Select the contact type 1.Mobile  2.Email  3.Finish");
                        int contactType = Integer.parseInt(scanner.nextLine());
                        if (contactType == 1) {
                            System.out.print("Enter mobile number: ");
                            String mobileNumber = scanner.nextLine();
                            contact.addMobileNumber(mobileNumber);
                        } else if (contactType == 2) {
                            System.out.print("Enter email: ");
                            String email = scanner.nextLine();
                            contact.addEmail(email);
                        } else if (contactType == 3) {
                            break;
                        }
                    }
                    selectedUser.addContact(contact);
                    System.out.println("Contact added successfully.");
                } else if (choice == 4) {
                    System.out.println("Contacts for " + selectedUser.getFullName() + ":");
                    selectedUser.displayContacts();
                } else if (choice == 5) {
                    break;
                }
            }

            System.out.print("Do you want to exit the application? (y/n): ");
            if (scanner.nextLine().equalsIgnoreCase("y")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Application exited.");
    }
}

