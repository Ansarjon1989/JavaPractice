package practice5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScannerArray2 {
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.println("enter a names to store in an array");
            names.add(scan.nextLine());
        }
        System.out.println("" + names);
        Collections.sort(names);
        System.out.println("order arraylist" + names);
    }
}