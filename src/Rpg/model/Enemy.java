package Rpg.model;

public class Enemy extends Character {
    private boolean defend;
    private final NameEnemys NAME_ENEMYS;

    public Enemy(NameEnemys nameEnemys, int life, int damage) {
        this.NAME_ENEMYS = nameEnemys;
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

    public int getPowerUp() {
        this.setDamage(this.damage * NAME_ENEMYS.getPowerLevel());
        return this.damage;
    }

    @Override
    public String toString() {
        return "------------------" +
                "\nName:" + this.NAME_ENEMYS.getName() +
                "\nLife:" + this.life +
                "\nDamage:" + this.damage +
                "\nPowerLevel:" + this.NAME_ENEMYS.getPowerLevel();
    }
}
