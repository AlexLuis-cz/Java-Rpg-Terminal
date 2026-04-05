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
        int contadorRodada = 1;
        while (player.getLife() > 0 && enemy.getVida() > 0) {
            System.out.println("------------------------");
            System.out.println("Rodada" + contadorRodada);
            System.out.println("Fight");
            System.out.println("Attack 1:, Defend 2:");
            int acaoInimiga = utilRandom.EscolhaInimigo();

            if (acaoInimiga == 1) {
                System.out.println("inimigo defedeu");
                enemy.Defendendo(acaoInimiga, player.getDamage());
            }

            byte acao = sc.nextByte();
            switch (acao) {
                case 1:
                    if (enemy.Defendendo(acaoInimiga)) {
                        System.out.println("vida oponente:" + enemy.getVida());
                        System.out.println("vida atual:" + player.getLife());
                    } else {
                        enemy.takeDamage(player.getDamage());
                        System.out.println("dano causado:" + player.getDamage());

                        if (enemy.getVida() < 0) {
                            System.out.println("vida atual do oponente:" + 0);
                        } else {
                            System.out.println("vida atual do oponente:" + enemy.getVida());
                        }
                    }
                    break;
                case 2:
                    player.Defendendo(acao);
                    System.out.println("voce defendeu");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
            if (acaoInimiga == 0) {
                if (player.Defendendo(acao)) {
                    System.out.println("inimigo atacou:" + enemy.getdano());
                    System.out.println("vida atual:" + player.getLife());
                } else {
                    player.takeDamage(enemy.getdano());
                    if (player.getLife() < 0) {
                        System.out.println("voce ficou com:" + 0 + " vida");
                    } else {
                        System.out.println("voce ficou com:" + player.getLife() + " vida");
                    }
                }
            }
            contadorRodada++;
            endGameService.endGame(player, enemy);
        }
    }
}
