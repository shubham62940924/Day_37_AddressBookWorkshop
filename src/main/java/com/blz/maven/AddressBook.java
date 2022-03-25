package com.blz.maven;
/* @Purpose : Welcome Message to AddressBook And Add Contacts 
 * @File : Address Book System Program
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {
	List<Contact> list;

	public AddressBook(List<Contact> list2) {
		this.list = list2;
	}

	public static void main(String[] args) {
		List<Contact> list = new ArrayList<Contact>();

		System.out.println("Welcome to AddressBook program");
		AddressBook addressBook = new AddressBook(list);
		addressBook.addContact();
		// using stream to Display the contacts
		System.out.println("Displaying the contacts of contactPersons");
		List<Object> result = list.stream().collect(Collectors.toList());
		System.out.println(result);

	}

	// To adding the contacts
	private void addContact() {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the First name");
		String firstName = src.nextLine();

		System.out.println("Enter the Last name");
		String lastName = src.nextLine();

		System.out.println("Enter the City name");
		String city = src.nextLine();

		System.out.println("Enter the State name");
		String state = src.nextLine();

		System.out.println("Enter the email");
		String email = src.nextLine();

		System.out.println("Enter the Phone number");
		String phoneNumber = src.nextLine();

		System.out.println("Enter the Zip");
		String zip = src.nextLine();

		Contact contact = new Contact(firstName, lastName, city, state, email, phoneNumber, zip);

		list.add(contact);
	}
}
