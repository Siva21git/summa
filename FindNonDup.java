package com.task;

public class FindNonDup {
	public void findNonDuplicate(String n ) {
		String x="";
		char [] c =n.toCharArray();
		for(int i=0;i<c.length;i++) {
			int count=0;
			for(int j=0;j<c.length;j++) {
				if(c[i]==c[j]) {
					count++;
				}
			}
			if(count==1) {
				x=x+c[i];
			}
			
		}
		System.out.println(x);	
		
	}

}
