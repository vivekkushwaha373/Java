package lld_design_patterns.creational.builder;

/**
 * BAD EXAMPLE: The "Telescoping Constructor" anti-pattern.
 * 
 * As you add more optional parameters (like pool, garage, garden), 
 * the number of constructors explodes. It becomes very hard to read
 * client code: new BadHouse(4, 2, true, false, false, true);
 * What do those booleans even mean?!
 */
public class BadHouse {

    private int walls;
    private int doors;
    private boolean hasGarage;
    private boolean hasPool;

    // Required only
    public BadHouse(int walls, int doors) {
        this.walls = walls;
        this.doors = doors;
    }

    // Required + Garage
    public BadHouse(int walls, int doors, boolean hasGarage) {
        this(walls, doors);
        this.hasGarage = hasGarage;
    }

    // Required + Garage + Pool
    public BadHouse(int walls, int doors, boolean hasGarage, boolean hasPool) {
        this(walls, doors, hasGarage);
        this.hasPool = hasPool;
    }
}
