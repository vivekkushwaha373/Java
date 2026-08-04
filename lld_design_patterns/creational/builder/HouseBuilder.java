package lld_design_patterns.creational.builder;

/**
 * GOOD EXAMPLE: The Builder class.
 * Provides a fluent interface for constructing a House step by step.
 */
public class HouseBuilder {

    // Same fields as the product, but mutable
    private int walls;
    private int doors;
    private boolean hasGarage;
    private boolean hasPool;

    // Builder methods return 'this' for fluent chaining:
    // new HouseBuilder().setWalls(4).setDoors(2).build();
    public HouseBuilder setWalls(int walls) {
        this.walls = walls;
        return this;
    }

    public HouseBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public HouseBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    // The final build method that returns the constructed product
    public House build() {
        return new House(this);
    }

    // Getters for the House constructor to read
    public int getWalls() { return walls; }
    public int getDoors() { return doors; }
    public boolean isHasGarage() { return hasGarage; }
    public boolean isHasPool() { return hasPool; }
}
