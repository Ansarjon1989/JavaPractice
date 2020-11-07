package practice5;

public class ArrayPractice2 {

    public static void main(String[] args) {

        String[] names = { "Adnan", "Rahman", "Ibn Sino", "Rahat", "Abu", "david", "Tigist", "Zahra", "Iyes"};

        for (int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        // try this
        // if any exception occurs
        // catch them
        // perform some action
        // parent class of all exception : Throwable

        try{
            System.out.println(names[11]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured, try fixed your index");
        }
        System.out.println(names.length);



        String [] cars = new String[5];
        cars[0]= "BMW";
        cars[1]= "Audi";
        cars[2]= "Jepp";

        System.out.println(cars.length);
        System.out.println(cars[2]);
        System.out.println(cars[1]);

    }
}
