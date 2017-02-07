package world;

public class Oak extends Plant {

    public Oak() {

//        Won't work, type is private - can't be accessed from another class
//        type = "tree";

//        size is protected, and can be accessed as world.Oak is a sublclass of world.Plant
        this.size = "large";

//        No access specifier works because Oak and Plant in same package
        this.height = 20;

    }
}
