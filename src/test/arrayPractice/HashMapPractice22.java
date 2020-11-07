package test.arrayPractice;

import java.util.HashMap;

public class HashMapPractice22 {

    public static void main(String[] args) {

        HashMap<String, Integer> nameAndIdOfStudentsFromQueens = new HashMap<>();

        nameAndIdOfStudentsFromQueens.put("Jon", 111);
        nameAndIdOfStudentsFromQueens.put("Ali", 112);
        nameAndIdOfStudentsFromQueens.put("Hulk", 113);
        nameAndIdOfStudentsFromQueens.put("Michael",114 );

        System.out.println(nameAndIdOfStudentsFromQueens);

        System.out.println();

        HashMap<String, Integer> nameAndIdOfStudentsFromBrooklyn = new HashMap<>();

        nameAndIdOfStudentsFromBrooklyn.put("Jimi", 201);
        nameAndIdOfStudentsFromBrooklyn.put("Bobik", 202);
        nameAndIdOfStudentsFromBrooklyn.put("Batman", 203);

        System.out.println(nameAndIdOfStudentsFromBrooklyn.containsKey("Jimi"));
        System.out.println(nameAndIdOfStudentsFromBrooklyn.containsValue(202));

        System.out.println(nameAndIdOfStudentsFromBrooklyn);


        HashMap<String, HashMap<String, Integer>> students = new HashMap<>();
        students.put("Queens :", nameAndIdOfStudentsFromQueens);
        students.put("Brooklyn :", nameAndIdOfStudentsFromBrooklyn);
        System.out.println(students);


    }
}
