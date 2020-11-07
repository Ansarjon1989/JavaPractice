package test.practice3;

public class Car2 {

    int year;
    String name;
    String city;
    String price;


    public static void main(String[] args) {
        printYearOfTheCar();
        printCarDetails(1999, "Camry");
        cityAndPrice("NY", "1000$");

    }

    public static void printYearOfTheCar(){
        System.out.println(2020);
    }

    public static void printCarDetails(int yearOfCar, String nameOfCar){
        System.out.println(yearOfCar+" "+nameOfCar);

    }

    public static void cityAndPrice(String cityOfCar, String priceOfCar){
        System.out.println(cityOfCar+" "+priceOfCar);
    }
}
