package test;

import java.util.HashMap;

public class HashMapInteger {

    public static void main(String[] args) {


        HashMap <String, Integer> people = new HashMap<String, Integer>();

        people.put("Ali", 1);
        people.put("Jimi", 22);
        people.put("Garik", 34);
        people.put("Khan", 55);

        for (String i : people.keySet()){
            System.out.println("key :" +i+" "+ "Value is:"+people.get(i));

        }


    }
}
