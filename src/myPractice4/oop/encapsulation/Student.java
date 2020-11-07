package myPractice4.oop.encapsulation;

public class Student {

    // oop -
    // Encapsulation : data hiding
    // Abstraction

    private  String nameOfStudent;
    private  int idOfStudent;
    private  String location;
    private String gender;
    private  String ssn;

    public void  setNameOfStudent(String nameOfStudent){
        this.nameOfStudent = nameOfStudent;
    }

    public String getNameOfStudent(){
        return nameOfStudent;
    }



    public void setIdOfStudent(int idOfStudent){
        this.idOfStudent = idOfStudent;
    }

    public int getIdOfStudent(){
        return idOfStudent;
    }



    public void setLocation(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }



    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }



    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public String getSsn(){
        return ssn;
    }


}

