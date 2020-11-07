package test.arrayPractice;

import java.util.Random;

public class ArrayPractice33 {

    public static void main(String[] args) {


        int[] numbers = new int[5];

        Random random = new Random();
        int x = random.nextInt(99);
        //System.out.println(x);

        // 1st loop to insert random int in the array and fill all the index
        for (int i=0; i< numbers.length; i++){
            numbers[i]= random.nextInt(99);
        }

        //2nd loop to print  all int from the array

        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
