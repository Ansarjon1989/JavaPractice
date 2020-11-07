package myPractice1.methodPractice;

public class StaticNonStatic {

    public static void main(String[] args) {

        oneStatic();

        StaticNonStatic staticNonStatic= new StaticNonStatic();
        staticNonStatic.nonStatic();


    }

    public static void oneStatic(){

        String a = "This is Static Method";
        System.out.println(a);
    }

    public void nonStatic(){
        int a = 2020;
        System.out.println(a);
    }

}
