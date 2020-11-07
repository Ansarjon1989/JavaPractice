package test.abstraction;

public abstract class CarGo {

    public static void main(String[] args) {

        VehicleExecution object = new VehicleExecution();
        object.start();
        object.goFaster();
        object.moveBack();
        object.run();
        object.stop();
    }


}
