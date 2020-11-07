package myPractice4.oop.encapsulation;

public class Employees {

    private String nameOfEmployee;
    private String lastNameOfEmployee;
    private int idOfEmployee;
    private String addressOfEmployee;


    public void setNameOfEmployee(String nameOfEmployee){
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getNameOfEmployee(){
        return nameOfEmployee;
    }

    public void setLastNameOfEmployee(String lastNameOfEmployee){
        this.lastNameOfEmployee = lastNameOfEmployee;
    }

    public String getLastNameOfEmployee(){
        return lastNameOfEmployee;
    }

    public void setIdOfEmployee(int idOfEmployee){
        this.idOfEmployee = idOfEmployee;
    }

    public int getIdOfEmployee(){
        return idOfEmployee;
    }

    public void setAddressOfEmployee(String addressOfEmployee){
        this.addressOfEmployee = addressOfEmployee;
    }

    public String getAddressOfEmployee(){
        return addressOfEmployee;
    }
}
