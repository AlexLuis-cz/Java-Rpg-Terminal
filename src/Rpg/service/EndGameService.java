package Rpg.service;

import Rpg.engine.GameEngine;
import Rpg.model.Enemy;
import Rpg.model.Player;

public class EndGameService {
    public static void endGame(Player player, Enemy enemy) {
        GameEngine gameEngine = new GameEngine();
        if (enemy.getLife() <= 0 && player.getLife() <= 0) {
            System.out.println("Draw!");
        } else if (player.getLife() <= 0) {
            System.out.println("You lose");
        } else if (enemy.getLife() <= 0) {
            System.out.println("you win");
            player.setMoney(5);
            gameEngine.menu(player);
        }
    }
}
