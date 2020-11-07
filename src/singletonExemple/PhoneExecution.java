package singletonExemple;

public class PhoneExecution {


    public static void main(String[] args) {


       Phone phone = Phone.getInstance();
       String model = phone.getModelOfThePhone();


        System.out.println(model);

    }
}
