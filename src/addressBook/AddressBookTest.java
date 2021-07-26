package addressBook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBookTest {
    public static void main(String[] args) {

        String input;
        Scanner in = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();

        boolean stop = false;
        do {

            System.out.println("\nMain Menu");
            System.out.println("1. Add an Entry");
            System.out.println("2. Remove an Entry");
            System.out.println("3. Search for a specific entry");
            System.out.println("4. Print Address Book");
            System.out.println("5. Delete book");
            System.out.println("6. Quit");
            System.out.print("Please enter Choices from 1 to 6: \n");
            input = (in.next());


            switch (input) {
                case "1":
                    //create a new entry for the addressbook
                    AddressBookEntry entry = new AddressBookEntry();

                    System.out.println("***Adding Entry in Address Book***");

                    System.out.print("First Name: ");
                    entry.setFirstName(in.next());
                    
                    System.out.print("Last Name: ");
                    entry.setLastName(in.next());

                    System.out.print("Mobile Number: ");
                    entry.setMobileNumber(in.next());

                    System.out.print("Email Address: ");
                    entry.setEmailAddress(in.next());

                    //add the new entry to the addressbook
                    addressBook.add(entry);
                    
                    System.out.println("Added a new entry.");
                    break;
                    
                    case "2":
                	Scanner input1 = new Scanner(System.in);
            		
            		System.out.println("Enter an entry's email to remove:");
            		String email = input1.nextLine();
            		
            		AddressBookEntry listOfEntries = addressBook.search(email, "email").get(0);
            		
            		if (listOfEntries.getEmailAddress().equals("not found")) {
            			System.out.println("Entry not found\n\n");
            		}
            		
            		else {
            			System.out.println("Deleted the following entry:");
            			System.out.println("\n\n\n");
            			System.out.println("****************");
            			listOfEntries.print();
            			System.out.println("****************");
            			System.out.println();
            			System.out.println();
            			
            			addressBook.delete(listOfEntries);
            		}
                     break;

                case "3":

            		Scanner input2 = new Scanner(System.in);
            		
            		System.out.println("How would you like to search? (Enter 1-4)");
            		System.out.println("1) First Name");
            		System.out.println("2) Last Name");
            		System.out.println("3) Phone Number");
            		System.out.println("4) Email Address");
            		
            		int choise = input2.nextInt();
            		input2.nextLine();
            		ArrayList<AddressBookEntry> lookUp;
            		String term;
            		
            		switch (choise) {
            		
            		case 1: 
            			System.out.println("First name: ");
            			term = input2.nextLine();
            			lookUp = addressBook.search(term, "first name");
            			break;
            			
            		case 2: 
            			System.out.println("Last name: ");
            			term = input2.nextLine();
            			lookUp = addressBook.search(term, "last name");
            			break;
            			
            		case 3:
            			System.out.println("Phone number: ");
            			term = input2.nextLine();
            			lookUp = addressBook.search(term, "phone");
            			break;
            			
            		case 4:
            			System.out.println("Email address: ");
            			term = input2.nextLine();
            			lookUp = addressBook.search(term, "email");
            			break;
            		default:
            			System.out.println("Error");
            			return;
            		}
            		
            		System.out.println("Matching Entries: ");
            		System.out.println("******************");
            		
            		for (AddressBookEntry entry1: lookUp) {
            			if (entry1.getFirstName().equals("not found")) {
            				System.out.println("Entry not found\n\n");
            				break;
            			}
            			else {
            				entry1.print();
            				System.out.println("\n*****************");	
            			}
            		}
                    break;
                case "4":
                	System.out.println("Contents of address book: \n\n\n");
            		addressBook.print();

                    break;
                case "5":
                	addressBook.clear();
            		System.out.println("Address Book Cleared");
                	

                default:
                    break;
            }
           
        } while (!input.equals("6"));
        System.out.println("***THANK YOU FOR USING THE PROGRAM...***");
    }
}
