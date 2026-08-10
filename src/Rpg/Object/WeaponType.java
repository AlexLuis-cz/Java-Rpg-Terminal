package Rpg.Object;

public enum WeaponType {
    KNIFE(10, 1, 10),
    SWORD(30, 2, 30),
    axe(60, 3, 60);

    private final int baseDamage;
    private final int nivel;
    private final int valor;


    WeaponType(int baseDamage, int nivel, int valor) {
        this.baseDamage = baseDamage;
        this.nivel = nivel;
        this.valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public int getBaseDamage() {
        return this.baseDamage;
    }

    public int getNivel() {
        return this.nivel;
    }
}
