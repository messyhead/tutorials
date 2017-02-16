
public class Car extends Machine {
    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void doStuff() {
        System.out.println("Going for a drive");
    }

    @Override
    public void shutDown() {
        System.out.println("Ignition off");
    }

    public void turnOnRadio() {
        System.out.println("Radio on");
    }
}
