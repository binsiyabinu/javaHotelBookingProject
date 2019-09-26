package registration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import customer.Customer;


public class Registration {
	public static int registerID=0;
	Customer c=new Customer();
	
	public void register(String firstName, String middleName, String lastName, String address, String contactNumber,
			String email, String proofType, String proofID) {
		// TODO Auto-generated method stub
		c.setFirstName(firstName);
		c.setMiddleName(middleName);
		c.setLastName(lastName);
		c.setAddress(address);
		c.setContactNumber(contactNumber);
		c.setEmail(email);
		c.setProofType(proofType);
		c.setProofID(proofID);
		//this.display();
	}
	
	
	public int display()
	{
		System.out.println("Thanks for registering "+c.getFirstName()+",your registerID is "+ ++registerID);
		System.out.println("\n\nYour details are:\n ");
		System.out.println("NAME	    : "+c.getFirstName()+" "+c.getMiddleName()+" "+c.getLastName());
		System.out.println("ADDRESS	    : "+c.getAddress());
		System.out.println("NUMBER      : "+c.getContactNumber());
		System.out.println("EMAIL       : "+c.getEmail());
		System.out.println("PROOF TYPE  : "+c.getProofType());
		System.out.println("PROOF ID    : "+c.getProofID());
		//System.out.println(getDate());
		
		//this.display();
		
		return registerID;
		}

}
