package lld_design_patterns.creational.builder;

/**
 * GOOD EXAMPLE: The Product class.
 * Notice that it is completely IMMUTABLE (no setters) and has a private constructor.
 */
public class House {

    private final int walls;
    private final int doors;
    private final boolean hasGarage;
    private final boolean hasPool;

    // Package-private or private constructor so only the Builder can call it
    House(HouseBuilder builder) {
        this.walls = builder.getWalls();
        this.doors = builder.getDoors();
        this.hasGarage = builder.isHasGarage();
        this.hasPool = builder.isHasPool();
    }

    @Override
    public String toString() {
        return "House with " + walls + " walls, " + doors + " doors, " +
                (hasGarage ? "a garage, " : "no garage, ") +
                (hasPool ? "a pool." : "no pool.");
    }
}
