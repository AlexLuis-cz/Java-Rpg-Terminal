package Rpg.model;

public class Player extends Character {

    public Player(String name, int life, int damage) {
        this.name = name;
        this.life = life;
        this.damage = damage;
    }

    public boolean defending(int acao, int damageTaken) {
        if (acao == 0) {
            this.life -= damageTaken / 2;
            return true;
        } else {
            return false;
        }
    }

    public void takeDamage(int damageTaken) {
        this.life -= damageTaken;
    }


    public int getLife() {
        return life;
    }

    public int getDamage() {
        return this.damage;
    }

    public void Imp() {
        System.out.println("name:" + this.name);
        System.out.println("life:" + this.life);
        System.out.println("damage:" + this.damage);
    }
}
