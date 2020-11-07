package test.inheritance;

public class C extends B{

    public static void main(String[] args) {

        C c = new C();
        c.methodFromA();
        c.methodFromB();
        c.methodFromC();

        A a = new A();
        a.methodFromA();





    }

    public void methodFromC(){
        System.out.println("Method from C");
    }


}
