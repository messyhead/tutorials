
class Plant {
//    Always make instance variables (i.e. variables used inside the class) private, and use getter/setter to access them
//    If a variable needs to be public, make it final i.e. a constant
    public static final int ID = 7;

    private String name;

    public String getData() {

        return "Growth is " + calculateGrowth();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int calculateGrowth() {
        return 9;
    }
}

public class App {
    public static void main(String[] args) {

    }
}
