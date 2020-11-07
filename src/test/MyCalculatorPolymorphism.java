package test;

public class MyCalculatorPolymorphism {

    public static void main(String[] args) {

        int additionalData = calculator(12,56, 77);
        int multiplicationData = calculator(476, 999 );

        System.out.println(additionalData);
        System.out.println(multiplicationData);

    }

    public static int calculator(int a, int b, int c){
        int d = a+b+c;
        return d;
    }

    public static int calculator(int x, int y){
        int z = x*y;
        return z;
    }
}
