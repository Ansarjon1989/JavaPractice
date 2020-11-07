package test;

public class Conditions {

    public static void main(String[] args) {

        String today = "wendesday";

        if(today.equalsIgnoreCase("Monday")){
            System.out.println("I will go to work.");
        }else if(today.equalsIgnoreCase("Wendesday")){
            System.out.println("I need to go to PNT.");
        }else if(today.equalsIgnoreCase("Sunday")){
            System.out.println("May be one day I can sleep until 11.");
        }else {
            System.out.println("I must work.");
        }

        int year = 2020;

        if (year==202){
            System.out.println("horrible year for all us; ");
        }else{
            System.out.println("Halooooooha");
        }

       boolean isTodayHot = true;
        if(isTodayHot){
            System.out.println(" Lets go to park.");
        }else{
            System.out.println("Stay home");
        }

        int a=5;
        if(a==5 && a>6){
            System.out.println("today is "+a);
        }

        if(a!=4){
            System.out.println("I cant practice  i want sleep"+a);
        }

        if (a==5){
            System.out.println("Tired :" +a);
        }


    }
}


