package com.Register;
import java.util.Scanner;
public class mainpassword {
public static void mps() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Must contain at least one digit");
	System.out.println("Must contain at least one of the following special characters @, #, $");
	System.out.println("The length should be between 4 to 20 characters.");
	String n=sc.nextLine();
	if(n.isEmpty()!=true)
	{
		Password n1=new Password(n);
		if(n1.getP()!=null)
		{
			System.out.println(n1.getP());
		}
		else {
			 while (n1.getP()==null) {
				 System.out.println("PASSWORD ENTERD IS NOT CORRECT");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n1=new Password(n);
			}
			 System.out.println(n1.getP());
		}
	}
	else {
		while (n.isEmpty()) {
			System.out.println("FIELD CAN'T BE EMPTY");
			n=sc.nextLine();
		}
		Password n2=new Password(n);
		if(n2.getP()!=null)//null is nothing but false
		{
			System.out.println(n2.getP());
		}
		else {
			while (n2.getP()==null) {
				 System.out.println("PASSWORD ENTERD IS NOT CORRECT");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n2=new Password(n);
			}
			 System.out.println(n2.getP());
		}
	}
}
}
