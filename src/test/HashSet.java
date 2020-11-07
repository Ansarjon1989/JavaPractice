package test;

public class HashSet {

    public static void main(String[] args) {

        java.util.HashSet<String> cars = new java.util.HashSet<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        for (String i : cars){
            System.out.println("HashSet is :" +i);
        }

    }
}
