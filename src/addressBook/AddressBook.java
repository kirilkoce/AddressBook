package addressBook;

import java.util.ArrayList;
import java.util.List;


public class AddressBook {
    private List<AddressBookEntry> listOfEntries;

    public AddressBook() {
        this.listOfEntries = new ArrayList<>();
    }

    public void add(AddressBookEntry addressBookEntry) {
        this.listOfEntries.add(addressBookEntry);
    }

    public void delete(AddressBookEntry listOfEntries2) {
        this.listOfEntries.remove(0);
    }

    public AddressBookEntry get(int index) {
        return this.listOfEntries.get(index);
    }

    public AddressBookEntry[] viewAll() {
        AddressBookEntry[] result = new AddressBookEntry[this.listOfEntries.size()];
        this.listOfEntries.toArray(result);

        return result;
    }
    
    public ArrayList<AddressBookEntry> search(String s, String property) {
		s.toLowerCase();
		
		ArrayList<AddressBookEntry> foundEntries = new ArrayList<AddressBookEntry>();
		
		for (AddressBookEntry entry : listOfEntries) {
			
			String compare = "";
			
			if (property.equals("email")) {
				compare = entry.getEmailAddress();
			}
			if (property.equals("phone")) {
				compare = entry.getMobileNumber();
			}
			if (property.equals("first name")) {
				compare = entry.getFirstName();
			}
			if (property.equals("last name")) {
				compare = entry.getLastName();
			}
			if (compare.length() >= s.length()) {
				compare = compare.substring(0,s.length());
				if (s.equals(compare)) {
					foundEntries.add(entry);
				}
			}
		}
		if (foundEntries.size() == 0) {
			foundEntries.add(new AddressBookEntry());
		}
		return foundEntries;
	}
	
    public void print() {
		// TODO Auto-generated method stub
		for (AddressBookEntry entry:listOfEntries) {
			System.out.println();
			entry.print();
			System.out.println("*************************");
	}
		
	
}

	public void clear() {
		listOfEntries = new ArrayList<AddressBookEntry>();
		}
}