package Rpg.app;

import Rpg.engine.GameEngine;

public class Main {
    public static void main(String[] Args) {
        GameEngine gameEngine = new GameEngine();
        gameEngine.startEscolhaJogador();
        gameEngine.starEscolhainimigo();
        gameEngine.BattleStart();
    }
}
