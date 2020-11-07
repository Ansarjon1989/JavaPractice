package practice5;

public class ArrayPractice {

    public static void main(String[] args) {

        String[]names = {"Adnan", "Rahman", "Rahat"};

        for (int i=0; i<3; i++){
            System.out.println(names[i]);
        }

        int [] numbers = {11, 22, 33, 44};
        //System.out.println(numbers[2]);

        for (int p=0; p<4; p++){
            System.out.println(numbers[p]);
        }

        Object [] everything = {"String", 12212, 'c', true, false};
        System.out.println(everything[4]);

    }
}
