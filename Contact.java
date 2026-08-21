package cs320mod3;

public class Contact {
 // Contact information
private final  String contactId;
private String firstName;
private String lastName;
private String phoneNumber;
private String address;

//Constructor creates a contact and validates all required fields
public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {

	if(firstName == null || firstName.length()>10) {
		throw new IllegalArgumentException("Invalid Name");
		
		
	}
	
	if(lastName == null || lastName.length () >10) {
		throw new IllegalArgumentException("Invalid Name");
	}
	if (contactId == null || contactId.length()>10) {
		throw new IllegalArgumentException("Invalid ID");
	}
	
	if(phoneNumber == null || phoneNumber.length () != 10) {
		throw new IllegalArgumentException("Invalid Phone Number");
		
	}
	
	for (int i = 0; i < phoneNumber.length(); i++) {

	    char digit = phoneNumber.charAt(i);

	    if (!Character.isDigit(digit)) {
	        throw new IllegalArgumentException("Invalid Phone Number");
	    }
	}
	if(address == null || address.length()>30) {
		throw new IllegalArgumentException("Invalid Address");
		
	}
	this.firstName = firstName;
	this.lastName = lastName;
	this.contactId = contactId;
	this.phoneNumber = phoneNumber;
	this.address = address;
}
// Returns the contact's first name
 public String getFirstName() {
	 return firstName;
	 
 }
//Returns the contact's last name
 public String getLastName () {
	 return lastName;
	 
 }
//Returns the contact ID
 public String getContactId() {
	return contactId;
 }
 //Return the contact phone number
 public String getPhoneNumber() {
	 return phoneNumber;
	 
	 
 }
 //Returns the contact's Address 
 public String getAddress() {
	 return address;
 }
 
//Validates the new first name before updating the contact.
 public void setFirstName(String firstName) {

	    if (firstName == null || firstName.length() > 10) {
	        throw new IllegalArgumentException("Invalid First Name");
	    }

	    this.firstName = firstName;
	}
 // Validates the last name meets requirements //
 
 public void setLastName(String lastName) {
	    if (lastName == null || lastName.length() > 10) {
	        throw new IllegalArgumentException("Invalid Last Name");
	    }
	    this.lastName = lastName;
	}
// Validates Phone Number meets requirements //
	public void setPhoneNumber(String phoneNumber) {
	    if (phoneNumber == null || phoneNumber.length() != 10) {
	        throw new IllegalArgumentException("Invalid Phone Number");
	    }
	    for(int i =0; i < phoneNumber.length();i++) {
	    	
	    	char digit = phoneNumber.charAt(i);
	    	

	        if (!Character.isDigit(digit)) {
	            throw new IllegalArgumentException("Invalid Phone Number");
	    }
	    }
	    this.phoneNumber = phoneNumber;
	}
// Validates Address meets requirements//
	public void setAddress(String address) {
	    if (address == null || address.length() > 30) {
	        throw new IllegalArgumentException("Invalid Address");
	    }
	    this.address = address;
	}
}
