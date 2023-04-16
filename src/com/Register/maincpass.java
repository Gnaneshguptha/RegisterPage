package com.Register;

import java.util.Scanner;
public class maincpass {
public static void cpass() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Confirm your password");
	String n=sc.nextLine();
	if(n.isEmpty()!=true)
	{
		Confirm_password n1=new Confirm_password(n);
		if(n1.getcP()!=null)
		{
			System.out.println("matched");
			System.out.println(n1.getcP());
		}
		else {
			 while (n1.getcP()==null) {
				 System.out.println("PASSWORD ENTERD IS NOT MATCHED");
				 System.out.println("Enter again");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n1=new Confirm_password(n);
			}
			 System.out.println("matched");
			 System.out.println(n1.getcP());
		}
	}
	else {
		while (n.isEmpty()) {
			System.out.println("FIELD CAN'T BE EMPTY");
			n=sc.nextLine();
		}
		Confirm_password n2=new Confirm_password(n);
		if(n2.getcP()!=null)//null is nothing but false
		{
			System.out.println("matched");
			System.out.println(n2.getcP());
		}
		else {
			while (n2.getcP()==null) {
				 System.out.println("PASSWORD ENTERD IS NOT MATCHED");
				 System.out.println("Enter again");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n2=new Confirm_password(n);
			}
			System.out.println("matched");
			 System.out.println(n2.getcP());
		}
	}
}
}
