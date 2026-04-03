package Rpg.service;

import Rpg.model.Player;

import java.util.*;

public class VerificacaoStatus {
    Scanner sc = new Scanner(System.in);
    public int statusVida() {
        int vida = sc.nextInt();
        while (vida > 1000) {
            System.out.println("muita vida escreva um valor mais baixo");
            vida = sc.nextInt();
            if (vida < 1000 && vida > 0) {
            } else {
                System.out.println("tente novamente");
            }
        }
        return vida;
    }

    public int statusDano() {
        int dano = sc.nextInt();
        while (dano > 200) {
            System.out.println("muito dano escreva um valor mais baixo");
            dano = sc.nextInt();
            if (dano < 200 && dano >= 0) {
                break;
            } else {
                System.out.println("tente novamente");
            }
        }
        return dano;
    }
}
