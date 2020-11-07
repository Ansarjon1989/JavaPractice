package test;


import java.util.Collections;

public class ArrayList {


    public static void main(String[] args) {


        java.util.ArrayList <Integer> num = new java.util.ArrayList<Integer>();

        num.add(11);
        num.add(100);
        num.add(4);
        num.add(199);
        num.add(0);
        Collections.sort(num);

        for (Integer i : num){
            System.out.println(i);
        }

        }
        }


