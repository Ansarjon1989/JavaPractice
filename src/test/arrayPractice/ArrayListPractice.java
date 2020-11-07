package test.arrayPractice;

import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

    public static void main(String[] args) {


        ArrayList<String> cars = new ArrayList<>();

        System.out.println("=======================ArrayList String=================");

        cars.add("Alfa Romeo");
        cars.add("BMW");
        cars.add("Chevrolet");
        cars.add("Austin Martin");

        System.out.println(cars.size());
        System.out.println(cars);
        //System.out.println(cars.get(0));

        for (int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }



        System.out.println();

        System.out.println("==================== ArrayList Integer ====================");


        ArrayList<Integer> years = new ArrayList<>();

        years.add(1999);
        years.add(2000);
        years.add(2001);
        years.add(2002);


        for (int i=0;  i<years.size(); i++){
            System.out.println(years.get(i));
        }

            System.out.println(years.size());
            System.out.println(years.get(3));




        System.out.println();
        System.out.println("========================Object====================");

        ArrayList <Object> carInfo = new ArrayList<>();

        carInfo.add("Jeep");
        carInfo.add(2020);
        carInfo.add('$');
        carInfo.add(true);
        carInfo.add(false);

        System.out.println(carInfo);

        System.out.println();

        Iterator iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
