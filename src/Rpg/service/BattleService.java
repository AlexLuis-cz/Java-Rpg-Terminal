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

        while (player.getLife() > 0 && enemy.getVida() > 0) {
            boolean inimigoDefende = false;
            boolean jogadorDefende = false;
            int contadorRodada = 0;
            contadorRodada++;
            System.out.println("------------------------");
            System.out.println("Rodada" + contadorRodada);
            System.out.println("Fight");
            System.out.println("Attack 1:, Defend 2:");
            int acaoInimiga = utilRandom.EscolhaInimigo();

            if (acaoInimiga == 1) {
                inimigoDefende = true;
            }

            byte acao = sc.nextByte();
            switch (acao) {
                case 1:
                    if (inimigoDefende) {
                        System.out.println("inimigo defendeu");
                        System.out.println("vida oponente:" + enemy.getVida());
                    } else {
                        enemy.takeDamage(player.getDamage());
                        System.out.println("dano causado:" + player.getDamage());

                        if (enemy.getVida() < 0) {
                            System.out.println("vida atual inimigo:" + 0);
                        } else {
                            System.out.println("vida atual inimigo:" + enemy.getVida());
                        }
                    }
                    break;
                case 2:
                    jogadorDefende = true;
                    System.out.println("voce defendeu sua vida atual:" + player.getLife());
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
            if (acaoInimiga == 0) {
                if (jogadorDefende) {
                    System.out.println("inimigo tentou causar:" + enemy.getdano());
                } else {
                    player.takeDamage(enemy.getdano());
                    System.out.println("voce ficou com:" + player.getLife() + " vida");
                }
            }
            endGameService.endGame(player, enemy);
        }
    }
}
