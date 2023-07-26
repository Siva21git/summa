package com.task;

public class Swapping {
	int a=10;
	int b=20;
	public void swap() {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Swapping s= new Swapping();
		s.swap();
	}
	
}
