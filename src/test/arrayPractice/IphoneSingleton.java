package test.arrayPractice;

public class IphoneSingleton {

    public String modelOfIphone(){
        return "Iphone 12";
    }

    private IphoneSingleton(){

    }

    private static IphoneSingleton iphoneSingleton = null;


    public static IphoneSingleton getInstance(){
        if (iphoneSingleton==null){
            iphoneSingleton = new IphoneSingleton();
        }
        return iphoneSingleton;
    }

}
