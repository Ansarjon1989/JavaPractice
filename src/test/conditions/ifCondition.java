package test.conditions;

public class ifCondition {


    public static void main(String[] args) {
        String today = "Saturday";


        if (today.equalsIgnoreCase("Sunday")){
            System.out.println("Today is Sunday");
        }else if (today.equalsIgnoreCase("Monday")){
            System.out.println("First day of the week");
        }else if(today.equalsIgnoreCase("Friday")){
            System.out.println("Happy Friday");
        }else{
            System.out.println("Today not Sunday, not Monday, not Friday");
        }



        int year = 2020;

        if (year==2019){
            System.out.println("Was good year");
        }else{
            System.out.println("Covid 19");
        }

        boolean isTodaySunny = false; //false yoki true bolishi kerak

        if (isTodaySunny){
            System.out.println("Yes it is");
        }else {
            System.out.println("Not sunny.");
        }

        System.out.println();

        int a = 5;

        if (a==5 || a<6){
            System.out.println(a);
        }

        System.out.println();

        int b = 10;

        if (b==10 && b>9){
            System.out.println("today is a day " +b);
        }

        System.out.println();

        int c = 5;

        if (c!=10){
            System.out.println("c is not equal to. c is "+c);
        }

        System.out.println();





    }
}
