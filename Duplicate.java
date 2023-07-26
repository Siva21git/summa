package com.task;

import java.util.HashMap;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        HashMap<Character, Integer> counter = new HashMap<>();
        for(int i = 0; i < name.length();i++){

            int count = 0;

            if (counter.containsKey(name.charAt(i))) {
                continue;
            }

            for(int j=0;j < name.length();j++){

                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }

            }

            if (count > 1) {
                counter.put(name.charAt(i), count);
            }

        }

        counter.entrySet().stream().forEach(x -> {
            if (x.getValue() > 1) {
                System.out.printf("%s: %d\n", x.getKey(), x.getValue());
            }
        });


	}
}
