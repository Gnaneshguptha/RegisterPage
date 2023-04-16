package com.Register;

public class Gender {
private String G;
public Gender(String s1) {
	if(s1.equalsIgnoreCase("male")||s1.equalsIgnoreCase("female")||s1.equalsIgnoreCase("other"))
	{
		G=s1;
	}
	else {
		G=null;
	}
}
public String getG() {
	return G;
}
public void setG(String s) {
	this.G = s;
}
	

}
