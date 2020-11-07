package myPractice4.oop.Abstraction;

public class RunableCarBMW extends Car implements Vehicle{

    // i - i
    // implements - interface
    // extends - class/abstract class
    // implement more than one interface is allowed
    // only one abstract class/ class is allowed

    // method overriding -- same method name,same params, in the different class
    // dynamic polymorphism or run time polymorphism


    @Override
    public void wheele() {
        System.out.println("runable car has wheel");
    }

    @Override
    public void move() {
        System.out.println("runable car can move");
    }

    @Override
    public void start() {
        System.out.println("runable car can start");
    }

    @Override
    public void stop() {
        System.out.println("runable car can stop");
    }

    @Override
    public void name() {
        System.out.println("Name of the car BMW");
    }



}
