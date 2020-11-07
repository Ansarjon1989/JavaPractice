package test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayCollectionSort {

    public static void main(String[] args) {

        ArrayList <String> autos = new ArrayList<String>();

        autos.add("Jeep");
        autos.add("AlfaRameo");
        autos.add("Daewoo");
        autos.add("Xolodilnik");
        autos.add("BMW");
        Collections.sort(autos);

        for (String i: autos){
            System.out.println(i);
        }
    }
}
