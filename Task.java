package com.task;

public class Task {
	public static void main(String[] args) {
		String [] a=args[0].split(",");
		for (int i = 0; i < a.length; i++) {
			if(a[i].length()%2==0) {
				int b=a[i].length()/2;
				System.out.println(a[i].charAt(b-1)+" "+a[i].charAt(b));
			}else {
				int c=a[i].length()/2;
				System.out.println(a[i].charAt(c));
			}
		}
	}

}
