package myPractice3;

public class Povtor {


    int id;
    String name;
    String profession;



    public Povtor(int idOfEmployee, String nameOfEmployee){
        this.id = idOfEmployee;
        this.name = nameOfEmployee;
    }

    public Povtor(String professionOfEmployee){
        this.profession = professionOfEmployee;
    }

    public Povtor(int idOfEmployee, String nameOfEmployee, String professionOfEmployee){
        this.id = idOfEmployee;
        this.name = nameOfEmployee;
        this.profession = professionOfEmployee;
    }

    public void printEmployeeInfo(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(profession);
    }



    public static void main(String[] args) {

        Povtor povtor = new Povtor(100, "Ahmed", "Qa engineer");
        povtor.printEmployeeInfo();


//        Povtor povtor1 = new Povtor(122,);
//        povtor1.printEmployeeInfo();


    }




}
