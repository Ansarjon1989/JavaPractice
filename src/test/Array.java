package test;

public class Array {

    public static void main(String[] args) {


        String [] names = {"Adnan", "Akmal", "Jimi"};

        for(int i=0; i<3; i++){
            System.out.println(names[i]);
        }

        int [] numbers ={123, 3423, 324, 55};

        for(int a=0; a <4; a++){
            System.out.println(numbers [a]);

        }

        System.out.println(numbers[0]);
        Object [] everything = {12321, "Hello", true, 'A'};

        System.out.println(everything[3]);

        Object zipCode = everything[0];
        System.out.println(zipCode);




    }
}
