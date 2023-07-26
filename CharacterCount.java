package com.task;

import java.util.ArrayList;

public class CharacterCount {
	public static void main(String[] args) {
		String s = "sivaprasad";
		ArrayList<Character> n = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(n.contains(s.charAt(i))) {
				continue;
			}
			int c=0;
		
		for(int j=0;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				c++;
			}
		}
		n.add(s.charAt(i));
		System.out.println(s.charAt(i)+"="+c);
		}
		
		
		}
	}


