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
                enemy.Defendendo(acaoInimiga, player.getDamage());
            }

            byte acao = sc.nextByte();
            switch (acao) {
                case 1:
                    if (enemy.Defendendo(acaoInimiga)) {
                        if (enemy.getVida() <= 0) {
                            System.out.println("inimigo defedeu");
                            System.out.println("vida oponente:" + 0 + " vida");
                        } else {
                            System.out.println("oponente ficou com:" + enemy.getVida() + " vida");
                        }
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
                    player.Defendendo(acao, enemy.getdano());
                    System.out.println("voce defendeu");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }
            if (acaoInimiga == 0) {
                if (player.Defendendo(acaoInimiga, enemy.getdano())) {
                    if (player.getLife() <= 0) {
                        System.out.println("voce defendeu:" + 0 + " vida");
                    } else {

                        System.out.println("voce defendeu:" + player.getLife());
                        System.out.println("inimigo atacou:" + enemy.getdano());
                    }
                } else {
                    player.takeDamage(enemy.getdano());
                    System.out.println("dano tomado:" + enemy.getdano());

                    if (player.getLife() <= 0) {
                        System.out.println("vida atual:" + 0 + " vida");
                    } else {
                        System.out.println("vida atual:" + player.getLife());
                    }
                }
            }
            contadorRodada++;
            endGameService.endGame(player, enemy);
        }
    }
}
