package practice4.oop.abstraction;

public class UserWhoUseTheCar {
    public static void main(String[] args) {
        RunAbleCarBMW object = new RunAbleCarBMW();
        object.doors();
        object.key();
        object.move();
        object.name();
        object.start();
        object.stop();
        object.brake();

    }
}
