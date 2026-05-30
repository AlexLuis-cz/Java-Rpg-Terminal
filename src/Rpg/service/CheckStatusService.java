package Rpg.service;

import Rpg.util.InputUtil;

public class CheckStatusService {

    public static int statusCheckLife() {
        int life = InputUtil.readInt();
        while (life > 1000) {
            System.out.println("Too much life, write a lower value.");
            life = InputUtil.readInt();
            if (life < 1000 && life > 0) {
                break;
            } else {
                System.out.println("Try again");
            }
        }
        return life;
    }

    public static int statusCheckDamage() {
        int damage = InputUtil.readInt();
        while (damage > 200) {
            System.out.print("Too much damage, write a lower value:");
            damage = InputUtil.readInt();
            if (damage < 200 && damage >= 0) {
                break;
            } else {
                System.out.println("Try again");
            }
        }
        return damage;
    }
}
