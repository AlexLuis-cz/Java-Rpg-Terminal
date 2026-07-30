package Rpg.service;

import Rpg.model.Enemy;
import Rpg.model.NameEnemys;
import Rpg.util.UtilRandom;

public class EnemyService {
    public Enemy selectEnemy() {
        UtilRandom utilRandom = new UtilRandom();
        Enemy enemySelect = null;

        switch (utilRandom.randomNumber()) {
            case 0:
                enemySelect = new Enemy(NameEnemys.ARTEMIS, utilRandom.selectLife(), utilRandom.selectDamage());
                System.out.println(enemySelect);
                break;
            case 1:
                enemySelect = new Enemy(NameEnemys.ALEXIOS, utilRandom.selectLife(), utilRandom.selectDamage());
                System.out.println(enemySelect);
                break;
            case 2:
                enemySelect = new Enemy(NameEnemys.EIVOR, utilRandom.selectLife(), utilRandom.selectDamage());
                System.out.println(enemySelect);
                break;
            default:
                break;
        }
        return enemySelect;
    }
}
