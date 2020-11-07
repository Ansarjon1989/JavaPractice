package test.myAbstractPractice;

public class Basket extends Soda implements Costco, Costco2 {
    @Override
    public void address() {
        System.out.println("6135 JUNCTION BLVD, REGO PARK, NY");
    }

    @Override
    public void zipCode() {
        System.out.println("11374");
    }

    @Override
    public void phoneNumber() {
        System.out.println("(718) 760-2180");
    }

    @Override
    public void webSite() {
        System.out.println("https://www.costco.com/");
    }

    @Override
    public void electronics() {
        System.out.println("Tv,  Computers, Apple electronics");
    }

    @Override
    public void lemon() {
        System.out.println("Yellow");
    }

    @Override
    public void vegetable() {
        System.out.println("Tomato, Cucumber.");
    }

    @Override
    public void tires() {
        System.out.println("Bridgestone, Micheline");
    }
}
