package mainApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import customer.Customer;
import roomBooking.RoomBooking;//import roombooking
import registration.Registration;//import registration package

public class Main {
	static boolean i=false;
	static boolean j=false;
	static boolean k=false;
	static int roomNO=0;
	static int s=0;
	static int id=0;
	static int dates=0;
	//static int registerID=0;
	static int e=0;


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String firstName=null;
		String middleName=null;
		String lastName=null;
		String address=null;
		String contactNumber = null ;
		String email=null;
		String proofType=null;
		String proofID=null;
		int c=0;
		int booked[] =new int[25];
		int registered[] =new int[25];
		int booked1[] =new int[25];
		int dd[]=new int[31];
		int registerID = 0;
		String email1[]=new String[25];
		//Registration reg1=new Registration();
		String name1[]=new String[25];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		RoomBooking r1=new RoomBooking();
		Registration reg=new Registration();
		Customer cu=new Customer();
		
		do
		{
	   
		System.out.println("MENU \n\n1.REGISTER\n\n2.BOOKING\n\n3.CHECK ROOM BOOKING STATUS\n\n4.ALL BOOKINGS \n\n5.EMAIL\n\n6.ALL CUSTOMERS \n\n7.EXIT\n\nEnter your choice");
		System.out.println("Do you want to book a room? if yes,then press 2\n\nEnter your choice");
		String choice =br.readLine();
		
		switch(choice)
		{
		case "1":
		{
			
		System.out.println("REGISTRATION");
		do
		{
		System.out.println("Enter first name");
		firstName=br.readLine();
		System.out.println("Enter middle name");
	    middleName = br.readLine();
		System.out.println("Enter last name");
		lastName=br.readLine();
	    System.out.println("Enter address");
		address=br.readLine();
		System.out.println("Enter contact number");
		contactNumber=br.readLine();
		System.out.println("Enter email");
		email=br.readLine();
		email1[e]=email;
		e++;
		System.out.println("Enter proof Type");
		proofType=br.readLine();
		System.out.println("Enter proof ID");
		proofID=br.readLine();
		//Registration reg=new Registration();
		reg.register(firstName,middleName,lastName,address,contactNumber,email,proofType,proofID);
		System.out.println("Do u want to proceed? y/n");
		char y = br.readLine().charAt(0);
		registerID=reg.display();
		
		if(y=='y')
		{
			
		   System.out.println("Thanku for registartion");
		   registered[id]=registerID;
		   name1[id]=firstName;
		   
		}
		else 
		{
		   i=false;
		  
			   System.out.println("Do you want to update the emailID?(y/n)");
			   char z= br.readLine().charAt(0);
			   if(z=='y')
			   {
				   System.out.println("Update email:\nEnter email id");
				   email=br.readLine();
				   reg.register(firstName,middleName,lastName,address,contactNumber,email,proofType,proofID);
				   System.out.println();
				   System.out.println("Email updated");
				   // registerID=reg.display();
				   System.out.println("Thanku for registartion");
				   registered[id]=registerID;
				   name1[id]=firstName;
				   
		        }
			   else
			   {
				   System.out.println("go to registartion");
				   i=true;
			   }
			   
		  
		   //System.out.println("Thankyou for your valuable time!!!");
		}
		System.out.println("Customer list");
		System.out.println("The registered customers are");
		System.out.println();
		for(int i=0;i<registerID;i++)
		{
			System.out.print(registered[i]);
			System.out.println("	"+name1[i]);
		}
		id++;
		System.out.println("Do you want to register again?(y/n)");
		   char r= br.readLine().charAt(0);
		   if(r=='y')
			   i=true;
		   else
		       i=false;
		   
		}while(i);  
		
		
		//reg.register(firstName,middleName,lastName,address,contactNumber,email,proofType,proofID);
		}
		break;
		case "2":
		{
			
			System.out.println("Booking:");
			do
			{
			System.out.println("Please choose the required service");
			System.out.println("ac or non ac(AC/nAC)");
			String type =br.readLine();
			System.out.println("Cot(Single or Double)");
			String cot=br.readLine();
			System.out.println("With cable connection or without cable connection (c/nC)");
			String cable=br.readLine();
			System.out.println("Wifi needed or not (w/nW)");
			String wifi=br.readLine();
		    System.out.println("laundary service needed  or not (l/nL)");
			String laundry=br.readLine();
			System.out.println("Enter the date of booking");
			int date=Integer.parseInt(br.readLine());
			
			dd[dates]=date;
			r1.Book(type,cot,cable,wifi,laundry,date);
			 r1.display();
			System.out.println("Do you want to proceed?(yes/no)");
			String op1=br.readLine();
			String op2="yes";
			if(op1.equalsIgnoreCase(op2) && roomNO<registerID)
			{
					
			System.out.println("Thank you for booking.Your room number is "+ ++roomNO);
			booked1[c]=roomNO;
			//System.out.println(booked1[c]);
			booked[c]=1;
			c++;
			dates++;
			j=false;	
			}
			else
			{
				j=false;
			
	            System.out.println("Register before booking");
			}
			if(roomNO>25)
			{
				System.out.println("Room not available currently");
				j=false;
				System.out.println("Better luck next time");
			}
			}while(j);
			
			}
			
			break;
		
		
	case "3":
	{
		System.out.println("Enter room number");
		int  ch=Integer.parseInt(br.readLine());
		if(ch>25)
			System.out.println("Room unavailable");
		else
		for(int i=0;i<ch;i++)
		{
			//System.out.println(booked[i]+" "+booked1[i]+" "+ch);
			if(  booked[ch-1]==1 )
			{
				//System.out.println(booked1[i]);
				System.out.println("Room number "+ch+" is booked");
			//flag=r1.checkstatus(ch,booked[i],flag);
				break;
			}
			else
			{
				System.out.println("Room  available,book soon");
				break;
			}
			
			//System.out.println("\n\n\n"+flag);
			
			
		}
		
			
	}break;
case "4":
{
	System.out.println("Enter the start date");
	int startdate=Integer.parseInt(br.readLine());
	System.out.println("Enter the end date");
    int enddate=Integer.parseInt(br.readLine());
    
    for(int i=0;i<25;i++)
    {
    	if(dd[i]>=startdate && dd[i]<=enddate)
    	{
    		System.out.println(i+1+"    " +name1[i]+"  "+dd[i]);
    	}
   // r1.viewBookings(startdate,enddate,dd[i]);
    }
}break;
case "5":
{
	
	System.out.println("Enter current email id");
	email=br.readLine();
	System.out.println("Enter new email id");
	String email2=br.readLine();
	
	for(int i=0;i<25;i++)
	{
		//System.out.println(email1[i]);
		if(email.equalsIgnoreCase(email1[i]))
		{
			email1[i]=email2;
			cu.setEmail(email2);
			System.out.println(name1[i]+"'s new email is "+email2);
		}
		else
			continue;
	}
}
break;

case "6":
{
	System.out.println("Customer list");
	System.out.println("The registered customers are");
	System.out.println();
	for(int i=0;i<registerID;i++)
	{
		System.out.print(registered[i]);
		System.out.println("	"+name1[i]);
	}
}
break;
case "7":
{
	System.exit(0);
}
	break;
	
	}	
	System.out.println("Do you want to continue?(yes/no)");
	String op1=br.readLine();
	String op2="yes";
	if(op1.equalsIgnoreCase(op2))
	{
			
	System.out.println("Thanks");
	
	k=true;	
	}
	else
		k=false;
	}while(k);	
	
}



	}


