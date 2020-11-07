package myNewAbstract;

public class TwoChaseBanks extends QueensChaseBank22 implements ChaseBank, ChaseBank2 {


    @Override
    public void onlineService() {
        System.out.println("This service more comfortable them coming to Bank");
    }

    @Override
    public void creditCard() {
        System.out.println("You have a 10000 $ limit on your credit card  accaunt.");
    }

    @Override
    public void debitCart() {
        System.out.println("At Chase to open new debit card a 100 $ is enought.");
    }

    @Override
    public void checking() {
        System.out.println("Checking accaunt ..........");
    }

    @Override
    public void saving() {
        System.out.println("Saving interest is hight.");
    }

    @Override
    public void investment() {
        System.out.println("Make little investment every month.");
    }

    @Override
    public void mortgage() {
        System.out.println("2020 good opportunity to take mortgage because rates are very low than before. ");
    }

    @Override
    public void location() {
        System.out.println("Queens New York");
    }
}
