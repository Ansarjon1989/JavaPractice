package test.encapsulation;

public class Encapsulation {


    private int idOfEmployee;
    private String firstNAme;
    private String lastName;
    private String salary;



 public void setIdOfEmployee(int idOfEmployee){
     this.idOfEmployee = idOfEmployee;
 }

 public int getIdOfEmployee(){
     return idOfEmployee;
 }

 public void setFirstNAme(String firstNAme){
     this.firstNAme = firstNAme;
 }

 public String getFirstNAme(){
     return firstNAme;
 }

 public void setLastName(String lastName){
     this.lastName = lastName;
 }

 public String getLastName(){
     return lastName;
 }

 public void setSalary(String salary){
     this.salary = salary;
 }

 public String getSalary(){
     return salary;
 }


}
