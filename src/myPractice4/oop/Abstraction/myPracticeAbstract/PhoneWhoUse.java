package myPractice4.oop.Abstraction.myPracticeAbstract;

public class PhoneWhoUse extends Phone2 implements Phone {
    @Override
    public void turnOn() {
        System.out.println("This phone can turn on by voise command");
    }

    @Override
    public void makeCall() {
        System.out.println("We can call to any country for free.");
    }

    @Override
    public void alarm() {
        System.out.println("It have a alarm which I don't like it.");
    }

    @Override
    public void off() {
        System.out.println("This phone can turn of TV.");
    }

    @Override
    public void price() {
        System.out.println("1199 $");
    }
}
