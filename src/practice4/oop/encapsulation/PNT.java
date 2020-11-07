package practice4.oop.encapsulation;

public class PNT {

    public static void main(String[] args) {

        Student student = new Student();
        student.setNameOfStudent("AAAA");
        student.setIdOfStudent(1111);
        student.setLocation("New York");
        student.setGender("Gender");

        System.out.println(student.getNameOfStudent());
        System.out.println(student.getIdOfStudent());
        System.out.println(student.getLocation());
        System.out.println(student.getGender());


        Student student1 = new Student();
        student1.setNameOfStudent("BBBB");
        student1.setIdOfStudent(2222);
        student1.setLocation("New Jersey");
        student1.setGender("Gender");

        System.out.println(student1.getNameOfStudent());
        System.out.println(student1.getIdOfStudent());
        System.out.println(student1.getLocation());
        System.out.println(student1.getGender());


        Student student2 = new Student();
        student1.setNameOfStudent("CCC");
        student1.setIdOfStudent(3333);
        student1.setLocation("Connecticut");
        student1.setGender("Gender");

        System.out.println(student1.getNameOfStudent());
        System.out.println(student1.getIdOfStudent());
        System.out.println(student1.getLocation());
        System.out.println(student1.getGender());



    }
}
