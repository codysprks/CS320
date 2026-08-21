package cs320mod3;



import java.util.HashMap;



public class ContactService {



    // Stores the contacts in memory while the program is running

    private HashMap<String, Contact> contacts = new HashMap<>();



    // Creates an empty contact service

    public ContactService() {



    }



    // Adds a contact after confirming that its contact ID is unique

    public void addContact(Contact contact) {



        if (contact == null) {

            throw new IllegalArgumentException("Contact cannot be null");

        }



        if (contacts.containsKey(contact.getContactId())) {

            throw new IllegalArgumentException("Duplicate Contact Id");

        }



        contacts.put(contact.getContactId(), contact);

    }



    // Searches for a contact by ID and removes it

    public void deleteContact(String contactId) {



        if (!contacts.containsKey(contactId)) {

            throw new IllegalArgumentException("Contact not found");

        }



        contacts.remove(contactId);

    }



    // Locates a contact by ID and changes its first name

    public void updateFirstName(String contactId, String firstName) {



        Contact contact = contacts.get(contactId);



        if (contact == null) {

            throw new IllegalArgumentException("Contact not found");

        }



        contact.setFirstName(firstName);

    }



    // Locates a contact by ID and changes its last name

    public void updateLastName(String contactId, String lastName) {



        Contact contact = contacts.get(contactId);



        if (contact == null) {

            throw new IllegalArgumentException("Contact not found");

        }



        contact.setLastName(lastName);

    }



    // Locates a contact by ID and changes its phone number

    public void updatePhoneNumber(String contactId, String phoneNumber) {



        Contact contact = contacts.get(contactId);



        if (contact == null) {

            throw new IllegalArgumentException("Contact not found");

        }



        contact.setPhoneNumber(phoneNumber);

    }



    // Locates a contact by ID and changes its address

    public void updateAddress(String contactId, String address) {



        Contact contact = contacts.get(contactId);



        if (contact == null) {

            throw new IllegalArgumentException("Contact not found");

        }



        contact.setAddress(address);

    }



    // Returns the contact that matches the given contact ID

    public Contact getContact(String contactId) {



        return contacts.get(contactId);

    }

}