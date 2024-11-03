package contactInformationManager;

public class Contact {
	
	// Declare the strings name, address, and phoneNumber
	private String name;
	private String address;
	private String phoneNumber;
	
	// Create the constructor with the following parameters
	public Contact(String name, String address, String phoneNumber) {
	
		// Trim the name, address, and phone number and initialize them
		this.name = name.trim();
		this.address = address.trim();
		this.phoneNumber = phoneNumber.trim();	
	}

	// Method to return the name of contact
	public String getName() {
		
		// Return the name
		return name;
	}
	
	// Method to set the name of contact
	public void setName(String name) {
		
		// Set the name
		this.name = name;
	}
	
	// Method to return the address of contact
	public String getAddress() {
		
		// Return the address
		return address;
	}
	
	// Method to set the address of contact
	public void setAddress (String address) {
		
		// Set the address
		this.address = address;
	}
	
	// Method to return the phone number of contact
	public String getPhoneNumber() {
		
		// Return the phone number
		return phoneNumber;
	}
	
	// Method to set the phone number of contact
	public void setPhoneNumber(String phoneNumber) {
		
		// Set the phone number
		this.phoneNumber = phoneNumber;
	}
}
