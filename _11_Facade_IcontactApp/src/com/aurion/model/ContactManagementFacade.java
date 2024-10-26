package com.aurion.model;

import com.aurion.exceptions.EmailValidationException;
import com.aurion.exceptions.MobileValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManagementFacade {
	private List<User> users = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);

	
	public void addUserDetails() {
		System.out.print("Number of users want to add? ");
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

	
	public void displayContacts(User user) {
		if (user.getContacts().isEmpty()) {
			System.out.println("No contacts available for this user.");
		} else {
			System.out.println("Contacts for " + user.getFirstName() + " " + user.getLastName() + ":");
			for (contact contact : user.getContacts()) {
				System.out
						.println(contact.getContact_id() + ": " + contact.getFirstName() + " " + contact.getLastName());

				List<ContactDetails> contactDetailsList = contact.getContactDetails();

				if (contactDetailsList != null && !contactDetailsList.isEmpty()) {
					for (ContactDetails contactDetails : contactDetailsList) {

						if (contactDetails.getMobiles() != null && !contactDetails.getMobiles().isEmpty()) {
							for (Mobile mobile : contactDetails.getMobiles()) {
								System.out.println("  Mobile: " + mobile.getNumber());
							}
						}

						if (contactDetails.getEmails() != null && !contactDetails.getEmails().isEmpty()) {
							for (email email : contactDetails.getEmails()) {
								System.out.println("  Email: " + email.getAddress());
							}
						}
					}
				} else {
					System.out.println("  No contact details available.");
				}
			}
		}
	}


	public void addContact(User user) {
		System.out.println("Enter details for Contact: ");
		System.out.print("Contact ID: ");
		int contactId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("First Name: ");
		String contactFirstName = scanner.nextLine();
		System.out.print("Last Name: ");
		String contactLastName = scanner.nextLine();

		contact contact = new contact(contactId, contactFirstName, contactLastName);
		ContactDetails contactDetails = new ContactDetails();

		boolean enterContactDetails = true;
		while (enterContactDetails) {
			System.out.println("Select the contact type 1.Mobile  2.Email  3.Finish");
			int contactType = scanner.nextInt();
			scanner.nextLine();

			if (contactType == 1) {
				System.out.println("Enter mobile number: ");
				String mobileNumber = scanner.nextLine();
				try {
					Validator.validateMobile(mobileNumber);
					contactDetails.addMobile(new Mobile(mobileNumber));
				} catch (MobileValidationException exception) {
					System.out.println(exception.getMessage());
				}
			} else if (contactType == 2) {
				System.out.println("Enter email: ");
				String emailAddress = scanner.nextLine();
				try {
					Validator.validateEmail(emailAddress);
					contactDetails.addEmail(new email(emailAddress));
				} catch (EmailValidationException exception) {
					System.out.println(exception.getMessage());
				}
			} else if (contactType == 3) {
				enterContactDetails = false;
			} else {
				System.out.println("Invalid option.");
			}
		}

		contact.addContactDetail(contactDetails);
		user.getContacts().add(contact);
		System.out.println("Contact added successfully.");
	}

	
	public void removeContact(User user) {
		if (user.getContacts().isEmpty()) {
			System.out.println("No contacts found.");
			return;
		}

		displayContacts(user);

		System.out.print("Enter the Contact ID to remove: ");
		int contactId = scanner.nextInt();
		scanner.nextLine();

		contact contactToRemove = null;
		for (contact contact : user.getContacts()) {
			if (contact.getContact_id() == contactId) {
				contactToRemove = contact;
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

	
	public void manageUserContacts(User selectedUser) {
		System.out.println("Managing contacts for: " + selectedUser.getFirstName() + " " + selectedUser.getLastName());
		boolean manageContacts = true;

		while (manageContacts) {
			System.out.println("1.Add contact 2.Remove contact 3.Display contacts 4.Exit");
			int userChoice = scanner.nextInt();
			scanner.nextLine();

			switch (userChoice) {
			case 1:
				addContact(selectedUser);
				break;
			case 2:
				removeContact(selectedUser);
				break;
			case 3:
				displayContacts(selectedUser);
				break;
			case 4:
				manageContacts = false;
				break;
			default:
				System.out.println("Invalid option.");
			}
		}
	}
}