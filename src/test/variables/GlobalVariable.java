package test.variables;

import myPractice1.variables.GlobalMethod;

public class GlobalVariable {

    static String name = "My name is Ansar";

    static String usaCities = "This is one of the USA city.";


    public static void main(String[] args) {


        GlobalVariable object = new GlobalVariable();
        object.minnesota();
        object.usaStates();



    }

    public static void newYork(){
        System.out.println("Manhattan");
        System.out.println(usaCities);
        System.out.println(name);
    }


    public void minnesota(){
        System.out.println("Saint  Paul");
        System.out.println(usaCities);
    }


    public void usaStates(){

        newYork();
        minnesota();
        System.out.println(usaCities);
    }

}
