package test;

public class MyTypeOfMethods {

    public static void main(String[] args) {
        printName();

        MyTypeOfMethods object = new MyTypeOfMethods();
        object.printAge();

        String lastName = object.getLastName();
        String lastN = lastName +" My father's last name also.";
        System.out.println(lastN);

        int myAge = object.getBornYear();
        int newAge2020= myAge + 31;
        System.out.println(newAge2020 + " i will turn 31 ");

        System.out.println(object.getBornYear());
        System.out.println(object.getLastName());

        Boolean answer = older();
            System.out.println(answer);


    }

    public static void printName(){
        System.out.println("Ansar");

    }

    public String getLastName(){
        return "Rakhmankulov";
    }

    public void printAge(){
        System.out.println(30);

    }

    public int getBornYear(){
        return 1989;
    }

    public static boolean older(){
        return true;
    }

}
