package test.arrayPractice;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapPractice1 {

    public static void main(String[] args) {


        HashMap<String, Integer> nameAndYear = new HashMap<>();

        nameAndYear.put("Audi", 2017);
        nameAndYear.put("BMW", 2000);
        nameAndYear.put("Mercedes-Benz", 2020);
        nameAndYear.put("Jeep", null);

        System.out.println(nameAndYear);

        System.out.println(nameAndYear.get("BMW"));

        System.out.println(nameAndYear.containsValue(2000));

        System.out.println(nameAndYear.containsKey("Audi"));

        System.out.println();


        HashMap<String, Integer> locationInformation = new HashMap<>();
        locationInformation.put("Rego Park", 11374);
        locationInformation.put("Grand Concourse", 11646);

        System.out.println(locationInformation);

        //for (int i=0; i<locationInformation;)

      //Iterator iterator
        }

    }

