package world;

public class Field {
    private Plant plant = new Plant();

    public Field() {
        // size is protected, and world.Field is in the same package
        System.out.println(plant.size);
    }
}
