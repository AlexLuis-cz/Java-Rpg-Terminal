package Rpg.util;

import java.util.Random;

public class UtilRandom {
    Random random = new Random();

    public int numeroAleatorio() {
        int num = random.nextInt(3);
        return num;
    }

    public int escolhaVida() {
        int vidaEscolhida = random.nextInt(500, 1000);
        return vidaEscolhida;
    }

    public int escolhaDano() {
        int danoEscolhido = random.nextInt(100, 200);
        return danoEscolhido;
    }

    public int EscolhaInimigo() {
        int escolha = random.nextInt(2);
        return escolha;
    }
}
