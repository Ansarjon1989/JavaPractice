package myNewAbstract2;

public class Laptops extends Laptop1 implements Laptop{
    @Override
    public void warranty() {
        System.out.println("One Year Warranty");
    }

    @Override
    public void screen() {
        System.out.println("Touch Screen.");
    }


    @Override
    public void turnOn() {
        System.out.println("First turn on.");
    }

    @Override
    public void use() {
        System.out.println("An than use it.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off.");
    }
}
