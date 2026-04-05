package Rpg.model;

public class Enemy extends Character {

    public Enemy(String name, int life, int damage) {
        this.nome = name;
        this.vida = life;
        this.dano = damage;
    }

    public boolean Defendendo(int acao) {
        if (acao == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean Defendendo(int acao, int danoTomado) {
        if (acao == 1) {
            this.vida -= danoTomado / 2;
            return true;
        } else {
            return false;
        }
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
