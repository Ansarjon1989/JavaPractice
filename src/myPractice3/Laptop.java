package myPractice3;

public class Laptop {

    int year;
    String model;
    String make;
    String keys;


    public Laptop(int yearOfLaptop, String modelOfLaptop){
        this.year = yearOfLaptop;
        this.model = modelOfLaptop;
    }

    public Laptop(int yearOfLaptop, String modelOfLaptop, String keysOfLaptop){
        this.year = yearOfLaptop;
        this.model = modelOfLaptop;
        this.keys = keysOfLaptop;
    }

    public Laptop(String makeOfLaptop){
        this.make = makeOfLaptop;
    }


    public static void main(String[] args) {

        Laptop laptop = new Laptop(1999, "Model");
        laptop.printInfoOfLaptop();

//        Laptop laptop1 = new Laptop(1999,"catalina", "Keys");
//        laptop1.printInfoOfLaptop();
//
//        Laptop laptop2 = new Laptop("Make");
//        laptop2.printInfoOfLaptop();

    }

    private void printInfoOfLaptop(){
        System.out.println(year);
        System.out.println(model);
        System.out.println(make);
        System.out.println(keys);


    }


}
