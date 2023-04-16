package com.Register;
import java.util.*;
public class mainaddress {
	static String str;
public static void madd() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Address with pincode");
	String n=sc.nextLine();
	if(n.isEmpty()!=true)
	{
		Address n1=new Address(n);
		if(n1.getStri()!=null)
		{
			System.out.println("saved");
//			System.out.println(n1.getStri());
			str=n1.getStri();
			
		}
		else {
			 while (n1.getStri()==null) {
				 System.out.println("Enter again");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n1=new Address(n);
			}
			 System.out.println("saved");
//			 System.out.println(n1.getStri());
			 str=n1.getStri();
		}
	}
	else {
		while (n.isEmpty()) {
			System.out.println("FIELD CAN'T BE EMPTY");
			n=sc.nextLine();
		}
		Address n2=new Address(n);
		if(n2.getStri()!=null)//null is nothing but false
		{
			System.out.println("saved");
//			System.out.println(n2.getStri());

			str=n2.getStri();
		}
		else {
			while (n2.getStri()==null) {
				 System.out.println("Enter again");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n2=new Address(n);
			}
			System.out.println("saved");
//			 System.out.println(n2.getStri());
			str=n2.getStri();
		}
	}
}
public static void  addressss() {
	System.err.println(" Your Address is--->> "+str);
}
public static void updateaddress()
{
	System.err.println(" Your Address is--->> "+str);
	Updatedetails.udpatess();
}
public static void afterupdate()
{
	System.err.println("your address is->>  "+str);
	
}
}
