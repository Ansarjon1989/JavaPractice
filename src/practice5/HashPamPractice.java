package practice5;

import java.util.HashMap;

public class HashPamPractice {

    public static void main(String[] args) {

        // key-value pair
        // hashtable can contain null key/value
        // hashmap is faster
        // hashmap is not thread safe and non synchronized

        HashMap<Integer, String> studentInformation = new HashMap<>();

        studentInformation.put(1532, "Nusrut");
        studentInformation.put(12321, "Michael");
        studentInformation.put(3545, "David");
        studentInformation.put(8998, "Jafor");
        studentInformation.put(424, null);

        System.out.println(studentInformation);


        System.out.println();

        HashMap<String, Integer> locationInformation = new HashMap<>();

        locationInformation.put("Rego Park", 11374);
        locationInformation.put("Grand Concourse", 11623);

        System.out.println(locationInformation.get("Rego Park"));

        System.out.println(locationInformation);
        System.out.println(studentInformation);

        System.out.println(studentInformation.size());

        System.out.println(studentInformation.containsKey(325));

        System.out.println(studentInformation.containsValue("Rahat"));


    }
}
