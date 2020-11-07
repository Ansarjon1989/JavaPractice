package myPractice1.variables;

public class GlobalMethod {

    public static String location = "New York City train:";

    public static double price = 2.50;

    public static void main(String[] args) {

        queens();

        GlobalMethod globalMethod = new GlobalMethod();
        globalMethod.numericTrains();




    }

    public static void queens(){
        String train1 = " E, F, M, R Trains";
        System.out.println(train1);
        System.out.println(location);
        System.out.println(price);
    }

    public void numericTrains(){
        int a = 6;
        System.out.println(a);
        System.out.println(location);
        System.out.println(location);

    }



}
