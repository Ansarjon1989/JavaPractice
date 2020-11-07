package test;

public class BestActorOne {

    public static void main(String[] args) {

        printBestMovie();

        BestActorOne bestActorOne = new BestActorOne();
        bestActorOne.bestActor();

    }

    public static void printBestMovie(){

        System.out.println("GodFather");
    }

    public void bestActor(){
        System.out.println("Al Pacino");
    }
}
