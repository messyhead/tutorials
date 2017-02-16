
public class App {
    public static void main(String[] args) {
        Camera cam1 = new Camera();

        cam1.setId(5);

        Car car1 = new Car();

        car1.setId(4);

//        Machine cannot be instantiated as it's abstract
//        Machine machine1 = new Machine();

        car1.run();
        car1.turnOnRadio();

    }
}
