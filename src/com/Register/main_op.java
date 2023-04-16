package com.Register;
import java.util.Scanner;

public class main_op {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str;
	System.out.println();
	System.out.println("Enter a Number to select a option and filling further details....");
	System.out.println();
	System.out.println("              <<   -Sign Up Page-    >>");
	System.out.println();
	System.out.println("         (1)->>Full_Name     (2)->>Gmail_Address ");
	char c = sc.nextLine().charAt(0);
	if(c=='1')
		{
			switch (c) {
			case '1':
					System.out.println("Enter Name");
					mainname.mnn();
					///============nested switch1
					System.out.println("ENTER A NUMBER  (1)->>Gmail    (2)->>Password      (3)->>Gender ");
					System.out.println("                (4)->>DOB      (5)->>Mobile_Number (6)->>Address");
					char nc = sc.nextLine().charAt(0);
					if(nc=='1')
					{
						switch (nc) {
						case '1':
							System.out.println("Enter your mail");
							maingmail.mgl();
							//nc1--done
							System.out.println("Enter (1)->>Password       (2)->>Gender  (3)->>DOB");
							System.out.println("      (4)->>Mobile_Number  (5)->>Address");
							char nc1 = sc.nextLine().charAt(0);
							//password
							if(nc1=='1')
							{
								switch (nc1) {							
								case '1':
									mainpassword.mps();
									maincpass.cpass();
									nc1pass.nc1_pass();
								}
								break;
							}
							///gender
							if(nc1=='2')
							{
								switch (nc1) {
								case '2':
									maingender.gen();
									nc1gender.nc1_gender();
								}
								break;
								
							}
							//dob
							if(nc1=='3')
							{
								switch (nc1) {
								case '3':
									maindob.dobs();//-============--
									nc1dob.nc1_dob();
								}
								break;
								
							
								
							}
							if(nc1=='4')
							{
								switch (nc1) {
								case '4':
									mainmobile.mbn();
									nc1mobile.nc1_mobile();//switch
									
									break;
								}
							}
							if(nc1=='5')
							{
								switch (nc1) {
								case '5':
									mainaddress.madd();
									nc1_address.nc1_add();
									break;
								}
							}//dead_nc1
							break;
						}
					}
					if(nc=='2')
					{
						switch (nc) {
						case '2':
							mainpassword.mps();
							maincpass.cpass();
							//pas->gmail
							System.out.println("Enter (1)->>Gmail          (2)->>Gender  (3)->>DOB");
							System.out.println("      (4)->>Mobile_Number  (5)->>Address");
							char nc2 = sc.nextLine().charAt(0);
							switch (nc2) {
							case '1':
									maingmail.mgl();
									nc2gmail.nc2gmail();
								break;
							case '2':
									maingender.gen();
									nc2gender.nc2gen();
									
								break;
							case '3':
									maindob.dobs();
									nc2dob.nc2dobs();//Nestedswitches
									
								break;
							case '4':
									mainmobile.mbn();
									nc2mobiles.nc2mobiless();
									break;
							case '5':
									mainaddress.madd();
									nc2add.nc2adds();
									
									break;
							
						
							}
							break;
						
						}
						
					}
					if(nc=='3')
					{
						switch (nc) {
						case '3':
							maingender.gen();
							System.out.println("Enter (1)->>Password       (2)->>Gmail  (3)->>DOB");
							System.out.println("      (4)->>Mobile_Number  (5)->>Address");
							char nc31 = sc.nextLine().charAt(0);
							switch (nc31) {
							case '1':
								mainpassword.mps();
								maincpass.cpass();
								nc31pass.nc31passs();
								break;
							case '2':
								maingmail.mgl();
								nc32mail.nc32mails();//here nc32
								break;
							case '3':
								maindob.dobs();
								nc31dob.nc31dobss();
								break;
							case '4':
								mainmobile.mbn();
								nc31mobile.nc31mob();
								break;
							case '5':
								mainaddress.madd();
								nc31adds.nc31adsss();
								break;
							}
							break;
						}
					}
					if(nc=='4')
					{
						switch (nc) {
						case '4':
							maindob.dobs();
							System.out.println("(1)->Gmail (2)->Password (3)->Gender (4)->mobileno (5)->address");
							char nc341 = sc.nextLine().charAt(0);
							switch (nc341) {
							case '1':
								maingmail.mgl();
								nc34mail.nc34mail();
								break;
							case '2':
								mainpassword.mps();
								maincpass.cpass();
								nc34pass.nc34pass();
								break;
							case '3':
								maingender.gen();
								//reused the class
								nc31dob.nc31dobss();
								
								break;
							case '4':
								mainmobile.mbn();
								nc34mobile.nc34mobile();
								
								break;
							case '5':
								mainaddress.madd();
								nc34adds.nc34adds();
								break;
							}
							break;
						}
						
					}
					if(nc=='5')
					{
						switch (nc) {
						case '5':
							mainmobile.mbn();
							System.out.println("(1)->Gmail (2)->password (3)->gender (4)->dob (5)->address");
							char nc35 = sc.nextLine().charAt(0);
							switch (nc35) {
							case '1':
								maingmail.mgl();
								nc1mobile.nc1_mobile();
								break;
							case '2':
								mainpassword.mps();
								maincpass.cpass();
								nc2mobiles.nc2mobiless();
								break;
							case '3':
								maingender.gen();
								nc31mobile.nc31mob();
								
								break;
							case '4':
								maindob.dobs();
								nc34mobile.nc34mobile();
								break;
							case '5':
								mainaddress.madd();
								nc35add.nc35adds();
								
							}
							
							break;
						}
						
						
					}
					if(nc=='6')
					{
						switch (nc) {
						case '6':
							mainaddress.madd();
							System.out.println("(1)->Gmail (2)->password (3)->Gender (4)->DOB (5)->Mobile_No");
							char nc36 = sc.nextLine().charAt(0);
							switch (nc36) {
							case '1':
								maingmail.mgl();
								nc31adds.nc31adsss();
								break;
							case '2':
								mainpassword.mps();
								maincpass.cpass();
								nc2add.nc2adds();
								break;
							case '3':
								maingender.gen();
								nc31adds.nc31adsss();
								
								break;
							case '4':
								maindob.dobs();
								nc34adds.nc34adds();
								break;
							case '5':
								mainmobile.mbn();
								nc35add.nc35adds();
							}
							break;
						}
						
					}
					break; 	 
				 }
		}//dead0---completed c==1//
			
		if(c=='2')
		{
			switch (c) {
			case '2':
				System.out.println("Enter your mail");
					maingmail.mgl();
					System.out.println("ENTER A NUMBER  (1)->>Username (2)->>Password      (3)->>Gender ");
					System.out.println("                (4)->>DOB      (5)->>Mobile_Number (6)->>Address");
					char nc2 = sc.nextLine().charAt(0);
					switch (nc2) {
					case '1':
						mainname.mnn();
						System.out.println("Enter (1)->>Password       (2)->>Gender  (3)->>DOB");
						System.out.println("      (4)->>Mobile_Number  (5)->>Address");
						char nc1 = sc.nextLine().charAt(0);
						//password
						if(nc1=='1')
						{
							switch (nc1) {							
							case '1':
								mainpassword.mps();
								maincpass.cpass();
								nc1pass.nc1_pass();
							}
							break;
						}
						///gender
						if(nc1=='2')
						{
							switch (nc1) {
							case '2':
								maingender.gen();
								nc1gender.nc1_gender();
								
							}
							break;
							
						}
						//dob
						if(nc1=='3')
						{
							switch (nc1) {
							case '3':
								maindob.dobs();//-============--
								nc1dob.nc1_dob();
							}
							break;
							
						
							
						}
						if(nc1=='4')
						{
							switch (nc1) {
							case '4':
								mainmobile.mbn();
								nc1mobile.nc1_mobile();//switch
								
								break;
							}
						}
						if(nc1=='5')
						{
							switch (nc1) {
							case '5':
								mainaddress.madd();
								nc1_address.nc1_add();
								break;
							}
						}
						
						break;
					case '2':
						mainpassword.mps();
						maincpass.cpass();
						System.out.println("1->username 2->gender 3->dob 4->mobileno 5->address");
						char nc22 = sc.nextLine().charAt(0);
						switch (nc22) {
						case '1':
								mainname.mnn();
								nc2gmail.nc2gmail();
								
							break;
						case '2':
							maingender.gen();
							nc_2.nc2s();//c
							break;
						case '3':
							maindob.dobs();
							nc2_dobs.nc_2doss();
							break;
						case '4':
							mainmobile.mbn();
							nc5mobile.nc5mobile();
							break;
						case '5':
							mainaddress.madd();
							nc22_add.nc22_ads();
							break;
							
						}
						break;
					case '3':
						maingender.gen();
						System.out.println("1->Username 2->password 3->dob 4->mobileno 5->address");
						char c3 = sc.nextLine().charAt(0);
						switch (c3) {
						case '1':
							mainname.mnn();
							nc32mail.nc32mails();
							break;
						case '2':
								mainpassword.mps();
								maincpass.cpass();
								nc_2.nc2s();
							break;
						case '3':
							maindob.dobs();
							c3dobs.c3dobss();
							break;
						case '4':
							mainmobile.mbn();
							c3mobile.c3mobiles();
							break;
						case '5':
							mainaddress.madd();
							c5add.c5add();
							break;
							
						}
						break;
					case '4':
						maindob.dobs();
						System.out.println("ENTER A NUMBER (1)->>Username      (2)->>Password      (3)->>Gender ");
						System.out.println("               (4)->>Mobile_Number (5)->>Address");
						char c4 = sc.nextLine().charAt(0);
						switch (c4) {
						case '1':
							mainname.mnn();
							nc1dob.nc1_dob();
							break;
						case '2':
							mainpassword.mps();
							maincpass.cpass();
							nc2_dobs.nc_2doss();
							break;
						case '3':
							maingender.gen();
							c3dobs.c3dobss();
							break;
						case '4':
							mainmobile.mbn();
							c4mobile.c4mob();
							break;
						case '5':
							mainaddress.madd();
							c4dob.c4dobs();
							break;
						}
						break;
					case '5':
						mainmobile.mbn();
						System.out.println("1->username 2-> password 3->gender 4->dob 5->address");
						char c5 = sc.nextLine().charAt(0);
						switch (c5) {
						case '1':
							mainname.mnn();
							nc1mobile.nc1_mobile();
							break;
						case '2':
							mainpassword.mps();
							maincpass.cpass();
							nc5mobile.nc5mobile();
							break;
						case '3':
							maingender.gen();
							c3mobile.c3mobiles();							
							break;
						case '4':
							maindob.dobs();
							c4mobile.c4mob();	
							break;
						case '5':
							mainaddress.madd();
							c5addss.c5addss();
							break;
						}
						break;
					case '6':
						mainaddress.madd();
						System.out.println("1->username 2->password 3->gender 4->Dob 5->mobileno");
						char c6 = sc.nextLine().charAt(0);
						switch (c6) {
						case '1':
							mainname.mnn();
							nc1_address.nc1_add();
							break;
						case '2':
							mainpassword.mps();
							maincpass.cpass();
							nc22_add.nc22_ads();
							break;
						case '3':
							maingender.gen();
							c5add.c5add();
							break;
						case '4':
							maindob.dobs();
							c4dob.c4dobs();
							break;
						case '5':
							mainmobile.mbn();
							c5addss.c5addss();
							break;
						}
					}
				break;
			}
			
		}		 
		
	}

}


