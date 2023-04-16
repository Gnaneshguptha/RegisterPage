package com.Register;
import java.util.*;
public class mainmobile {
	static String mb;
public static void mbn() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your 10 Digit Phone Number");
	System.out.println("Starts with ->>> 7,9,8 <<<-- only");
	String n=sc.nextLine();
	if(n.isEmpty()!=true)
	{
		Mobile_no n1=new Mobile_no(n);
		if(n1.getC()!=null)
		{
			System.out.println("Saved");
			mb=n1.getC();
		}
		else {
			 while (n1.getC()==null) {
				 System.out.println("ENTERD Number not Valid");
				 System.out.println("Enter again");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n1=new Mobile_no(n);
			}
			 System.out.println("SAVED");
			 mb=n1.getC();
		}
	}
	else {
		while (n.isEmpty()) {
			System.out.println("FIELD CAN'T BE EMPTY");
			n=sc.nextLine();
		}
		Mobile_no	n2=new Mobile_no(n);
		if(n2.getC()!=null)//null is nothing but false
		{
			System.out.println("SAVED");
			mb=n2.getC();
		}
		else {
			while (n2.getC()==null) {
				System.out.println("ENTERD Number not Valid");
				 System.out.println("Enter again");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n2=new Mobile_no(n);
			}
			System.out.println("SAVED");
			mb=n2.getC();
		}
	}
}
public static void mbpn() {
	System.err.println(" Your Mobile is--->> "+mb);
//	Updatedetails.udpatess();
}
public static void updatemobile() {
	System.err.println(" Your Mobile is--->> "+mb);
	Updatedetails.udpatess();
}
public static void afterupdate()
{
	System.err.println(" Your Mobile is--->> "+mb);
	
}
}
