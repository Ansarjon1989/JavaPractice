package singletonExemple;

public class Phone {

    private static Phone phone = null;

    private Phone(){

    }

    public static Phone getInstance(){
        if (phone == null){
            phone =  new Phone();
        }

        return phone;
    }


    public String getModelOfThePhone() {
        return "IPhone 12";
    }

}
