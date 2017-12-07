package GameDevCompanyName.Game;

import GameDevCompanyName.Game.Graphics.Graphics;
import GameDevCompanyName.Game.Logic.Heroes;

public class Game {

    private static final boolean DEBUG = false;

    private Graphics graphics;

    public Game(){
        Heroes heros = Heroes.init();
        graphics = new Graphics(heros.getHeroes(), DEBUG);
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }

    private void play() {
        graphics.start();
    }

}
