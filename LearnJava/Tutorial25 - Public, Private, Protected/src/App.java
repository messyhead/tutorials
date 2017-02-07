import world.Plant;

/*
    * private --- only within same class
    * public --- from anywhere
    * protected --- same class, subclass, and same package
    * no modifier --- same package only
 */

public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);

        System.out.println(Plant.ID);

//        Won't work, type is private - can't be accessed from another class
//        System.out.println(plant.type);

//        size is protected; App is not int he same package as Plant
//        Won't work
//        System.out.println(plant.size);

//        Won't work; App and Plant in different packages, height has package-level availability
//        System.out.println(plant.height);
    }
}
