package Rpg.service;

import Rpg.model.Enemy;
import Rpg.model.Player;

public class EndGameService {
    public void endGame(Player player, Enemy enemy) {
        if (enemy.getVida() <= 0 && player.getLife() <= 0) {
            System.out.println("Draw!");
        } else if (player.getLife() <= 0) {
            System.out.println("You lose");
        } else if (enemy.getVida() <= 0) {
            System.out.println("you win");
        }
    }
}
