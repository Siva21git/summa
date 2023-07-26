package com.task;

public class Nested {
	public String[] rev(String[]name) {
		String [] x= new String[name.length];
		for (int i = 0; i < x.length; i++) {
			String y=name[i];
			String rev="";
			for (int j=y.length()-1;j>=0;j--) {
				rev = rev+y.charAt(j);
			}
			x[i]=rev;
		}
		return x;
	}

}
