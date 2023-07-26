package com.task;

import java.util.ArrayList;
import java.util.Scanner;

public class NonDuplicate {
	


    public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        ArrayList<Character> counter = new ArrayList<>();
        for(int i = 0; i < name.length();i++){

            int count = 0;

            if (counter.contains(name.charAt(i))) {
                continue;
            }

            for(int j=0;j < name.length();j++){

                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }

            }

            if (count == 1) {
                counter.add(name.charAt(i));
            }

        }

        counter.forEach(System.out::println);

    }
   
}
