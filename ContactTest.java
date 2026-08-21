package cs320mod3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

    // Tests that a valid contact can be created.
    @Test
    void testContact() {

        Contact contact = new Contact(
                "24567",
                "Korie",
                "Sparks",
                "5554479693",
                "1316 Midland Dr"
        );

        assertEquals("24567", contact.getContactId());
        assertEquals("Korie", contact.getFirstName());
        assertEquals("Sparks", contact.getLastName());
        assertEquals("5554479693", contact.getPhoneNumber());
        assertEquals("1316 Midland Dr", contact.getAddress());
    }

    // Tests that a contact ID longer than 10 characters is rejected.
    @Test
    void testContactIdTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {

            new Contact(
                    "12345678901",
                    "Korie",
                    "Sparks",
                    "5554479693",
                    "1316 Midland Dr"
            );

        });
    }

    // Tests that a null contact ID is rejected.
    @Test
    void testContactIdNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    null,
                    "Korie",
                    "Sparks",
                    "5554479693",
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that a first name longer than 10 characters is rejected.
    @Test
    void testFirstNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "KorieMarieS",
                    "Sparks",
                    "5554479693",
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that a null first name is rejected.
    @Test
    void testFirstNameNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    null,
                    "Sparks",
                    "5554479693",
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that a last name longer than 10 characters is rejected.
    @Test
    void testLastNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "Korie",
                    "SparksSmith",
                    "5554479693",
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that a null last name is rejected.
    @Test
    void testLastNameNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "Korie",
                    null,
                    "5554479693",
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that a phone number that is too short is rejected.
    @Test
    void testPhoneNumberTooShort() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "Korie",
                    "Sparks",
                    "55544",
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that a phone number that is too long is rejected.
    @Test
    void testPhoneNumberTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "Korie",
                    "Sparks",
                    "55544796933",
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that a phone number containing non-digits is rejected.
    @Test
    void testPhoneNumberNonDigit() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "Korie",
                    "Sparks",
                    "ABCDEFGHIJ",
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that a null phone number is rejected.
    @Test
    void testPhoneNumberNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "Korie",
                    "Sparks",
                    null,
                    "1316 Midland Dr"
            );
        });
    }

    // Tests that an address longer than 30 characters is rejected.
    @Test
    void testAddressTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "Korie",
                    "Sparks",
                    "5554479693",
                    "This address is definitely longer than thirty characters"
            );
        });
    }

    // Tests that a null address is rejected.
    @Test
    void testAddressNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "24567",
                    "Korie",
                    "Sparks",
                    "5554479693",
                    null
            );
        });
    }
}