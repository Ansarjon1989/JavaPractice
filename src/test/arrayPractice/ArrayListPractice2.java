package test.arrayPractice;

import java.util.ArrayList;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> cityOfUSA = new ArrayList<>();

        cityOfUSA.add("New York");
        cityOfUSA.add("Jersey City");
        cityOfUSA.add("Virginia");

       ArrayList<String> cityOfCanada = new ArrayList<>();

       cityOfCanada.add("Toronto");
       cityOfCanada.add("Montreal");
       cityOfCanada.add("Victoria");

       ArrayList<ArrayList<String>> world = new ArrayList<>();

       world.add(cityOfUSA);
       world.add(cityOfCanada);

        System.out.println(world);

        System.out.println();

        for (int i=0; i<world.size(); i++){
            System.out.println(world.get(i));
        }

    }
}
