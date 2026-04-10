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


    public void EscolhaDosPersonagens() {
        Player playerEscolhido = playerService.selectPlayer();
        Enemy enemyEscolhido = enemyService.selectEnemy();

        //inicio da batalha
        battleStart.Battle(playerEscolhido, enemyEscolhido);
    }
}

