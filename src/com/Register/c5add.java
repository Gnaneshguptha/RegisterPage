package com.Register;

import java.util.Scanner;

public class c5add {
public static void c5add() {


	//add->gender
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter (1)->>username       (2)->>DOB");
	System.out.println("	  (3)->>Mobile_Number  (4)->>password");
	char nc2 = sc.nextLine().charAt(0);
	if(nc2=='1')
	{
		switch (nc2) {
		case '1':
			mainname.mnn();
			//nested swicth1.23
			//coress
			System.out.println("Enter (1)->>DOB");
			System.out.println("      (2)->>Mobile_Number  (3)->>password");
			char nc3 = sc.nextLine().charAt(0);
			if(nc3=='1')
			{
				switch (nc3) {
				case '1':
					maindob.dobs();
					//nestds 1.24
					System.out.println("1->>Mobile_Number  2->>password");
					char nc4 = sc.nextLine().charAt(0);
					if(nc4=='1')
					{
						switch (nc4) {
						case '1':
							mainmobile.mbn();
							//ns1.25
							System.out.println("enter (1)->>password");
							char nc5 = sc.nextLine().charAt(0);
							if(nc5=='1')
							{
								mainpassword.mps();
								maincpass.cpass();
								mainaddress.addressss();
								mainname.namenss();
								mainmobile.mbpn();
								maindob.dmb();
								maingender.gend();
								maingmail.gmeth();
								
							}
							break;
						}
						
					}
					if(nc4=='2')
					{
						switch (nc4) {
						case '2':
							mainaddress.madd();
							System.out.println("(1)->>Enter mobile");
							char nc41 = sc.nextLine().charAt(0);
							switch (nc41) {
							case '1':
								mainmobile.mbn();
								mainaddress.addressss();
								mainname.namenss();
								mainmobile.mbpn();
								maindob.dmb();
								maingender.gend();
								maingmail.gmeth();
								
								
								break;
							}
							break;//loack
						}
						
					}
					break;
				}
			}
			if(nc3=='2')
			{
				switch (nc3) {
				case '2':
					mainmobile.mbn();
					System.out.println("Enter 1->Dob 2->password");
					char nc31 = sc.nextLine().charAt(0);
					switch (nc31) {
					case '1':
							maindob.dobs();
							System.out.println("Enter (1)->> password");
							char nc32 = sc.nextLine().charAt(0);
							switch (nc32) {
							case '1':
								mainpassword.mps();
								maincpass.cpass();
								mainaddress.addressss();
								mainname.namenss();
								mainmobile.mbpn();
								maindob.dmb();
								maingender.gend();
								maingmail.gmeth();
								
								break;
							}
						break;
					case '2':
						mainpassword.mps();
						maincpass.cpass();
						System.out.println("enter (1)->>dob");
						char nc33 = sc.nextLine().charAt(0);
						switch (nc33) {
						case '1':maindob.dobs();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
							
							break;

						default:
							break;
						}
					}
					break;
				}
				
			}
			if(nc3=='3')
			{
				switch (nc3) {
				case '3':
					mainpassword.mps();
					maincpass.cpass();
				System.out.println("enter 1->dob  2->mobile");
				char nc31 = sc.nextLine().charAt(0);
				switch (nc31) {
				case '1':
					 maindob.dobs();
					 System.out.println("enter (1)->>mobile");
					 char nc33 = sc.nextLine().charAt(0);
					 switch (nc33) {
					case '1':
						mainmobile.mbn();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
						break;
		
					}
					break;

				case'2':
					mainmobile.mbn();
					System.out.println("Enter (1)->>dob");
					char nc331 = sc.nextLine().charAt(0);
					switch (nc331) {
					case '1':
						maindob.dobs();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
						break;
					}
					break;
				}
					
					break;//loack
				}
			}
			break;
		}
		
	}
	if(nc2=='2')
	{
		//dobs
		switch (nc2) {
		case '2':
			maindob.dobs();
			System.out.println("1->username 2->Mobile_no 3->password");
			char nc22 = sc.nextLine().charAt(0);
			switch (nc22) {
			case '1':
				mainname.mnn();
				System.out.println("1->Mobile_no 2->password");
				char nc23 = sc.nextLine().charAt(0);
				switch (nc23) {
				case '1':
						mainmobile.mbn();
						System.out.println("Enter (1)->>password");
						char nc231 = sc.nextLine().charAt(0);
						switch (nc231) {
						case '1':
							mainpassword.mps();
							maincpass.cpass();
								mainaddress.addressss();
								mainname.namenss();
								mainmobile.mbpn();
								maindob.dmb();
								maingender.gend();
								maingmail.gmeth();
							break;
						}
					break;
				case '2':
					mainpassword.mps();
					maincpass.cpass();
					System.out.println("1-> Mobile_no");
					char nc232 = sc.nextLine().charAt(0);
					switch (nc232) {
					case '1':
							mainmobile.mbn();
							mainaddress.addressss();
							mainname.namenss();
							mainmobile.mbpn();
							maindob.dmb();
							maingender.gend();
							maingmail.gmeth();
						break;
					}
					break;
				}
				break;
			case '2':
				mainmobile.mbn();
				System.out.println("1->username 2->password");
				char nc241 = sc.nextLine().charAt(0);
				switch (nc241) {
				case '1':
					mainname.mnn();
					System.out.println("1->password");
					char nc242 = sc.nextLine().charAt(0);
					switch (nc242) {
					case '1':
						mainpassword.mps();
						maincpass.cpass();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
						break;
					}
					break;
				case '2':
					mainpassword.mps();
					maincpass.cpass();
					System.out.println("1-> username");
					char nc243 = sc.nextLine().charAt(0);
					switch (nc243) {
					case '1':
						mainname.mnn();
					mainaddress.addressss();
					mainname.namenss();
					mainmobile.mbpn();
					maindob.dmb();
					maingender.gend();
					maingmail.gmeth();
						break;
					}
				}
				break;
			case '3'://///////////
				mainpassword.mps();
				maincpass.cpass();
				System.out.println("1->username 2->Mobile");
				char nc251 = sc.nextLine().charAt(0);
				switch (nc251) {
				case '1':
					mainname.mnn();
					System.out.println("1->Mobile");
					char nc252 = sc.nextLine().charAt(0);
					switch (nc252) {
					case '1':
						mainmobile.mbn();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
						break;
					}
					break;
				case '2':
					mainmobile.mbn();
					System.out.println("1->username");
					char nc253 = sc.nextLine().charAt(0);
					switch (nc253) {
					case '1':
						mainname.mnn();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
						//ends
						break;
					}
				}
				break;
			}
			
			break;
		}
	}
	if(nc2=='4')
	{
		switch (nc2) {
		case '4':////////////////////
			mainpassword.mps();
			maincpass.cpass();
				System.out.println("Enter 1->>DOB");
				System.out.println("2->>username  3->>Mobile");
				char nc3 = sc.nextLine().charAt(0);
				if(nc3=='1')
				{
					switch (nc3) {
					case '1':
						maindob.dobs();
						//nestds 1.24
						System.out.println("1->>username  2->>Mobile");
						char nc4 = sc.nextLine().charAt(0);
						if(nc4=='1')
						{
							switch (nc4) {
							case '1':
								mainname.mnn();
								//ns1.25
								System.out.println("enter 1->Mobile");
								char nc5 = sc.nextLine().charAt(0);
								if(nc5=='1')
								{
									mainmobile.mbn();
									mainaddress.addressss();
									mainname.namenss();
									mainmobile.mbpn();
									maindob.dmb();
									maingender.gend();
									maingmail.gmeth();
									
								}
								break;
							}
							
						}
						if(nc4=='2')
						{
							switch (nc4) {
							case '2':
								mainmobile.mbn();
								System.out.println("1->>Enter username");
								char nc41 = sc.nextLine().charAt(0);
								switch (nc41) {
								case '1':
									mainname.mnn();
									mainaddress.addressss();
									mainname.namenss();
									mainmobile.mbpn();
									maindob.dmb();
									maingender.gend();
									maingmail.gmeth();
									
									
									break;
								}
								break;//loack
							}
							
						}
						break;
					}
				}
				if(nc3=='2')
				{
					switch (nc3) {
					case '2':
						mainname.mnn();
						System.out.println("Enter 1->Dob 2->Mobile");
						char nc31 = sc.nextLine().charAt(0);
						switch (nc31) {
						case '1':
								maindob.dobs();
								System.out.println("enetr 1->> Mobile");
								char nc32 = sc.nextLine().charAt(0);
								switch (nc32) {
								case '1':
									mainmobile.mbn();
									mainaddress.addressss();
									mainname.namenss();
									mainmobile.mbpn();
									maindob.dmb();
									maingender.gend();
									maingmail.gmeth();
									
									break;
								}
							break;
						case '2':
							mainmobile.mbn();
							System.out.println("enter 1->dob");
							char nc33 = sc.nextLine().charAt(0);
							switch (nc33) {
							case '1':maindob.dobs();
							mainaddress.addressss();
							mainname.namenss();
							mainmobile.mbpn();
							maindob.dmb();
							maingender.gend();
							maingmail.gmeth();
								
								break;

							default:
								break;
							}
						}
						break;
					}
					
				}
				if(nc3=='3')
				{
					switch (nc3) {
					case '3':
						mainmobile.mbn();
					System.out.println("enter 1->dob  2->username");
					char nc31 = sc.nextLine().charAt(0);
					switch (nc31) {
					case '1':
						 maindob.dobs();
						 System.out.println("enter 1->username");
						 char nc33 = sc.nextLine().charAt(0);
						 switch (nc33) {
						case '1':
							mainname.mnn();
							mainaddress.addressss();
							mainname.namenss();
							mainmobile.mbpn();
							maindob.dmb();
							maingender.gend();
							maingmail.gmeth();
							break;
			
						}
						break;

					case'2':
						mainname.mnn();
						System.out.println("enter 1->dob");
						char nc331 = sc.nextLine().charAt(0);
						switch (nc331) {
						case '1':
							maindob.dobs();
							mainaddress.addressss();
							mainname.namenss();
							mainmobile.mbpn();
							maindob.dmb();
							maingender.gend();
							maingmail.gmeth();
							break;
						}
						break;
					}
						
						break;//loack
					}
				}
		
			break;
		}
	}
	if(nc2=='3')
	{
		switch (nc2) {
		case '3':
			mainmobile.mbn();
			System.out.println("Enter 1->>DOB");
			System.out.println("2->>username 3->>password");
			char nc3 = sc.nextLine().charAt(0);
			if(nc3=='1')
			{
				switch (nc3) {
				case '1':
					maindob.dobs();
					//nestds 1.24
					System.out.println("1->>username 2->>password");
					char nc4 = sc.nextLine().charAt(0);
					if(nc4=='1')
					{
						switch (nc4) {
						case '1':
							mainname.mnn();
							System.out.println("enter (1)->>password");
							char nc5 = sc.nextLine().charAt(0);
							if(nc5=='1')
							{
								mainpassword.mps();
								maincpass.cpass();
								mainaddress.addressss();
								mainname.namenss();
								mainmobile.mbpn();
								maindob.dmb();
								maingender.gend();
								maingmail.gmeth();
								
							}
							break;
						}
						
					}
					if(nc4=='2')
					{
						switch (nc4) {
						case '2':
							mainpassword.mps();
							maincpass.cpass();
							System.out.println("Enter (1)->> username");
							char nc41 = sc.nextLine().charAt(0);
							switch (nc41) {
							case '1':
								mainname.mnn();
								mainaddress.addressss();
								mainname.namenss();
								mainmobile.mbpn();
								maindob.dmb();
								maingender.gend();
								maingmail.gmeth();
								
								
								break;
							}
							break;//loack
						}
						
					}
					break;
				}
			}
			if(nc3=='2')
			{
				switch (nc3) {
				case '2':
					mainname.mnn();
					System.out.println("Enter 1->Dob 2->password");
					char nc31 = sc.nextLine().charAt(0);
					switch (nc31) {
					case '1':
							maindob.dobs();
							System.out.println("enter (1)->> address");
							char nc32 = sc.nextLine().charAt(0);
							switch (nc32) {
							case '1':
								mainaddress.madd();
								mainaddress.addressss();
								mainname.namenss();
								mainmobile.mbpn();
								maindob.dmb();
								maingender.gend();
								maingmail.gmeth();
								
								break;
							}
						break;
					case '2':
						mainpassword.mps();
						maincpass.cpass();
						System.out.println("enter (1)->dob");
						char nc33 = sc.nextLine().charAt(0);
						switch (nc33) {
						case '1':maindob.dobs();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
							
							break;

						default:
							break;
						}
					}
					break;
				}
				
			}
			if(nc3=='3')
			{
				switch (nc3) {
				case '3':
					mainpassword.mps();
					maincpass.cpass();
				System.out.println("enter 1->>dob  2->>username");
				char nc31 = sc.nextLine().charAt(0);
				switch (nc31) {
				case '1':
					 maindob.dobs();
					 System.out.println("enter (1)->username");
					 char nc33 = sc.nextLine().charAt(0);
					 switch (nc33) {
					case '1':
						mainname.mnn();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
						break;
		
					}
					break;

				case'2':
					mainname.mnn();
					System.out.println("enter (1)->dob");
					char nc331 = sc.nextLine().charAt(0);
					switch (nc331) {
					case '1':
						maindob.dobs();
						mainaddress.addressss();
						mainname.namenss();
						mainmobile.mbpn();
						maindob.dmb();
						maingender.gend();
						maingmail.gmeth();
						break;
					}
					break;
				}
					
					break;//loack
				}
			}
			break;
		}
	}




}
}
