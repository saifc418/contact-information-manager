package contactinformationmanager;

import java.io.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Create contactManager object from ContactManager class
		ContactManager contactManager = new ContactManager();
	
		// Initialize scanner
		Scanner scanner = new Scanner(System.in);
		
		// Declare filename variable
		String filename;
		
		// Initialize int run to 1
		int run = 1;
		
		// Welcome the user to the program
		System.out.println("Welcome to Contact Manger!\n");
		
		// Loop while run equals 1
		while (run == 1) {
			
			// Inform user to enter file path or enter 'exit'
			System.out.print("Enter the absolute path to your file or type 'exit': ");
			
			// Read the user input
			filename = scanner.nextLine();
			
			// Print new line for formatting
			System.out.println();
			
			// If filename is 'exit' then run this block
			if (filename.equals("exit")) {
				
				// Set run to 0
				run = 0;
				
				// Break out of the while loop
				break;
			}
			
			else {
				
				// Run the method
				contactManager.readContactsFromFile(filename);
			}
			
			// Print new line for formatting
			System.out.println();
		}
		
		// Close the scanner
		scanner.close();
		
		// Inform user "Good-bye"
		System.out.println("Good-bye.");
	}
}
