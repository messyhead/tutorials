
public class Machine {

//    private variables cannot be accessed by child classes
//    private String name = "Machine Type 1";
      protected String name = "Machine Type 1";

    public void start() {
        System.out.println("Machine started.");
    }

    public void stop() {
        System.out.println("Machine stopped.");
    }
}
