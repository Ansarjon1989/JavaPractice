package myPractice4.oop.inheritance;

public class C extends B {

    public static void main(String[] args) {

        C c = new C();
        c.methodFormA();
        c.methodFormB();
        c.methodFromC();

        A a = new A();
        a.methodFormA();


    }

    public void methodFromC(){
        System.out.println("Method details from C");
    }
}
