# Introduction - Contact Information Manager
This project is a Contact Information Manager in Java. This program accepts a text file containing contact names, addresses, and phone numbers. It processes these contacts, determining if they are valid or invalid, based on correct phone number format. It outputs all the invalid contacts that it skips when later outputting the valid contacts.

# Installation
Download the three attached .java files named Main.java, Contact.java, and ContactManager.java. Be sure to uncomment the first line in the .java files containing "package contactinformationmanager;." Change the package name to the name of the package on your local machine, if necessary.

# Usage
To start, run the program. You will then be prompted with a welcoming introduction and to enter the absolute file path or 'exit' to terminate the program. If the user enters an invalid file path or command, they will be prompted to enter their input again. Once the user enters a valid file path, the program then outputs all the invalid contacts that it skips from creating new Contact objects. Then, it outputs all the valid contacts that it created a new Contact object for. After, the program again prompts the user to enter the absolute file path if they user would like to process another file. Otherwise, the user may type 'exit' to terminate the program. If the user types 'exit,' they are prompted with a "Good-bye" message.

**Example Usage:** (https://tinyurl.com/y9eckdv7)

# Format
**NOTE 1:** The only valid phone number format is as follows, where the X's are integers: (XXX) XXX-XXXX

**NOTE 2:** Do not enter the file path in quotation marks. Otherwise, the program will not read the file.


# Class and Method Explanation
1. **Contact Class**

    - Consists a constructor, getters, and setters for the contacts.

2. **ContactManager Class**

    - This class calls the Contact class. It creates objects of the Contact class.

    - **validatePhoneNumber(String phoneNumber)** ensures that a phone number from the text file is valid. A valid phone number must have the following format, where the X's are integers: **(XXX) XXX-XXXX**. The method checks if the phone number is 14 characters long, has the parentheses and dashes in the correct spots, and if the numbers are actually numbers and not another value, such as a letter. If any of these requirements are not met, the method throws a NumberFormatExcept.

    - **displayAllContacts()** displays all the valid contacts that are in the file. The valid contact objects are in the contacts array. The method loops through this array and prints all the valid contacts with getter methods.

3. **Main Class**
    - This class contains the main method. It calls the ContactManager class and creates an object of the ContactManager class. This method asks the user to input the absolute file path or asks the user to type 'exit' if they wish to terminate the program. If the user enters an invalid file or command, it will request the user to enter the file path again. Once the user enters a valid file path, it will process the file by calling readContactsFromFile(String filename), a method of the ContactManager class. Then, it will display all the invalid contacts that it skips when creating Contact objects. After, it displays all the valid contacts. The program will then again prompt the user to enter the absolute file path if they wish to process a new file or the user may type 'exit' to terminate the program. If the user types 'exit,' the program will terminate and they will be prompted with a "Good-bye" message.

# Important Note
**Changes made to starter code in ContactManager class:**

1. I have added lines 12 through 27 in the method readContactsFromFile(String filename) in the ContactManager class. It reinitializes contactCount back to 0. Also, if there is a Contact object in the array contacts, it will replace it with null. This reinitialization is performed to avoid complications in the code if the user wishes to process more than one file. Otherwise, the contactCount variable will not be at 0 and there will be old contacts still in the array from a previous file when it is time to process a new file.

2. I have added lines 43 through 46 in the method readContactsFromFile(String filename) in the ContactManager class. Here, the user is informed that the the program is about to print all the valid contacts. After they are informed, the displayAllContacts() method is called and displays all the valid contacts.

# Support
For support or contact, you can reach out to me via email: chaudhrysa@g.cofc.edu

# Roadmap
In the future, I hope to have the program write all valid contacts to a new file.

# Contribution
If you would like to contribute, edit, or further develop the program, feel free to expand upon the code but please cite my email: chaudhrysa@g.cofc.edu

# Authors and Acknowledgment
**Anurag Tiwari:** Provided some starter code such as some method names, variables, code, etc. in ContactManager class.

**Saif Chaudhry:** Wrote code to complete the starter code in the ContactManger class. Also, wrote Contact class and Main class from scratch.

# License
Student Programming Project for College of Charleston
