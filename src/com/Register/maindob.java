package com.Register;
import java.util.Scanner;
public class maindob {
	static String d;
	public static void dobs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your DATE OF BIRTH");
		String n=sc.nextLine();
		if(n.isEmpty()!=true)
		{
			Dob n1=new Dob(n);
			if(n1.getDob()!=null)
			{
				System.out.println("Saved");
				d=n1.getDob();
			}
			else {
				 while (n1.getDob()==null) {
					 System.out.println("ENTER CORRECTLY");
					 System.out.println("Enter again");
					 n=sc.nextLine();
					 while(n.isEmpty())
					 {
						 System.out.println("FIELD CAN'T BE EMPTY");
							n=sc.nextLine();
					 }
					 n1=new Dob(n);
				}
				 System.out.println("SAVED");
				d= n1.getDob();
			}
		}
		else {
			while (n.isEmpty()) {
				System.out.println("FIELD CAN'T BE EMPTY");
				n=sc.nextLine();
			}
			Dob n2=new Dob(n);
			if(n2.getDob()!=null)//null is nothing but false
			{
				System.out.println("SAVED");
				d=n2.getDob();
			}
			else {
				while (n2.getDob()==null) {
					 System.out.println("ENTER CORRRECTLY");
					 System.out.println("Enter again");
					 n=sc.nextLine();
					 while(n.isEmpty())
					 {
						 System.out.println("FIELD CAN'T BE EMPTY");
							n=sc.nextLine();
					 }
					 n2=new Dob(n);
				}
				System.out.println("SAVED");
				d=n2.getDob();
			}
		}
	}
	public static void dmb() {
		System.err.println(" Your Date of Birth is--->> "+d);
	}
	public static void updatedob() {
		System.err.println(" Your Date of Birth is--->> "+d);
		Updatedetails.udpatess();
	}
	public static void afterupdate()
	{
		System.err.println(" Your Date of Birth is--->> "+d);	
		
	}
}
