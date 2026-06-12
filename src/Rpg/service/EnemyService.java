package Rpg.service;

import Rpg.model.Enemy;
import Rpg.util.UtilRandom;

public class EnemyService {
    public Enemy selectEnemy() {
        UtilRandom utilRandom = new UtilRandom();
        Enemy enemySelect = null;

        switch (utilRandom.randomNumber()) {
            case 0:
                enemySelect = new Enemy("Artemis", utilRandom.selectLife(), utilRandom.selectDamage());
                System.out.println(enemySelect);
                break;
            case 1:
                enemySelect = new Enemy("Alexios", utilRandom.selectLife(), utilRandom.selectDamage());
                System.out.println(enemySelect);
                break;
            case 2:
                enemySelect = new Enemy("Eivor", utilRandom.selectLife(), utilRandom.selectDamage());
                System.out.println(enemySelect);
                break;
            default:
                break;
        }
        return enemySelect;
    }
}
