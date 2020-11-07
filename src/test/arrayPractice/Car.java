package test.arrayPractice;

public class Car {


  public String getMyCarModel(){
      return "Toyota Chevrolet Honda";
  }

    //Singleton --> single instance of a class

    //1. private static object of the class (half way)
    private static Car car = null;



    //2. private constructor
    private Car(){
    }


    //3. public static method which has return type of the class (object) --> singleton method
    public static Car getInstance(){
        if (car ==null){
            car = new Car();
        }
        return car;
    }



}
