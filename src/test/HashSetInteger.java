package test;

import java.util.HashSet;

public class HashSetInteger {

    public static void main(String[] args) {


        HashSet<Integer> years = new HashSet<Integer>();

        years.add(0);
        years.add(1);
        years.add(2);
        years.add(3);
        years.add(4);
        years.add(5);
        years.add(6);
        years.add(7);
        years.add(8);
        years.add(9);
        years.add(10);

        for (int i = 1; i <= 10; i++) {
            if (years.contains(i)) {
                System.out.println(i + " Was found in the set.");
            } else {
                System.out.println(i + "Was not found in the set ");
            }
        }
    }
    }

