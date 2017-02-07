package world;

public class Plant {
    // Bad practice making instance variables public
    public String name;

    // Acceptable practice - public variable is final - they can't be modified
    public final static int ID = 8;

    // Can only be accessed from in this class - private
    private String type;


    protected String size;

    int height;

    public Plant() {
        this.name = "Freddy";
        this.type = "world.Plant";
        this.size = "medium";
        this.height = 8;
    }
}
