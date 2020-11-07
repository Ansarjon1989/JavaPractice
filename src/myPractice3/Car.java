package myPractice3;

public class Car {

    private Car(){

    }

    String model;
    String year;


    public Car(String nameOfCar){
        this.model = nameOfCar;
    }

    public Car (String nameOfCar, String yearOfCar){
        this.model = nameOfCar;
        this.year = yearOfCar;
    }

    public static void main(String[] args) {

        Car car = new Car("Nexia", "1212");
        car.printCar();

    }

    public void printCar(){
        System.out.println(model);
        System.out.println(year);
    }

}
