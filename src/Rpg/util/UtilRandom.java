package Rpg.util;

import java.util.Random;

public class UtilRandom {
    Random random = new Random();

    public int numeroAleatorio() {
        return random.nextInt(3);
    }

    public int escolhaVida() {
        return random.nextInt(500, 1000);
    }

    public int escolhaDano() {
        return random.nextInt(100, 200);
    }

    public int EscolhaInimigo() {
        int escolha;
        escolha = random.nextInt(2);
        return escolha;
    }
}
