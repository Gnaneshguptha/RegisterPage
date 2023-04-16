package com.Register;

import java.util.regex.Pattern;

public class Gmail_id {
	
	private String mail;
	public Gmail_id(String mail) {
		if(verify(mail)==true)
		{	
			this.mail=mail;
		}
		else {
			this.mail=null;
		}
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String str) {
		this.mail = str;
	}
	public static boolean verify(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
				"[a-zA-Z0-9_+&*-]+)*@" +
				"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
				"A-Z]{2,7}$"; 
				
		Pattern pat = Pattern.compile(emailRegex);
			if (email == null)
			return false;
			return pat.matcher(email).matches();
}

}
