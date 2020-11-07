package test.arrayPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        for (int i=0; i< number.size(); i++){
            System.out.println(number.get(i));
        }

        //number.remove(0);

        System.out.println(number);

        System.out.println();
        System.out.println("==========================Object===================");

        ArrayList<Object> car = new ArrayList<>();

        car.add("Name of the car:");
        car.add("Year of the car :"+" "+2020);
        car.add(true);
        car.add(false);
        car.add('A');
        car.add(49.999);

        System.out.println(car);
        System.out.println(car.size());
        System.out.println(car.get(1));

        for (int i=0; i< car.size(); i++){
            System.out.println(car.get(i));
        }

        System.out.println();

        Iterator iterator = number.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        ArrayList<String> names = new ArrayList<>();

        names.add("Jimi");
        names.add("Mougly");
        names.add("Kayle");

        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.get(2));
        names.remove(0);


        for (int i=0; i< names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println();

       Iterator iterator1 = car.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
