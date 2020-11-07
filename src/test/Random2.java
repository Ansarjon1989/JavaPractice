package test;

import java.util.Random;

public class Random2 {

    public static void main(String[] args) {

        int [] dates = new int[30];
        dates [1] = 31;

        Random random = new Random();
        int d = random.nextInt(30);
        int c = random.nextInt(31);

        System.out.println(d+" "+"October");
        System.out.println(c+" "+"December");
        System.out.println(d+" "+"October");
        System.out.println(c+" "+"December");
        System.out.println(d+" "+"October");
        System.out.println(c+" "+"December");
        System.out.println(d+" "+"October");
        System.out.println(c+" "+"December");

    }

}

