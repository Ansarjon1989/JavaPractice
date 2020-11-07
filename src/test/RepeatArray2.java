package test;

import java.util.Arrays;

public class RepeatArray2 {

    public static void main(String[] args) {


        String[] names = {"Adnan", "Rahman", "Axmed", "Rahat", "David", "Tigist", "Iyes"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }



        try {
            System.out.println(names[7]);
        }catch (Exception e){
            System.out.println("Exception occured, try to fix your index.");

        }
        {
            System.out.println(names.length);
        }


        String [] cars = new String[5];

        cars[0] ="BMW";
        cars[1] = "Mers";
        cars[2] = "Jeep";

        System.out.println(cars.length);

        System.out.println(cars[2]);
        System.out.println(cars[3]);
        System.out.println(cars[4]);

        String[] myCars = cars.clone();
        System.out.println(myCars.length);

    }
}


