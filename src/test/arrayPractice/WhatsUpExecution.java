package test.arrayPractice;

public class WhatsUpExecution {

    public static void main(String[] args) {

        WhatsUp whatsUp = WhatsUp.getInstance();
        String carInfo = whatsUp.carInfo();
        System.out.println(carInfo);

    }
}
