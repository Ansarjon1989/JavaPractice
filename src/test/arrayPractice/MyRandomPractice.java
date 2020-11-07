package test.arrayPractice;

import java.util.Random;

public class MyRandomPractice {

    public static void main(String[] args) {

        int [] months = new int[12];

        Random numOfMonths = new Random();
        int x = numOfMonths.nextInt(12);
        //System.out.println(x);

        for (int i=1; i< months.length; i++){
           months[i] = numOfMonths.nextInt(12);
        }

        for (int i=1; i< months.length; i++){
            System.out.println(months[i]);
        }

        System.out.println(months.length+" months");
    }
}
