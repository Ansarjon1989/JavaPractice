package test;

public class WomensDepartment extends MensDepartment {


    public static void main(String[] args) {

        WomensDepartment object = new WomensDepartment();
        object.womenDepartment();
        object.mensDepartment();

        Century21 century21 = new Century21();
        century21.allDepartments();
    }

    public void womenDepartment(){
        System.out.println("department of clothes and footwear for women");
    }
}
