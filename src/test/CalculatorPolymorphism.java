package test;

public class CalculatorPolymorphism {

    public static void main(String[] args) {

        int additionData = calculator(5, 4, 100);
        int multiplicationData = calculator(5, 5);

        System.out.println(additionData);
        System.out.println(multiplicationData);


    }

    public static int calculator(int a, int b, int c ){
       int d = a+b+c;
       return d;
    }

    public static int  calculator(int a, int b){
        int d = a*b;
        return d;
    }
}
