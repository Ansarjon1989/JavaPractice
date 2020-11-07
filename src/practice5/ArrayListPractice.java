package practice5;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<String> listOfCity = new ArrayList<>();

        listOfCity.add("Queens");
        listOfCity.add("Brooklyn");
        listOfCity.add("Bronx");

        listOfCity.add("Manhattan");

        System.out.println(listOfCity);

        listOfCity.remove(3);
//        listOfCity.remove("Brooklyn");



        //1st

        System.out.println(listOfCity);
        System.out.println(listOfCity.size());

        System.out.println(listOfCity.get(0));

        System.out.println();


        //2nd
        for (int i=0; i< listOfCity.size(); i++){
            System.out.println(listOfCity.get(i));
        }
        listOfCity.add("VA");
        listOfCity.add("New Jersey");

        //3rd
        Iterator iterator = listOfCity.iterator();

        //while iterator has a next value i want to print that value
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        ArrayList<Integer>zipCode = new ArrayList<>();

        zipCode.add(11223);
        zipCode.add(22334);
        zipCode.add(3345445);

        System.out.println(zipCode.size());
        System.out.println(zipCode);
        zipCode.clear();
        System.out.println(zipCode);

        ArrayList <Object> everything = new ArrayList<>();

        everything.add("Object");
        everything.add(11433);
        everything.add(true);
        everything.add(false);
        everything.add('A');

        System.out.println(everything);

        ArrayList everything2 = new ArrayList();
        everything2.add("Alfa Rameo");
        everything2.add(50000);
        everything2.add("$");

        System.out.println(everything2);


    }
}
