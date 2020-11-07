package practice5;

import java.util.ArrayList;
import java.util.Random;

public class ScannerArray {

    public static void main(String[] args) {
        // from the user, take 5 food they likes
        // give them a random food to eat

        String[] food = new String[5];

        ArrayList<String> foods = new ArrayList<>();
        foods.add("Sheshkebab");
        foods.add("Double Whopper");
        foods.add("Turkey Sandwich");
        foods.add("Borsh");
        foods.add("McDonald");


        Random random = new Random();

        int f = random.nextInt(5);
        System.out.println(foods.get(f));

    }
}
