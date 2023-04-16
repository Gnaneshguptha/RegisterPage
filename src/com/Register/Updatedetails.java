package com.Register;

import java.util.Scanner;

public class Updatedetails {
public static void udpatess() {
	Scanner sc1=new Scanner(System.in);
	System.out.println("press a NUM to edit details 1->> address 2->>name    3->>mobile");
	System.out.println("                            4->> Dob     5->> Gender 6->>gmail");
	System.out.println("                      press (7)->>to Close the account");
	char c51 = sc1.nextLine().charAt(0);
	switch (c51) {	
	case '1':
		mainaddress.madd();
		mainaddress.updateaddress();
		break;
	case '2':
		mainname.mnn();
		mainname.updatnames();
		break;
	case '3':
		mainmobile.mbn();
		mainmobile.updatemobile();
		break;
	case '4':
		maindob.dobs();
		maindob.updatedob();
		break;
	case '5':
		maingender.gen();
		maingender.updategend();
		break;
	case '6':
		maingmail.mgl();
		maingmail.updategmail();
		break;
	case '7':
		sc1.close();
		mainname.afterupdate();
		mainaddress.afterupdate();
		maingmail.afterupdate();
		maindob.afterupdate();
		maingender.afterupdate();
		mainmobile.afterupdate();
		break;
	}
}
}
