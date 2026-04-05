package Rpg.model;

public class Player extends Character {

    public Player(String name, int life, int damage) {
        this.nome = name;
        this.vida = life;
        this.dano = damage;
    }

    public Player() {
    }

    public boolean Defendendo(int acao) {
        if (acao == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Defendendo(int acao, int danoTomado) {
        if (acao == 0) {
            this.vida -= danoTomado / 2;
            return true;
        } else {
            return false;
        }
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
