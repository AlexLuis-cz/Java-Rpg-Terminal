package Rpg.model;

public class Enemy extends Character {

    public Enemy(String name, int life, int damage) {
        this.name = name;
        this.life = life;
        this.damage = damage;
    }

    public boolean defending(int action, int damageTaken) {
        if (action == 1) {
            this.life -= damageTaken / 2;
            return true;
        } else {
            return false;
        }
    }

    public int getLife() {
        return this.life;
    }

    public int getDamage() {
        return this.life;
    }

    public void takeDamage(int damageTaken) {
        this.life -= damageTaken;
    }

    public void Imp() {
        System.out.println("-------------");
        System.out.println(this.name);
        System.out.println(this.life);
        System.out.println(this.damage);
    }
}
