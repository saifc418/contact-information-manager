package assignment3;

import java.io.*;

public class ContactManager {
	private static final int MAX_CONTACTS = 100;
	private Contact[] contacts = new Contact[MAX_CONTACTS];
	private int contactCount = 0;

	public void readContactsFromFile(String filename) {
		
		// Initialize contact count to 0
		contactCount = 0;
		
		// Initialize int i to 0
		int i = 0;
		
		// Loop while there is a valid contact in the array
		while (contacts[i] != null) {
			
			// Set the valid contact to null
			// Resets/clears the array before processing a new file
			contacts[i] = null;
			
			// Add 1 to i
			i += 1;
		}
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] parts = parseContact(line);
				if (parts.length == 3 && contactCount < MAX_CONTACTS) {
					try {
						validatePhoneNumber(parts[2].trim());
						contacts[contactCount++] = new Contact(parts[0].trim(), parts[1].trim(), parts[2].trim());
					} catch (NumberFormatException e) {
						System.out.println("Skipping invalid phone number format in contact: " + line);
					}
				} else {
					System.out.println("Skipping invalid contact format: " + line);
				}
			}
			// Output to the user the following message
			System.out.println("\nDisplaying all valid contacts:");
			// Display all the valid contacts with the method
			displayAllContacts();
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O error: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error processing line, array index out of bounds: " + e.getMessage());
		}
	}

	private String[] parseContact(String line) {
		if (line.contains(",")) {
			
			return line.split(",");
		} else if (line.contains("|")) {
			return line.split("\\|");
		} else if (line.contains(";")) {
			return line.split(";");
		} else {
			return new String[] {};
		}
	}

	// Checks if a phone number is valid. Otherwise, throws a NumberFormatException
	private void validatePhoneNumber(String phoneNumber) throws NumberFormatException {
		
		// Below is the ONLY valid phone number format
		// (843) 123-1235
		
		// If the phone number length is not 14, run this block
		if (phoneNumber.length() != 14) {
			
			// Throw a new NumberFormatException error
			throw new NumberFormatException();
		}
		
		// If the the phone number does not have the parentheses
		// and dashes in the correct spots, run this block
		if (phoneNumber.charAt(0) != '(' || 
				phoneNumber.charAt(4) != ')' 
				|| phoneNumber.charAt(5) != ' ' 
				|| phoneNumber.charAt(9) != '-') {
				
			// Throw a new NumberFormatException error
			throw new NumberFormatException();
		}
			
		// Try the following block
		try {
		
			// Loop to check the area code
			for (int i = 1; i < 4; i++) {
			
				// If a number in the area code is not a number, run this block
				if (!Character.isDigit(phoneNumber.charAt(i))) {
					
					// Throw a new NumberFormatException error
					throw new NumberFormatException();
				}
			}
			
			// Loop for the three digits following the area code
			for (int i = 6; i < 9; i++) {
				
				// If a number in this section of the phone number is not a number,
				// run this block
				if (!Character.isDigit(phoneNumber.charAt(i))) {
					
					// Throw a new NumberFormatException error
					throw new NumberFormatException();
				}
			}
			
			// Loop for the last four digits of the phone number
			for (int i = 10; i < 14; i++) {
				
				// If a number in this section of the phone number is not a number,
				// run this block
				if (!Character.isDigit(phoneNumber.charAt(i))) {
					
					// Throw a new NumberFormatException error
					throw new NumberFormatException();
				}
			}
		}
		
		// If the try statement fails, catch NumberFormatException error
		catch (NumberFormatException e) {
		
			// Throw a new NumberFormatException error
			throw new NumberFormatException();
		}
	}

	// Display all the valid contacts processed from the file
	public void displayAllContacts() {

		// Loop for the length of the array contacts, containing
		// all the valid contacts
		for (int i = 0; i < contacts.length; i++) {
			
			// If the loop hits an empty spot in the array (no
			// more contacts), run this block
			if (contacts[i] == null) {
				
				// Break out of the for loop
				break;
			}
			
			// Print out the contact's name, address, and phone number
			System.out.print(contacts[i].getName() + ",");
			System.out.print(contacts[i].getAddress() + ",");
			System.out.println(contacts[i].getPhoneNumber());
		}
	}
}
