package test;

public class RepeatArray {


    // there are 3 type Array
    // 1-->  String [] cars = {"BMW", "Jeep", "Aston Martin", "Tesla", "Mini"};
    // 2-->  int [] numbers = {12, 22, 44, 54, 98 };
    // 3-->  Object [] everything = {"String", 1234, true, 'f' };
    // 3<--> System.out.println(everything[1]);
    public static void main(String[] args) {

    String [] cars = {"BMW", "Jeep", "Aston Martin", "Tesla", "Mini"};

    for (int i=0; i<6; i++){
        System.out.println(cars[i]);
        System.out.println();
        for (int a=0; a<2; a++){
            System.out.println(cars[a]);
        }

        int [] numbers = {12, 22, 44, 54, 98 };

        for (int o=0; o<5;o++){
            System.out.println(numbers[2]);
        }

        Object [] everything = {"String", 1234, true, 'f' };
        System.out.println(everything[1]);

        Object zipCode = everything[1];
        System.out.println(zipCode);

    }

    }


}
