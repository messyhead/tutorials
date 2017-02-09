
public class App {
    public static void main(String[] args) {
        Plant plant = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;

        plant2.grow();

        tree.shedLeaves();

//        This won't work as although plant2 is pointing to the tree object, it is a type of Plant,
//        so can't access the methods in the tree object
//        plant2.shedLeaves();

        doGrow(tree);
    }

    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
