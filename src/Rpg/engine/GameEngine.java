package Rpg.engine;

import Rpg.model.Enemy;
import Rpg.model.Player;
import Rpg.service.BattleService;
import Rpg.service.EnemyService;
import Rpg.service.PlayerService;

public class GameEngine {
    PlayerService playerService = new PlayerService();
    EnemyService enemyService = new EnemyService();
    BattleService battleStart = new BattleService();


    public void playerSelect() {
        Player playerSelect = playerService.selectPlayer();
        Enemy enemySelect = enemyService.selectEnemy();

        //Start battle
        battleStart.Battle(playerSelect, enemySelect);
    }
}

