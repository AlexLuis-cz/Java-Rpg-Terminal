package Rpg.service;

import Rpg.model.Player;

import java.util.Scanner;

public class PlayerService {
    public Player selectPlayer() {
        Player playerSelect;
        CheckStatus statusCheck = new CheckStatus();
        Scanner sc = new Scanner(System.in);

        System.out.println("Create your player.");
        System.out.print("Create your Name:");
        String name = sc.nextLine();
        System.out.println("Lifespan less than 1000");
        System.out.print("Add your life:");
        int life = statusCheck.statusCheckLife();

        System.out.println("Damage less than 200");
        System.out.print("Damage:");
        int damage = statusCheck.statusCheckDamage();

        playerSelect = new Player(name,life,damage);
        playerSelect.Imp();
        return playerSelect;
    }
}
