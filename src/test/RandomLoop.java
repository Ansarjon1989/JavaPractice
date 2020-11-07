package test;

import java.util.Random;

public class RandomLoop {

    public static void main(String[] args) {


        int[] loop = new int[1];
        loop [0] = 100;

        Random random = new Random();
        int a = random.nextInt(1000);
        int b= random.nextInt(100);

        for (int i=0; i<2; i++){
            System.out.println(a);
//            System.out.println(b);
        }
        System.out.println(b);

    }
}
