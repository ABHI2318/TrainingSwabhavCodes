package com.aurion.test;

import com.aurion.model.*;
import com.aurion.exceptions.EmailValidationException;
import com.aurion.exceptions.MobileValidationException;

import java.util.List;
import java.util.Scanner;

public class App implements IUserManager, IContactManager {

	private static Scanner scanner = new Scanner(System.in);
	private static List<User> users = new ArrayList<>();

	public static void main(String[] args) {
		App app = new App();
		app.addUserDetails();
		app.manageContactsApp();
	}

	public void manageContactsApp() {
		boolean continueApp = true;
		while (continueApp) {
			User selectedUser = selectUser();
			if (selectedUser == null) {
				continueApp = false;
				break;
			}
			manageUserContacts(selectedUser);
			System.out.print("Do you want to exit the application? (y/n): ");
			if (scanner.next().equalsIgnoreCase("y")) {
				continueApp = false;
			}
		}
	}

	@Override
	public void addUserDetails() {
		System.out.print("How many users would you like to add? ");
		int numberOfUsers = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numberOfUsers; i++) {
			System.out.println("Enter details for User " + (i + 1) + ": ");
			System.out.print("User ID: ");
			int userId = scanner.nextInt();
			scanner.nextLine();
			System.out.print("First Name: ");
			String firstName = scanner.nextLine();
			System.out.print("Last Name: ");
			String lastName = scanner.nextLine();
			users.add(new User(userId, firstName, lastName, true));
		}
	}

	@Override
	public User selectUser() {
		System.out.println("Select a user to manage contacts:");
		for (User user : users) {
			System.out.println(user.getUserId() + ": " + user.getFirstName() + " " + user.getLastName());
		}
		System.out.print("Enter User ID or 0 to exit: ");
		int userId = scanner.nextInt();
		scanner.nextLine();
		if (userId == 0) {
			return null;
		}
		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void displayContacts(User user) {
		if (user.getContacts().isEmpty()) {
			System.out.println("No contacts available for this user.");
		} else {
			System.out.println("Contacts for " + user.getFirstName() + " " + user.getLastName() + ":");
			for (contact contact : user.getContacts()) {
				System.out
						.println(contact.getContact_id() + ": " + contact.getFirstName() + " " + contact.getLastName());
				for (ContactDetails details : contact.getContactDetails()) {
					System.out.println("Mobile Numbers:");
					for (Mobile mobile : details.getMobiles()) {
						System.out.println(mobile.getNumber());
					}
					System.out.println("Emails:");
					for (email email : details.getEmails()) {
						System.out.println(email.getAddress());
					}
				}
			}
		}
	}

	@Override
	public void addContact(User user) {
		System.out.println("Adding new contact for " + user.getFirstName() + " " + user.getLastName() + ": ");
		System.out.print("Contact ID: ");
		int contactId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("First Name: ");
		String firstName = scanner.nextLine();
		System.out.print("Last Name: ");
		String lastName = scanner.nextLine();
		contact newContact = new contact(contactId, firstName, lastName);

		System.out.print("How many mobile numbers to add? ");
		int numberOfMobiles = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numberOfMobiles; i++) {
			System.out.print("Enter mobile number: ");
			String mobileNumber = scanner.nextLine();
			try {
				Validator.validateMobile(mobileNumber);
				newContact.addContactDetail(new ContactDetails());
				newContact.getContactDetails().get(0).addMobile(new Mobile(mobileNumber));
			} catch (MobileValidationException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.print("How many email addresses to add? ");
		int numberOfEmails = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < numberOfEmails; i++) {
			System.out.print("Enter email address: ");
			String emailAddress = scanner.nextLine();
			try {
				Validator.validateEmail(emailAddress);
				newContact.getContactDetails().get(0).addEmail(new email(emailAddress));
			} catch (EmailValidationException e) {
				System.out.println(e.getMessage());
			}
		}

		user.addContact(newContact);
	}

	@Override
	public void removeContact(User user) {
		displayContacts(user);
		System.out.print("Enter the Contact ID to remove: ");
		int contactId = scanner.nextInt();
		scanner.nextLine();

		contact contactToRemove = null;
		for (contact c : user.getContacts()) {
			if (c.getContact_id() == contactId) {
				contactToRemove = c;
				break;
			}
		}

		if (contactToRemove != null) {
			user.getContacts().remove(contactToRemove);
			System.out.println("Contact removed successfully.");
		} else {
			System.out.println("Contact not found.");
		}
	}

	@Override
	public void updateContact(User user) {
		displayContacts(user);
		System.out.print("Enter the Contact ID to update: ");
		int contactId = scanner.nextInt();
		scanner.nextLine();
		for (contact contact : user.getContacts()) {
			if (contact.getContact_id() == contactId) {
				System.out.println("Updating contact for " + contact.getFirstName() + " " + contact.getLastName());
				addContact(user);
				return;
			}
		}
	}

	@Override
	public void manageUserContacts(User selectedUser) {
		boolean continueManaging = true;
		while (continueManaging) {
			System.out.println("1. Add Contact");
			System.out.println("2. Remove Contact");
			System.out.println("3. Update Contact");
			System.out.println("4. Display Contacts");
			System.out.println("5. Exit");
			System.out.print("Select an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				addContact(selectedUser);
				break;
			case 2:
				removeContact(selectedUser);
				break;
			case 3:
				updateContact(selectedUser);
				break;
			case 4:
				displayContacts(selectedUser);
				break;
			case 5:
				continueManaging = false;
				break;
			default:
				System.out.println("Invalid option. Try again.");
				break;
			}
		}
	}
}
