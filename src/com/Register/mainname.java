package com.Register;

import java.util.Scanner;

public class mainname {
	
	static String name;
	
	public static void mnn() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the full name");
		String n=sc.nextLine();
		if(n.isEmpty()!=true)
		{
			Name n1=new Name(n);
			if(n1.getName()!=null)
			{
     			System.out.println(n1.getName());
//				display_details.name1(n1.getName());
     			name=n1.getName();
			}
			else {
				 while (n1.getName()==null) {
					 System.out.println("CHARCTERS SHOULD BE MORE THAN 3");
					 n=sc.nextLine();
					 while(n.isEmpty())
					 {
						 System.out.println("FIELD CAN'T BE EMPTY");
							n=sc.nextLine();
					 }
					 n1=new Name(n);
				}
//				 System.out.println(n1.getName());
				 display_details.name1(n1.getName());
			}
		}
		else {
			while (n.isEmpty()) {
				System.out.println("FIELD CAN'T BE EMPTY");
				n=sc.nextLine();
			}
			Name n2=new Name(n);
			if(n2.getName()!=null)//null is nothing but false
			{
				display_details.name1(n2.getName());
			}
			else {
				while (n2.getName()==null) {
					 System.out.println("CHARCTERS SHOULD BE MORE THAN 3");
					 n=sc.nextLine();
					 while(n.isEmpty())
					 {
						 System.out.println("FIELD CAN'T BE EMPTY");
							n=sc.nextLine();
					 }
					 n2=new Name(n);
				}
//				 System.out.println(n2.getName());
				display_details.name1(n2.getName());
			}
		}
		
		
	}
	public static void  namenss() {
		System.err.println(" Your Name is--->>  "+name);
	}
	public static void updatnames() {
		System.err.println(" Your Name is--->>  "+name);
		Updatedetails.udpatess();
	}
	public static void afterupdate()
	{
		System.err.println(" Your Name is--->>  "+name);
		
	}
}
