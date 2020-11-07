package test;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, Integer> cityAndZipCode = new HashMap<>();

        cityAndZipCode.put("New York", 1000);
        cityAndZipCode.put("New Jersey", 2000);
        cityAndZipCode.put("Philadelphia", 3000);

        System.out.println(cityAndZipCode);

        HashMap<Integer, String> gasNameAndPrice = new HashMap<>();

        gasNameAndPrice.put(2, "Regular");
        gasNameAndPrice.put(3, "Extra");
        gasNameAndPrice.put(4, "Super");

        System.out.println(gasNameAndPrice);

    }
}
