package com.Register;

public class Dob {
private String dob;
Dob(String s){
	if(s==null)
	{
		dob=null;
	}
	else {
		dob=s;
	}
	
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
}
