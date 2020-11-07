package myPractice4;

public class ConditionalForLoop {

    public static void main(String[] args) {


        for (int i=0; i<10; i++){
            if (i==5||i<=5){
                System.out.println("this number is my lucky number :"+i);
            }else {
                System.out.println("this number is not my lucky number :"+i);
            }
        }
    }
}
