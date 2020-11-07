package test.practice3;

import myPractice1.methodPractice.NewYork;

public class ParametrizationOfMethod {


    public static void main(String[] args) {


        printAge();
        printAge("November");
        printAge(1989);
        printAge("New York", 11435);
    }


    public static void printAge(){
        System.out.println(30);
    }

    public static void printAge(int bornYear){
        System.out.println(bornYear);
    }

    public static void printAge(String month){
        System.out.println(month);
    }

    public static void printAge(String city, int zipCode){
        System.out.println(city);
        System.out.println(zipCode);
    }
}
