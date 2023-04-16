package com.Register;

public class Name {
	private String name;
	 Name(String n) {
		 if (n.length()>3) {
			 name=n;
		 	}
		else {
			name=null;
		}
		
	} 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	 
	 
}
