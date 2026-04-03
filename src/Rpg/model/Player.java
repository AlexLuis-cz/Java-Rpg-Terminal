package Rpg.model;

public class Player {
    private String name;
    private int life;
    private int damage;

    public Player(String name, int life, int damage) {
        this.name = name;
        this.life = life;
        this.damage = damage;
    }

    public Player() {
    }
    public void takeDamage(int danoTomado){
        this.life -= danoTomado;
    }


    public int getLife() {
        return life;
    }

    public int getDamage(){
        return this.damage;
    }

    public void Imp() {
        System.out.println("nome:" + this.name);
        System.out.println("vida:" + this.life);
        System.out.println("dano:" + this.damage);
    }
}
