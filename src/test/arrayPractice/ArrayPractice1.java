package test.arrayPractice;

public class ArrayPractice1 {

    public static void main(String[] args) {

        String [] names = {"Jimi", "Smith", "George"};


        try {
            System.out.println(names[4]);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(names[2]);


        int [] numbers = {12,22, 44, 43432, 244};

        System.out.println(numbers[3]);

        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

        Object [] everything = {"String", 23123, true, 'w', false};
        System.out.println(everything[2]);

        Object number = everything[1];
        System.out.println(number);


    }


}
