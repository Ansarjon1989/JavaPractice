package test.variables;

public class WorldPhones {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        System.out.println(Iphone.name);
        System.out.println(Samsung.name);

        System.out.println(iphone.price);
        System.out.println(samsung.price);

        System.out.println(iphone.iME);
        System.out.println(samsung.iME);


    }

}
