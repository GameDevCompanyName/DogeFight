package GameDevCompanyName.Game.Graphics;

import GameDevCompanyName.Game.Logic.Action;
import GameDevCompanyName.Game.Logic.Result;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Graphics {
    private Pane fightMenu;
    private Scene scene;



    public Graphics() {
        fightMenu = new Pane();
        fightMenu.getChildren().add(new HeroButton("PlayerOne", 100, 100,1));
        fightMenu.getChildren().add(new HeroButton("PlayerTwo", 350, 100,2));
        fightMenu.getChildren().add(new ActionsButton("SA", 100, 500, Action.LEFT_STRONG_ATTACK));
        fightMenu.getChildren().add(new ActionsButton("A", 150, 500, Action.LEFT_ATACK));
        fightMenu.getChildren().add(new ActionsButton("BL", 200, 500, Action.LEFT_BLOCK));
        fightMenu.getChildren().add(new ActionsButton("MI", 250, 500, Action.LEFT_MISTURN));
        fightMenu.getChildren().add(new ActionsButton("SA", 350, 500, Action.RIGHT_STRONG_ATTACK));
        fightMenu.getChildren().add(new ActionsButton("A",400,500,Action.RIGHT_ATACK));
        fightMenu.getChildren().add(new ActionsButton("BL",450,500,Action.RIGHT_BLOCK));
        fightMenu.getChildren().add(new ActionsButton("MI",500,500,Action.RIGHT_MISTURN));
        scene=new Scene(fightMenu,600,600);


        //Result result = fight.action(Action.LEFT_ATACK);

    }

    public Pane getFightMenu() {
        return fightMenu;
    }

    public Scene getScene() {
        return scene;
    }
}
