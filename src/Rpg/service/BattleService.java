package Rpg.service;

import Rpg.model.Enemy;
import Rpg.model.Player;
import Rpg.util.InputUtil;
import Rpg.util.UtilRandom;

import java.util.*;

public class BattleService {
    public void Battle(Player player, Enemy enemy) {
        UtilRandom utilRandom = new UtilRandom();
        int roundCounter = 1;
        while (player.getLife() > 0 && enemy.getLife() > 0) {
            System.out.println("------------------------");
            System.out.println("Round" + roundCounter);
            System.out.println("Fight");

            int enemyAction = utilRandom.selectEnemy();

            if (enemyAction == 1) {
                enemy.setDefend(true);
            } else {
                enemy.vulnerable();
            }

            byte action = InputUtil.readByte("Attack 1:,Defend 2:");
            switch (action) {
                case 1:
                    if (enemy.getDefend()) {
                        enemy.takeDamage(player.getDamage());
                        System.out.printf("Enemy defended, damage caused:%d\n", player.getDamage() / 2);
                        System.out.printf("Opponent life:%d\n", enemy.getLife());
                    } else {
                        player.vulnerable();
                        enemy.takeDamage(player.getDamage());
                        System.out.printf("Damage caused:%d\n", player.getDamage());
                        System.out.printf("Current life of the opponent:%d\n", enemy.getLife());
                        System.out.println("-----------------------------");
                    }
                    break;
                case 2:
                    player.setDefend(true);
                    System.out.println("You defended");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            if (enemyAction == 0) {
                if (player.getDefend()) {
                    player.takeDamage(enemy.getDamage());
                    System.out.printf("enemy attacked:%d\n", enemy.getDamage() / 2);
                    System.out.printf("Current life:%d\n", player.getLife());
                } else {
                    player.takeDamage(enemy.getDamage());
                    System.out.printf("Damage taken:%d\n", enemy.getDamage());
                    System.out.printf("Current life:%d\n", player.getLife());
                }
            }
            roundCounter++;
            EndGameService.endGame(player, enemy);
        }
    }
}
