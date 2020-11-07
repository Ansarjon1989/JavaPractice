package test.arrayPractice;

import test.Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListPractice22 {

    public static void main(String[] args) {

        ArrayList<String> nameOCityUSA = new ArrayList<>();

        nameOCityUSA.add("New York");
        nameOCityUSA.add("New Jersey");
        nameOCityUSA.add("New Mexico");
        nameOCityUSA.add("Austin");

        System.out.println(nameOCityUSA);


        ArrayList<String> nameOfCityCanada = new ArrayList<>();

        nameOfCityCanada.add("Toronto");
        nameOfCityCanada.add("Ottawa");
        nameOfCityCanada.add("Calgary");

        System.out.println(nameOfCityCanada);



        ArrayList<ArrayList<String>> twoCountryCities = new ArrayList<>();

        twoCountryCities.add(nameOCityUSA);
        twoCountryCities.add(nameOfCityCanada);

        System.out.println(twoCountryCities);

        System.out.println();

        Iterator iterator = nameOCityUSA.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
