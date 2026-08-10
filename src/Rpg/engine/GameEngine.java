package Rpg.engine;

import Rpg.model.Enemy;
import Rpg.model.Player;
import Rpg.service.BattleService;
import Rpg.service.EnemyService;
import Rpg.service.MarketService;
import Rpg.service.PlayerService;
import Rpg.util.InputUtil;

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

    public void menu(Player player) {
        System.out.println("------places to explore---------\n" +
                "1: Forest" +
                "2: Market");
        byte selectOption = InputUtil.readByte("Option:");
        switch (selectOption) {
            case 1:
                battleStart.Battle(player, enemyService.selectEnemy());
                break;
            case 2:
                MarketService.listaDeArmas();
                break;
        }
    }
}

