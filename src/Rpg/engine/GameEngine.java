package Rpg.engine;

import Rpg.model.Enemy;
import Rpg.model.Player;
import Rpg.service.BattleService;
import Rpg.service.EnemyService;
import Rpg.service.PlayerService;

public class GameEngine {
    PlayerService playerService = new PlayerService();
    EnemyService enemyService = new EnemyService();

    Player playerEscolhido = playerService.selectPlayer();
    Enemy enemyEscolhido = enemyService.selectEnemy();

    public void startEscolhaJogador() {
        playerEscolhido.Imp();
    }

    public void starEscolhainimigo() {
        System.out.println("-----------------");
        enemyEscolhido.Imp();
    }

    public void BattleStart() {
        BattleService battleStart = new BattleService();
        battleStart.Battle(playerEscolhido, enemyEscolhido);
    }
}

