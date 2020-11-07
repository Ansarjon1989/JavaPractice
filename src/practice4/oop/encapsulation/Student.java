package practice4.oop.encapsulation;

public class Student {

    //OOP-
    //Encapsulation : data hiding
    //Abstraction

    private String nameOfStudent;
    private int idOfStudent;
    private String location;
    private String gender;


//setter
    public void setNameOfStudent(String nameOfStudent){
        this.nameOfStudent= nameOfStudent;
    }
    //getter
    public String getNameOfStudent(){
        return nameOfStudent;
    }
    //setter
    public void setIdOfStudent(int idOfStudent){
        this.idOfStudent = idOfStudent;
    }
    //getter
    public int getIdOfStudent(){
        return idOfStudent;
    }
    //setter
    public void setLocation(String location){
        this.location = location;
    }
    //getter
    public String getLocation(){
        return location;
    }

    //setter
    public void setGender(String gender){
        this.gender = gender;
    }
    //getter
    public String getGender(){
        return gender;
    }
}
