package test.arrayPractice;

import java.util.HashSet;

public class HashSet22 {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(4);
        numbers.add(6);
        numbers.add(10);

        for (int i=0; i<=10; i++){
            if (numbers.contains(i)){
                System.out.println(i+": "+ "was found in the set.");
            }else{
                System.out.println(i+": "+"was not found in the set.");
            }
        }

        System.out.println("========================================================");


        HashSet<String> names = new HashSet<>();

        names.add("Ali");
        names.add("Jimi");
        names.add("Cindy");
        names.add("Ali");

        System.out.println(names);
    }
}
