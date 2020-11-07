package test;

import java.util.Random;

public class RepeatArray3 {

    public static void main(String[] args) {

        int [] numbers = new int[5];

        Random random = new Random();

        int x = random.nextInt(10);
       // System.out.println(x);


        // 1st loop to insert a random int in the array
        for (int i=0; i< numbers.length; i++){
            numbers[i]= random.nextInt(100);
        }

        //2nd loop to print all int from the array

        for (int i=0; i< numbers.length; i++)
        System.out.println(numbers[i]);
        }
    }

