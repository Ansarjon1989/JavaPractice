package test.arrayPractice;

public class CarExecution {

    public static void main(String[] args) {

        Car car = Car.getInstance();
        String model = car.getMyCarModel();
        System.out.println(model);

        Tv tv = Tv.getInstance();
        int year = tv.tvYear();
        System.out.println(year);



    }
}
