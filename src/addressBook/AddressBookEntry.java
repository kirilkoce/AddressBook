package addressBook;

import java.util.ArrayList;

public class AddressBookEntry {
    //Instance var
    private String firstname;
    private String lastname;
    private String mobilenumber;
    private String emailaddress;

    //Constructor
    public AddressBookEntry() {}
    /*public AddressBookEntry(String firstname, String lastname, String address, String mobilenumber, String emailaddress){
        this.firstname = firstname;
        this.lastname = lastname;
        this.mobilenumber = mobilenumber;
        this.emailaddress = emailaddress;
    }*/

    public String getFirstName(){

        return firstname;
    }
    public void setFirstName(String name){

        this.firstname = name;
    }

    public String getLastName(){

        return lastname;
    }
    public void setLastName(String name){

        this.lastname = name;
    }

    public String getMobileNumber(){

        return mobilenumber;
    }
    public void setMobileNumber(String mobilenumber){
        this.mobilenumber = mobilenumber;}

    public String getEmailAddress(){

        return emailaddress;
    }
    public void setEmailAddress(String emailaddress){

        this.emailaddress = emailaddress;
    }
    
    public AddressBookEntry(String firstName, String lastName, String phoneNumber, String emailAddress) {
		this.firstname = firstName.toLowerCase();
		this.lastname = lastName.toLowerCase();
		this.mobilenumber = phoneNumber.toLowerCase();
		this.emailaddress = emailAddress.toLowerCase();
	}
    
    public void print() {
		System.out.println("First Name: " + firstname);
		System.out.println("Last Name: " + lastname);
		System.out.println("Phone Number: " + mobilenumber);
		System.out.println("Email Address: " + emailaddress);
	}


	
		
	}

	
    
    
