package com.blz.maven;

public class Contact {
	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public String email;
	public String phoneNumber;
	public String zip;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	public Contact(String firstName, String lastName2, String city2, String state2, String email2, String phoneNumber2,
			String zip2) {
		this.firstName = firstName;
		this.lastName = lastName2;
		this.city = city2;
		this.state = state2;
		this.email = email2;
		this.phoneNumber = phoneNumber2;
		this.zip = zip2;

	}

	public String toString() {
		return "\n FirstName=" + firstName + ", LastName=" + lastName + ", city=" + city + ", state=" + state
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", zip=" + zip + "\n";
	}
}
