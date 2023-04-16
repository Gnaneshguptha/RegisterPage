package com.Register;

public class Mobile_no {
	String c;
	Mobile_no(String a){
		int s=a.length();
		if(s==10)
		{
			for (int i = 0; i < s; i++) {
				char ch=a.charAt(i);
				if(i==0)
				{
					if(ch=='7'||ch=='8'||ch=='9')
					{
						c=a;
					
						break;
					}
					else {
						c=null;
					}
				}
				
			}
		}
		else {
			c=null;
		}
		
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	

}
