package myIncapsulation;

public class AirportExecution {

    public static void main(String[] args) {

        AerportInfo aerportInfo = new AerportInfo();

        aerportInfo.setName("Jon F Kennedy");
        aerportInfo.setAddress("Jamaica, Queens NY." );
        aerportInfo.setQntTerminals("There are 8 terminals.");

        System.out.println(aerportInfo.getName());
        System.out.println(aerportInfo.getAddress());
        System.out.println(aerportInfo.getQntTerminals());


    }
}
