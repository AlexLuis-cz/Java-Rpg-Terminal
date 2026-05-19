package Rpg.service;
import java.util.*;

public class CheckStatus {
    Scanner sc = new Scanner(System.in);

    public int statusCheckLife() {
        int life = sc.nextInt();
        while (life > 1000) {
            System.out.println("Too much life, write a lower value.");
            life = sc.nextInt();
            if (life < 1000 && life > 0) {
                break;
            } else {
                System.out.println("Try again");
            }
        }
        return life;
    }

    public int statusCheckDamage() {
        int damage = sc.nextInt();
        while (damage > 200) {
            System.out.print("Too much damage, write a lower value:");
            damage = sc.nextInt();
            if (damage < 200 && damage >= 0) {
                break;
            } else {
                System.out.println("Try again");
            }
        }
        return damage;
    }
}
