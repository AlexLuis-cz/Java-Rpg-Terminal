package Rpg.model;

public class Character {

    protected int life;
    protected int damage;

    public int getLife() {
        return this.life;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }
}
