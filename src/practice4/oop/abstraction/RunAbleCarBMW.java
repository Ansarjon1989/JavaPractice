package practice4.oop.abstraction;

public class RunAbleCarBMW extends Car implements Vehicle, Vehicl2 {
    // i - i
    // implements - interface
    // extends - class/abstract class
    // implement more than one interface is allowed
    // only one abstract class/ class is allowed

    // method overriding -- same method name,same params, in the different class
    // dynamic polymorphism or run time polymorphism

    @Override
    public void key() {
        System.out.println("car has key");

    }

    @Override
    public void move() {
        System.out.println("Car able to move");

    }

    @Override
    public void start() {

        System.out.println("Car able start");
    }

    @Override
    public void stop() {
        System.out.println(" Car will stop automatically");
    }

    @Override
    public void name() {
        System.out.println("Name of the car");

    }

    @Override
    public void window() {

        System.out.println("four windows");
    }

    @Override
    public void doors() {

        System.out.println("this car has Two doors");
    }



}
