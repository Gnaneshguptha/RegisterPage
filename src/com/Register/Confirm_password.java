package com.Register;

public class Confirm_password {
	 private String cp;
//	 static String cps;
//	 public static void cc() {
//			cps=Password.pp();
//		}
	 Confirm_password(String pas)
	 {
	       if(pas.matches(Password.pp())){
	            cp=pas;
	        }
	       else {
	    	   cp=null;
	       }
		 
	 }
	public String getcP() {
		return cp;
	}
	public void setcP(String p) {
		this.cp = p;
	}
	
	 
}