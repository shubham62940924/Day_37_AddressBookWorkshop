package com.blz.maven;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AddressBookTest {

//	/**
//	 * Create the test case
//	 *
//	 * @param testName name of the test case
//	 * @return
//	 */
//	public String AddressBookTest(String testName) {
//		return (testName);
//	}
//
//	/**
//	 * @return the suite of tests being tested
//	 */
//	public static Test suite() {
//		return new TestSuite(AddressBookTest.class);
//	}
//
//	public void testAddContacts() {
//		assertTrue(true);
	private AddressBookTest addressBookTest = new AddressBookTest() {
	};

	@test
	public void CreateContacts() {
		Contact contact = new Contact("Shubham", "singh", "Varanasi", "UP", "ss329222@gmail.com", "6380236945",
				"221105");
		contact.setFirstName("Shubham");
		// Response response = AddressBookTest.createContact(contact);
		Assert.assertEquals("shubham", contact);

	}
}
