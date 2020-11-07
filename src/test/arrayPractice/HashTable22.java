package test.arrayPractice;

import java.util.HashSet;
import java.util.Hashtable;


public class HashTable22 {

    public static void main(String[] args) {
        // hashtable can't contain null key/value
        // hashtable is slower
        // hashtable is thread safe and synchronized

        Hashtable<String, Integer> nameAndAge = new Hashtable<>();

        nameAndAge.put("Jimi", 22);
        nameAndAge.put("Maximus", 60);
        nameAndAge.put("Alexandr", 33);

        System.out.println(nameAndAge);


    }
}
