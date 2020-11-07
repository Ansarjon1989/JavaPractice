package test.arrayPractice;

public class TvExecution {

    public static void main(String[] args) {

        Tv tv = Tv.getInstance();
        int year = tv.tvYear();
        System.out.println(year);
    }
}
