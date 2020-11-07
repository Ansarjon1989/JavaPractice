package myPractice4.oop.encapsulation;

public class EmployeesResult {

    public static void main(String[] args) {


        Employees employees = new Employees();
        employees.setIdOfEmployee(1);
        employees.setNameOfEmployee("Farangiz");
        employees.setLastNameOfEmployee("Sadikova");
        employees.setAddressOfEmployee("Queens New York");

        System.out.println(employees.getIdOfEmployee());
        System.out.println(employees.getNameOfEmployee());
        System.out.println(employees.getLastNameOfEmployee());
        System.out.println(employees.getAddressOfEmployee());
    }
}
