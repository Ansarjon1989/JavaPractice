package test.encapsulation;

public class employee {

    public static void main(String[] args) {

        Encapsulation object = new Encapsulation();
        object.setIdOfEmployee(11);
        object.setFirstNAme("Ansar");
        object.setLastName("Rakhmankulov");
        object.setSalary("150.000 Yeaaaa");



        System.out.println(object.getIdOfEmployee());
        System.out.println(object.getFirstNAme());
        System.out.println(object.getLastName());
        System.out.println(object.getSalary());

    }
}
