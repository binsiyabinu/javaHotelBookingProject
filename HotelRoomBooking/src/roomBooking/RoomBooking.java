package roomBooking;

import customer.Customer;


public class RoomBooking {
	Customer cu=new Customer();
	boolean a1,a2,b1,b2,c1,c2,d1,d2,e1,e2;
	public void Book(String type, String cot, String cable, String wifi, String laundry, int date) {
		
		cu.setType(type);
		cu.setCot(cot);
		cu.setCable(cable);
		cu.setWifi(wifi);
		cu.setLaundry(laundry);
		cu.setDate(date);
		int amount = 0;
		String string1=type;
		String string2="AC";
		String string3="nAC";
		if(string1.equalsIgnoreCase(string2))
		{
			amount=1000;
			a1=true;
		}
		if(string1.equalsIgnoreCase(string3))
		{
			amount=750;
			a2=true;
		}
		 string1=cot;
		 string2="Single";
		 string3="Double";
		 if(string1.equalsIgnoreCase(string2))
			{
				amount=amount;
				b1=true;
			}
		 if(string1.equalsIgnoreCase(string3))
			{
				amount=amount+350;
				b2=true;
			}
	
		 string1=cable;
		 string2="c";
		 string3="nC";
		 if(string1.equalsIgnoreCase(string2))
			{
				amount=amount+50;
				c1=true;
			}
		 if(string1.equalsIgnoreCase(string3))
			{
				amount=amount;
				c2=true;
			}
		 string1=wifi;
		 string2="w";
		 string3="nW";
		 if(string1.equalsIgnoreCase(string2))
			{
				amount=amount+200;
				d1=true;
			}
		 if(string1.equalsIgnoreCase(string3))
			{
				amount=amount;
				d2=true;
			}
		 string1=laundry;
		 string2="l";
		 string3="nL";
		 if(string1.equalsIgnoreCase(string2))
			{
				amount=amount+100;
				e1=true;
			}
		 if(string1.equalsIgnoreCase(string3))
			{
				amount=amount;
				e2=true;
			}
		 
		System.out.println("The total charge is Rs."+amount+".");
		
	}
	public void display() {
		System.out.println("The services provided are ");
		if(b1)
		{
			System.out.print("Single cot");
		}
		if(b2)
		{
			System.out.println("Double cot");
		}
		if(a1)
		{
			System.out.println(" AC room");
		}
		if(a2)
		{
         System.out.println(" Non AC room");
		}
		if(c1)
		{
			System.out.println("Cable connection enabled");
		}
		if(c2)
		{
			System.out.println("Cable connection disabled");
		}
		if(d1)
		{
			System.out.println("Wifi enabled");
		}
		if(d2)
		{
         System.out.println("Wifi disabled");
		}
		if(e1)
		{
			System.out.println("with laundry");
		}
		if(e2)
		{
         System.out.println("without laundry");
		}
		
	}

}
