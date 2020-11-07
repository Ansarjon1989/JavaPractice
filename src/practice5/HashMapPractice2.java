package practice5;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice2 {

    public static void main(String[] args) {

        HashMap<String, Integer> cityAndZipOfUSA = new HashMap<>();
        cityAndZipOfUSA.put("NY", 11324);
        cityAndZipOfUSA.put("DC", 32122);
        cityAndZipOfUSA.put("NJ", 97238);



        HashMap<String, Integer> cityAndZipOfCanada = new HashMap<>();
        cityAndZipOfCanada.put("VA", 123123);
        cityAndZipOfCanada.put("VC", 882713);



        // key = usa, canada --> String
        // value = Hashmap of String and Integer
        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();
        map.put("USA", cityAndZipOfUSA);
        map.put("Canada", cityAndZipOfCanada);
        System.out.println(map);

        // store into a list
        ArrayList<HashMap<String, Integer>> list = new ArrayList<>();
        list.add(cityAndZipOfUSA);
        list.add(cityAndZipOfCanada);

        System.out.println(list);


    }
}
