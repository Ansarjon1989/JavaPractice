package myPractice4;

public class Conditions {

    public static void main(String[] args) {

        // soccer - sunday
        // class - monday
        // guitar - friday
        // chill at my home - other days


        // if(conditions)--ends{
        //      }


        String today = "thursday";

        if (today.equalsIgnoreCase("Sunday")){
            System.out.println("My off Day finally");

        }else if (today.equalsIgnoreCase("Wendesday")){
            System.out.println("i have an appointment....");

        }else if (today.equalsIgnoreCase("friday")){
            System.out.println("I am busy.");
        }else{
            System.out.println("I love this day.");
        }
// || -> or
        int a = 5;

        if (a == 5 || a > 6) {
            System.out.println(a);
        }

        // && -> and
        if (a == 5 && a > 4) {
            System.out.println("to day is the day " + a);
        }

        // != -> not equals

        if (a != 4) {
            System.out.println("a is not equals to 4. a is : " + a);
        }
        // == -> equals

        if (a == 5) {
            System.out.println("today a matched : " + a);
        }


    }
}




