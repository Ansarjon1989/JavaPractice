package myPractice4.oop.Abstraction;

public abstract class Car {

    // abstract class has constructor, still can't create obj
    // methods that are abstract we need to specify as abstract
    // we can extend abstract class to abstract class, but only 1


    public Car(){

    }

        public void brake(){
            System.out.println("car has to stop via this");
        }

        // abstract method --> concept
    public abstract void wheele();


}
