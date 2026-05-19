package Rpg.service;

import Rpg.model.Enemy;
import Rpg.model.Player;
import Rpg.util.UtilRandom;

import java.util.*;

public class BattleService {
    public void Battle(Player player, Enemy enemy) {
        Scanner sc = new Scanner(System.in);
        UtilRandom utilRandom = new UtilRandom();
        EndGameService endGameService = new EndGameService();
        int roundCounter = 1;
        while (player.getLife() > 0 && enemy.getLife() > 0) {
            System.out.println("------------------------");
            System.out.println("Round" + roundCounter);
            System.out.println("Fight");
            System.out.println("Attack 1:,Defend 2:");
            int enemyAction = utilRandom.selectEnemy();

            if (enemyAction == 1) {
                enemy.defending(enemyAction, player.getDamage());
            }

            byte action = sc.nextByte();
            switch (action) {
                case 1:
                    if (enemy.defending(enemyAction,player.getDamage())) {
                        if (enemy.getLife() < 0) {
                            System.out.printf("Enemy defended, damage caused:%d\n",enemy.getLife());
                            System.out.printf("Opponent life:%d life\n",0);
                        } else {
                            System.out.printf("Opponent was left with:%d life\n",enemy.getLife());
                        }
                        System.out.printf("Current life:%d\n",player.getLife());
                    } else {
                        enemy.takeDamage(player.getDamage());
                        System.out.printf("Damage caused:%d\n",player.getDamage());

                        if (enemy.getLife() < 0) {
                            System.out.println("Opponent's current life:"+0);
                        } else {
                            System.out.printf("Current life of the opponent:%d\n",enemy.getLife());
                        }
                    }
                    break;
                case 2:
                    player.defending(action, enemy.getDamage());
                    System.out.println("You defended");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            if (enemyAction == 0) {
                if (player.defending(enemyAction, enemy.getDamage())) {
                    if (player.getLife() <= 0) {
                        System.out.printf("You defended:%d life\n.",0);
                    } else {
                        System.out.printf("You defended:%d\n",player.getLife());
                        System.out.printf("enemy attacked:%d\n",enemy.getDamage());
                    }
                } else {
                    player.takeDamage(enemy.getDamage());
                    System.out.printf("Damage taken:%d\n",enemy.getDamage());

                    if (player.getLife() <= 0) {
                        System.out.printf("Current life:%d life\n",0);
                    } else {
                        System.out.printf("Current life:%d",player.getLife());
                    }
                }
            }
            roundCounter++;
            endGameService.endGame(player, enemy);
        }
    }
}
