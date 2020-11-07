package test.arrayPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        ArrayList<String> namesOfEmployees = new ArrayList<>();
        namesOfEmployees.add("Jimi");
        namesOfEmployees.add("Smith");
        namesOfEmployees.add("George");

        //namesOfEmployees.remove(0);



//        System.out.println(namesOfEmployees.size());
//        System.out.println(namesOfEmployees.get(0));
//        System.out.println(namesOfEmployees);



        for (int i=0; i<namesOfEmployees.size(); i++){
            System.out.println(namesOfEmployees.get(i));
        }




        System.out.println();

        ArrayList<Integer> phoneNumber = new ArrayList<>();

        phoneNumber.add(34732234);
        phoneNumber.add(71800000);
        phoneNumber.add(71810000);


        System.out.println(phoneNumber);

        for (int i=0; i< phoneNumber.size(); i++){
            System.out.println(phoneNumber.get(i));
        }


        System.out.println();

        ArrayList<Object> everything = new ArrayList<>();

        everything.add("Chevrolet Camaro");
        everything.add("Year: "+2020);
        everything.add("10000 $  US dollars");

        System.out.println(everything);



        for (int i=0; i< everything.size(); i++){
            System.out.println(everything.get(i));
        }


        Iterator iterator = phoneNumber.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }


}
