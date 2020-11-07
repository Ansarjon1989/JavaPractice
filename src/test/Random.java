package test;



public class Random {

    public static void main(String[] args) {




        int [] numbers = new int[2];
        numbers[0] = 123456;

        int [] num1 = new int[2];
        num1[0] =123;

        java.util.Random random = new java.util.Random();
        int x = random.nextInt(10);
        int y = random.nextInt(5);
        int z = random.nextInt(3);


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
