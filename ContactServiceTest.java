package cs320mod3;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;



class ContactServiceTest {



    private ContactService service;

    private Contact contact;



    @BeforeEach

    void setUp() {



        service = new ContactService();



        contact = new Contact(

                "24567",

                "Korie",

                "Sparks",

                "5554479693",

                "1316 Midland Dr");

    }



    // Tests that a contact can be added and stored.

    @Test

    void testAddContact() {



        service.addContact(contact);



        assertEquals(contact, service.getContact("24567"));

    }



    // Tests that duplicate contact IDs are rejected.

    @Test

    void testDuplicateContactId() {



        Contact contact2 = new Contact(

                "24567",

                "John",

                "Smith",

                "1234567890",

                "100 Main Street");



        service.addContact(contact);



        assertThrows(IllegalArgumentException.class, () -> {

            service.addContact(contact2);

        });

    }



    // Tests that a null contact cannot be added.

    @Test

    void testAddNullContact() {



        assertThrows(IllegalArgumentException.class, () -> {

            service.addContact(null);

        });

    }



    // Tests that a contact's first name can be updated.

    @Test

    void testUpdateFirstName() {



        service.addContact(contact);

        service.updateFirstName("24567", "Cody");



        assertEquals("Cody",

                service.getContact("24567").getFirstName());

    }



    // Tests that a contact's last name can be updated.

    @Test

    void testUpdateLastName() {



        service.addContact(contact);

        service.updateLastName("24567", "Jones");



        assertEquals("Jones",

                service.getContact("24567").getLastName());

    }



    // Tests that a contact's phone number can be updated.

    @Test

    void testUpdatePhoneNumber() {



        service.addContact(contact);

        service.updatePhoneNumber("24567", "1112223333");



        assertEquals("1112223333",

                service.getContact("24567").getPhoneNumber());

    }



    // Tests that a contact's address can be updated.

    @Test

    void testUpdateAddress() {



        service.addContact(contact);

        service.updateAddress("24567", "500 New Street");



        assertEquals("500 New Street",

                service.getContact("24567").getAddress());

    }



    // Tests that a contact can be deleted.

    @Test

    void testDeleteContact() {



        service.addContact(contact);

        service.deleteContact("24567");



        assertNull(service.getContact("24567"));

    }



    // Tests that deleting a contact that does not exist throws an exception.

    @Test

    void testDeleteContactNotFound() {



        assertThrows(IllegalArgumentException.class, () -> {

            service.deleteContact("99999");

        });

    }



    // Tests that updating a contact that does not exist throws an exception.

    @Test

    void testUpdateContactNotFound() {



        assertThrows(IllegalArgumentException.class, () -> {

            service.updateFirstName("99999", "Cody");

        });

    }

}