package test.arrayPractice;

public class Tv {


    public int tvYear(){
        return 2020;
    }

    private static Tv tv = null;


    private Tv(){

    }

    public static Tv getInstance(){
        if (tv==null){
            tv=new Tv();
        }
        return tv;
    }

}
