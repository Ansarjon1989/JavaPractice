package test;

import java.util.HashSet;

public class HashSet2 {

    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(2);
        numbers.add(6);
        numbers.add(10);

        for (int i=1; i<=10; i++){

            if (numbers.contains(i)){
                System.out.println(i+": number found in the set.");
            }else{
                System.out.println(i+": was not found in the set.");
            }
        }
    }
}
