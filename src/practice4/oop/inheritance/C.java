package practice4.oop.inheritance;

public class C extends B {


    public static void main(String[] args) {

        C c = new C();
        c.methodFromC();
        c.methodFromB();
        c.methodFromA();

    }

    public void methodFromC(){
        System.out.println("Method details from C");
    }
}
