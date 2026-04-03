package Rpg.service;

import Rpg.model.Player;

import java.util.Scanner;

public class PlayerService {
    public Player selectPlayer() {
        Player playerSelect;
        VerificacaoStatus verificacaoStatus = new VerificacaoStatus();
        Scanner sc = new Scanner(System.in);

        System.out.println("crie seu jogador.");
        System.out.print("crie Nome:");
        String nome = sc.nextLine();
        System.out.println("vida entre 1 a 1000");
        System.out.print("adicione sua vida:");
        int vida = verificacaoStatus.statusVida();

        System.out.println("dano entre 1 a 200");
        System.out.print("dano:");
        int dano = verificacaoStatus.statusDano();

        playerSelect = new Player(nome, vida, dano);
        return playerSelect;
    }
}
