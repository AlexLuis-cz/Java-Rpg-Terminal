package Rpg.model;

import Rpg.Object.Weapon;

public class Player extends Character {
    private Weapon weapon;
    private double money;
    private boolean defend;

    public Player(String name, int life, int damage) {
        this.name = name;
        this.life = life;
        this.damage = damage;
    }

    public void takeDamage(int damageTaken) {
        if (defend) {
            this.life -= damageTaken / 2;
        } else {
            this.life -= damageTaken;
        }
    }

    public void vulnerable() {
        this.defend = false;
    }

    //getters e setters
    public boolean getDefend() {
        return this.defend;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money += money;
    }

    public void setDefend(boolean defending) {
        this.defend = defending;
    }

    @Override
    public String toString() {
        return "------------------" +
                "\nName:" + this.name +
                "\nLife:" + this.life +
                "\nDamage:" + this.damage;
    }
}
