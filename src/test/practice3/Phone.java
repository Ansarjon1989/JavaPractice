package test.practice3;

public class Phone {

  String model;
  String price;

  public Phone(){

  }

  public Phone(String name){
      this.model=name;
  }

  public Phone(String name, String priceOfPhone){
      this.model=name;
      this.price=priceOfPhone;
  }

    public static void main(String[] args) {


        Phone phone = new Phone("Samsung", "123213");
        phone.printPhone();

    }

    public void printPhone(){
        System.out.println(model);
        System.out.println(price);
    }


}
