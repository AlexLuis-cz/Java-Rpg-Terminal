package Rpg.util;

import java.util.Random;

public class UtilRandom {
    Random random = new Random();

    //Enemy select attribute.
    public int randomNumber() {
        return random.nextInt(3);
    }

    public int selectLife() {
        return random.nextInt(500, 1000);
    }

    public int selectDamage() {
        return random.nextInt(100, 200);
    }

    public int selectEnemy() {
        int choice;
        choice = random.nextInt(2);
        return choice;
    }
}
