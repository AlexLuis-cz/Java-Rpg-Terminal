package Rpg.util;


import Rpg.model.Enemy;
import Rpg.model.Player;

public class ImpUtil {
    //Print characters information.
    public static void impPlayer(Player player) {
        System.out.println("-------------");
        System.out.println("Name:" + player.getName());
        System.out.println("Life:" + player.getLife());
        System.out.println("Damage:" + player.getDamage());
    }

    public static void impEnemy(Enemy enemy) {
        System.out.println("-------------");
        System.out.println("Name:" + enemy.getName());
        System.out.println("Life:" + enemy.getLife());
        System.out.println("Damage:" + enemy.getDamage());
    }
}
