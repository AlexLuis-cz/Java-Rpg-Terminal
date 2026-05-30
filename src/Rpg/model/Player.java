package Rpg.model;

public class Player extends Character {

    public Player(String name, int life, int damage) {
        this.name = name;
        this.life = life;
        this.damage = damage;
    }

    public boolean defending(int action, int damageTaken) {
        if (action == 0) {
            this.life -= damageTaken / 2;
            return true;
        } else {
            return false;
        }
    }

    public void takeDamage(int damageTaken) {
        this.life -= damageTaken;
    }

}
