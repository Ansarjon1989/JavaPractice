package test.arrayPractice;

public class WhatsUp {


    public String carInfo(){
        return 2020 +": "+ "Jeep 39000 $.";
    }

    private static WhatsUp whatsUp = null;

    private WhatsUp(){

    }

   public static WhatsUp getInstance(){
        if (whatsUp == null){
            whatsUp = new WhatsUp();
        }
        return whatsUp;
   }

}
