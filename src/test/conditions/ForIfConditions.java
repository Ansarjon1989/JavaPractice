package test.conditions;

public class ForIfConditions {

    public static void main(String[] args) {

        for (int i=0; i<=10; i++){

            if (i==2){
                System.out.println("I equal to 2");
            }else {
                System.out.println("This number is not equal to 10");
            }

            for (int j=0; j<5; j++){
                if (j==3){
                    System.out.println("This line equal to 3");
                }else {
                    System.out.println("It is not equal to 3 It is 5");
                }
            }
        }



    }
}
