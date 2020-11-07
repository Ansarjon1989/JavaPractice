package test.practice3;

public class Calculator {


    // create 2 calculators
    // - one of them  will do addition of given 3 int
    // - another will do multiplication of given 2 int

    public static void main(String[] args) {

        addition(2,3,90);
        multiplication(100,22);
    }

    public static void addition(int a, int b, int c){
        System.out.println(a+b+c);

    }

    public static void multiplication(int a, int b){
        System.out.println(a*b);
    }

}
