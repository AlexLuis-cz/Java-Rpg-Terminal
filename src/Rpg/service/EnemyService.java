package Rpg.service;

import Rpg.model.Enemy;
import Rpg.util.UtilRandom;

public class EnemyService {
    public Enemy selectEnemy() {
        UtilRandom utilRandom = new UtilRandom();
        Enemy enemySelect = null;

        switch (utilRandom.numeroAleatorio()) {
            case 0:
                enemySelect = new Enemy("Artemis", utilRandom.escolhaVida(), utilRandom.escolhaDano());
                break;
            case 1:
                enemySelect = new Enemy("Alexios", utilRandom.escolhaVida(), utilRandom.escolhaDano());
                break;
            case 2:
                enemySelect = new Enemy("eivor", utilRandom.escolhaVida(), utilRandom.escolhaDano());
                break;
            default:
                break;
        }
        return enemySelect;
    }
}
