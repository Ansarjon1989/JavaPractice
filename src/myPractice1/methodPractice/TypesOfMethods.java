package myPractice1.methodPractice;

public class TypesOfMethods {

    public static void main(String[] args) {

        printMyName();
        System.out.println(getMyLastName());

        TypesOfMethods typesOfMethods = new TypesOfMethods();
        typesOfMethods.printMyAge();

        System.out.println(typesOfMethods.getMyBirthYear());

        boolean answer = november();
        System.out.println(answer);



    }

    public static void  printMyName(){
        System.out.println("Ansar");
    }

    public static String getMyLastName(){
        return "Rakhmankulov";
    }


    public void printMyAge(){
        System.out.println(25);
    }

    public  int getMyBirthYear(){
        return 1989;
    }



    public static boolean november(){
        return true;
    }



}
