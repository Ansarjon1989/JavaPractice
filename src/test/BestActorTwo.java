package test;

public class BestActorTwo {



        public static void main(String[] args) {

            printBestMovie();

            BestActorOne bestActorTwo = new BestActorOne();
            bestActorTwo.bestActor();


        }

        public static void printBestMovie(){

            System.out.println("Titanic");
        }

        public void bestActor(){
            System.out.println("Leonardo Dicaprio");
        }

        public void actorName(){
           bestActor();
        }

    }

