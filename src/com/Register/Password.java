package com.Register;

public class Password {
	 private String p;
	 static String cpString;
	 Password(String pas)
	 {
	       if(pas.matches(".*[0-9]{1,}.*") && pas.matches(".*[@#$]{1,}.*") && pas.length() >=4 && pas.length()<=20){
	            p=pas;
	            cpString=p;
	        }
	       else {
	    	   p=null;
	       }
		 
	 }
	public String getP() {
		return p;
	}
	public void setP(String p) {
		this.p = p;
	}
	public static String pp() {
		return cpString;
	}
	 
}
