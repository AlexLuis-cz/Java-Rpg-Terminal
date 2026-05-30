package Rpg.model;

public class Character {
    protected String name;
    protected int life;
    protected int damage;

    public int getLife() {
        return this.life;
    }

    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return this.name;
    }
}
