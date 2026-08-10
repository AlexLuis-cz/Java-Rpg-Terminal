package Rpg.model;

public class Enemy extends Character {
    private boolean defend;


    public Enemy(NameEnemys nameEnemys, int life, int damage) {
        super.nameEnemys = nameEnemys;
        this.life = life;
        this.damage = damage;
    }


    public void vulnerable() {
        this.defend = false;
    }

    public void takeDamage(int damageTaken) {
        if (defend) {
            this.life -= damageTaken / 2;
        } else {
            this.life -= damageTaken;
        }
    }

    //getters e setters
    public boolean getDefend() {
        return this.defend;
    }

    public void setDefend(boolean defend) {
        this.defend = defend;
    }

    @Override
    public String toString() {
        return "------------------" +
                "\nName:" + this.nameEnemys.getName() +
                "\nLife:" + this.life +
                "\nDamage:" + this.damage +
                "\nPowerLevel:" + this.nameEnemys.getPowerLevel();
    }
}
