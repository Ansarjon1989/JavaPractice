package test;

public class BestActorWinner {

    public static void main(String[] args) {

        BestActorOne bestActorOne = new BestActorOne();
        BestActorTwo bestActorTwo = new BestActorTwo();

        bestActorOne.bestActor();
        bestActorTwo.bestActor();

        BestActorOne.printBestMovie();
        BestActorTwo.printBestMovie();

        bestActorTwo.actorName();

    }
}
