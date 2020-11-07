package test.arrayPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, Integer> bMWInfo = new HashMap<>();
        bMWInfo.put("BMW", null);
        bMWInfo.put("Year", 2000);
        bMWInfo.put("Price", 12999);
        bMWInfo.put("Address Zip Code", 11370);

       // System.out.println(bMWInfo);


        HashMap<String, Integer> audiInfo = new HashMap<>();
        audiInfo.put("Audi", null);
        audiInfo.put("Year", 2017);
        audiInfo.put("Price", 23000);
        audiInfo.put("Address Zip Code", 11277);

       // System.out.println(audiInfo);

       HashMap<String, HashMap<String, Integer>> cars = new HashMap<>();
       cars.put("BMW", bMWInfo);
       cars.put("Audi", audiInfo);

        System.out.println(cars);

        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        list.add(bMWInfo);
        list.add(audiInfo);

        System.out.println(list);


    }
}
