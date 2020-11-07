package test.abstraction;

public class VehicleExecution extends Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Can start");

    }

    @Override
    public void stop() {
        System.out.println("Able to stop");
    }

    @Override
    public void goFaster() {
        System.out.println("goes faster");
    }

    @Override
    public void moveBack() {
        System.out.println("able move back");
    }

    @Override
    public void run() {
        System.out.println("able run");
    }
}
