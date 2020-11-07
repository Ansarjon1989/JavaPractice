package test.arrayPractice;

public class MyArrayPractice2 {
    public static void main(String[] args) {

        String[] countries = {"USA", "India", "Canada", "Russia", "China"};

        System.out.println(countries.length);

        for (int i=0; i<countries.length; i++)
            System.out.println(countries[i]);

        try {
            System.out.println(countries[100]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured, please fixed your index");
        }

        int[] numbers = new int[5];
        numbers[0]=10;
        numbers[1]=100;
        numbers[2]=1000;
        numbers[3]=10000;



      try {
          System.out.println(numbers[8]);
      }catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Exception occured, please fixed your index");
      }


      String[] city = new String[10];
      city[0] = "Ney York";
      city[1] = "Moscow";
      city[2] = "New Jersey";
      city[3] = "New Mexico";
      city[4] = "Minneapolis";


        System.out.println(city.length);
        System.out.println(city[8]);


        Object[] all = {"Hello", 213123123, 'f', true, false};
        System.out.println(all[3]);
        }
    }

