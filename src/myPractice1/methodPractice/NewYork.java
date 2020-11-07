package myPractice1.methodPractice;

public class NewYork {

    public static void main(String[] args) {

        park();

        NewYork newYork = new NewYork();
        newYork.city();

    }

    public static void park(){
        System.out.println("Central Park");
    }

    public void city(){
        System.out.println("New York City");
    }
}
