package com.Register;

import java.util.Scanner;

public class maingender {
	static String gne;
public static void gen() {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER YOUR GENDER");
	System.out.println("MALE  //  FEMALE // OTHERS");
	String n=sc.nextLine();
	if(n.isEmpty()!=true)
	{
		Gender n1=new Gender(n);
		if(n1.getG()!=null)
		{
			System.out.println("Saved");
			gne=n1.getG();
		}
		else {
			 while (n1.getG()==null) {
				 System.out.println("ENTER CORRECTLY");
				 System.out.println("GENDER DOSE NOT EXIST");
				 System.out.println("Enter again");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n1=new Gender(n);
			}
			 System.out.println("SAVED");
			
		}
	}
	else {
		while (n.isEmpty()) {
			System.out.println("FIELD CAN'T BE EMPTY");
			n=sc.nextLine();
		}
		Gender n2=new Gender(n);
		if(n2.getG()!=null)//null is nothing but false
		{
			System.out.println("SAVED");
			gne=n2.getG();
		}
		else {
			while (n2.getG()==null) {
				 System.out.println("ENTER CORRRECTLY");
				 System.out.println(" OR GENDER DOSE NOT EXIST");
				 System.out.println("Enter again");
				 n=sc.nextLine();
				 while(n.isEmpty())
				 {
					 System.out.println("FIELD CAN'T BE EMPTY");
						n=sc.nextLine();
				 }
				 n2=new Gender(n);
			}
			System.out.println("SAVED");
			gne=n2.getG();
		}
	}

}
public static void gend() {
	System.err.println(" Your Gender is --->> "+gne);
}
public static void updategend() {
	System.err.println(" Your Gender is --->> "+gne);
	Updatedetails.udpatess();
}
public static void afterupdate()
{
	
	System.err.println(" Your Gender is --->> "+gne);
}
}
