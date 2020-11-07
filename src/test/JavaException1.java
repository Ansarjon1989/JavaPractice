package test;

public class JavaException1 {

    public static void main(String[] args) {

        int a = 100;
        int b =0 ;


      try{  int c = 100/0;
          System.out.println("This line will not be Ex");
      }catch (ArithmeticException e) {
          System.out.println("exception occured, try to fix your index");
          System.out.println("End of Main");
      }
    }
}
