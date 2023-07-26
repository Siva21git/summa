package com.task;

import java.util.Scanner;

public class Sample {
	String brand;
	int price ;
	boolean isWired;
	
	public Sample getInput(Sample input) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(brand);
		int b=sc.nextInt();
		boolean c=sc.hasNextBoolean();
		return input;
	}

}
