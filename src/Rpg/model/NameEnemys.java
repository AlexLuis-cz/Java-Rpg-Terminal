package Rpg.model;

public enum NameEnemys {
    ARTEMIS("Artemis", 1),
    ALEXIOS("Alexios", 2),
    EIVOR("Eivor", 3);

    private final String name;
    private final int powerLevel;

    NameEnemys(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return this.name;
    }

    public int getPowerLevel() {
        return this.powerLevel;
    }
}
