package myPractice1.methodPractice;

public class NewJersey {

    public static void main(String[] args) {

        park();

        NewJersey newJersey = new NewJersey();
        newJersey.city();

    }

    public static void park(){
        System.out.println("New Jersey State Park");
    }

    public void city(){
        System.out.println("Jersey city");
    }
}
