package Rpg.model;

public class Enemy extends Character {

    public Enemy(String name, int life, int damage) {
        this.nome = name;
        this.vida = life;
        this.dano = damage;
    }

    public int getVida() {
        return this.vida;
    }

    public int getdano() {
        return this.dano;
    }

    public void takeDamage(int danoTomado) {
        this.vida -= danoTomado;
    }

    public void Imp() {
        System.out.println(this.nome);
        System.out.println(this.vida);
        System.out.println(this.dano);
    }
}
