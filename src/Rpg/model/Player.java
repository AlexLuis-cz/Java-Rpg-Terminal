package Rpg.model;

public class Player extends Character {

    public Player(String name, int life, int damage) {
        this.nome = name;
        this.vida = life;
        this.dano = damage;
    }

    public Player() {
    }

    public void takeDamage(int danoTomado) {
        this.vida -= danoTomado;
    }


    public int getLife() {
        return vida;
    }

    public int getDamage() {
        return this.dano;
    }

    public void Imp() {
        System.out.println("nome:" + this.nome);
        System.out.println("vida:" + this.vida);
        System.out.println("dano:" + this.dano);
    }
}
