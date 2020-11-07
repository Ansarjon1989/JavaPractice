package myPractice4.oop.encapsulation;

public class Peoplentech {

    public static void main(String[] args) {

        Student student = new Student();
        student.setIdOfStudent(1122);
        student.setNameOfStudent("Ansar");
        student.setGender("Male");
        student.setSsn("100000000");


        System.out.println(student.getIdOfStudent());
        System.out.println(student.getGender());
        System.out.println(student.getNameOfStudent());


    }
}
