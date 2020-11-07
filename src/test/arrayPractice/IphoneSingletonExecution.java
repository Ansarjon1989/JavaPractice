package test.arrayPractice;

public class IphoneSingletonExecution {

    public static void main(String[] args) {

        IphoneSingleton iphoneSingleton = IphoneSingleton.getInstance();
        String name = iphoneSingleton.modelOfIphone();

        System.out.println(name);

    }
}
