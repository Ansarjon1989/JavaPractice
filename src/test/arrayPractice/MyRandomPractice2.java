package test.arrayPractice;

import java.util.Random;

public class MyRandomPractice2 {

    public static void main(String[] args) {

        int [] days = new int[5];

        Random  random = new Random();
        int a = random.nextInt(22);
        System.out.println(a);

        for (int i=0; i< days.length; i++){
            days [i]=random.nextInt(10000);
        }

        for (int i=0; i< days.length; i++){
            System.out.println(days[i]);
        }





    }


}
