package test.practice3;

public class Car { // parameterization of  constructor

    int year;
    String name;
    String price;
    String city;



    public Car(){

    }

    public Car(int yearOfCar, String nameOfCar){
        this.year = yearOfCar;
        this.name = nameOfCar;

    }

    public Car(String priceOfCar, String cityOfCar){
        this.price = priceOfCar;
        this.city = cityOfCar;

    }

    public Car(int yearOfCar, String nameOfCar, String priceOfCar, String cityOfCar){
        this.year = yearOfCar;
        this.name = nameOfCar;
        this.price = priceOfCar;
        this.city = cityOfCar;

    }

    public static void main(String[] args) {

//        Car car = new Car(2020,"BMW");
//        car.printCar();
//
//        Car car1 = new Car("45000", "New York");
//        car1.printCar();

        Car car2 = new Car(2019,"Jeep", "45io2", "New York");
        car2.printCar();


    }

    public  void printCar(){
        System.out.println(year);
        System.out.println(name);
        System.out.println(price);
        System.out.println(city);
    }
}
