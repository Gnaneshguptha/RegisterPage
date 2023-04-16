package com.Register;
import java.util.Scanner;
public class maingmail {
static String gml;
String addres;
String gmail;
String phonenumber;
String name;
String gender;
String dob;
public static void mgl() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the mail");
	String n=sc.nextLine();
	if(n.isEmpty()!=true)
	{
		Gmail_id n1=new Gmail_id(n);
		if(n1.getMail()!=null)
		{
			System.out.println("saved");
			gml=n1.getMail();
		}
		else {
			 while (n1.getMail()==null) {
				 System.out.println("Enterd mail is not correct");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n1=new Gmail_id(n);
			}
			 System.out.println("saved");
			 gml=n1.getMail();
		}
	}
	else {
		while (n.isEmpty()) {
			System.out.println("FIELD CAN'T BE EMPTY");
			n=sc.nextLine();
		}
		Gmail_id n2=new Gmail_id(n);
		if(n2.getMail()!=null)//null is nothing but false
		{
			System.out.println("saved");
			gml=n2.getMail();
		}
		else {
			while (n2.getMail()==null) {
				 System.out.println("Enterd mail is not correct");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n2=new Gmail_id(n);
			}
			 System.out.println("saved");
			 gml=n2.getMail();
		}
	}
}
public static void gmeth() {
	System.err.println(" Your Gmail is--->> "+gml);
	Updatedetails.udpatess();
}
public static void updategmail() {
	System.err.println(" Your Gmail is--->> "+gml);
	Updatedetails.udpatess();
}
public static void afterupdate()
{
	System.err.println(" Your Gmail is--->> "+gml);	
	
}
}
