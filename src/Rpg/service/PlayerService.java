package Rpg.service;

import Rpg.model.Player;
import Rpg.util.ImpUtil;
import Rpg.util.InputUtil;

public class PlayerService {
    public Player selectPlayer() {
        Player playerSelect;
        //Creat Player.
        String name = InputUtil.readString("Create your player.\nCreate your Name:");
        System.out.println("Lifespan less than 1000");
        System.out.print("Add your life:");
        int life = CheckStatusService.statusCheckLife();

        System.out.println("Damage less than 200");
        System.out.print("Damage:");
        int damage = CheckStatusService.statusCheckDamage();

        playerSelect = new Player(name, life, damage);
        ImpUtil.impPlayer(playerSelect);
        return playerSelect;
    }
}
