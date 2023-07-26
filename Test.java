package com.task;
import java.util.*;
public class Test {
	public List<String> findname(String[]name) {
		List<String>s = new ArrayList<>();
		for(int i=name.length-1;i>=0;i--) {
			s.add(name[i]);
		}
		return s;
	}
}