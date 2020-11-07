package test.arrayPractice;

import java.util.ArrayList;

public class ArrayListPracticeInteger {

    public static void main(String[] args) {

        ArrayList <Integer> numbersOne = new ArrayList<>();

        numbersOne.add(10);
        numbersOne.add(100);
        numbersOne.add(1000);
        numbersOne.add(10000);


        ArrayList<Integer> numbersTwo = new ArrayList<>();

        numbersTwo.add(20);
        numbersTwo.add(200);
        numbersTwo.add(2000);
        numbersTwo.add(20000);

        ArrayList <ArrayList<Integer>> allNumbers = new ArrayList<>();

        allNumbers.add(numbersOne);
        allNumbers.add(numbersTwo);

        System.out.println(allNumbers);


    }


}
