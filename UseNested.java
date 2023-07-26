package com.task;

public class UseNested {
	public static void main(String[] args) {
		Nested n = new Nested();
		String [] name = {"geneva","wales","oslo"};
		String []m = n.rev(name);
		for(String c:m) {
			System.out.println(c);
		}

	}

}
