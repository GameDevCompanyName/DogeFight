package GameDevCompanyName.Game.Graphics;

import GameDevCompanyName.Game.Logic.Character;
import GameDevCompanyName.Game.Logic.Fight;
import GameDevCompanyName.Game.Logic.Utilities.Action;
import GameDevCompanyName.Game.Logic.Utilities.PlayerInfo;
import GameDevCompanyName.Game.Logic.Utilities.Result;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.List;


public class Graphics {
    private PlayerInfoBar playerInfoLeft;
    private PlayerInfoBar playerInfoRight;
    private Fight fight;
    private Pane fightMenu;
    private Scene scene;
    boolean step;//Если true-ходит левый


    public Graphics(List<Character> heroes, boolean DEBUG) {
        this.fight = new Fight(heroes.get(0), heroes.get(1));
        fightMenu = new Pane();
        playerInfoLeft = new PlayerInfoBar(fight.getLeftInfo(), 200, 50);
        playerInfoRight = new PlayerInfoBar(fight.getRightInfo(), 400, 50);
        fightMenu.getChildren().add(playerInfoLeft);
        fightMenu.getChildren().add(playerInfoRight);
        fightMenu.getChildren().add(new HeroButton("PlayerOne", 100, 100, 1));
        fightMenu.getChildren().add(new HeroButton("PlayerTwo", 350, 100, 2));
        initLeftButtons();
        initRightButtons();
        scene = new Scene(fightMenu, 600, 600);




    }

    private void initLeftButtons() {
        fightMenu.getChildren().add(new ActionsButton("SA", 100, 500, Action.LEFT_STRONG_ATTACK, fight, this));
        fightMenu.getChildren().add(new ActionsButton("A", 150, 500, Action.LEFT_ATACK, fight, this));
        fightMenu.getChildren().add(new ActionsButton("BL", 200, 500, Action.LEFT_BLOCK, fight, this));
        fightMenu.getChildren().add(new ActionsButton("MI", 250, 500, Action.LEFT_MISTURN, fight, this));

    }

    private void initRightButtons() {
        fightMenu.getChildren().add(new ActionsButton("SA", 350, 500, Action.RIGHT_STRONG_ATTACK, fight, this));
        fightMenu.getChildren().add(new ActionsButton("A", 400, 500, Action.RIGHT_ATACK, fight, this));
        fightMenu.getChildren().add(new ActionsButton("BL", 450, 500, Action.RIGHT_BLOCK, fight, this));
        fightMenu.getChildren().add(new ActionsButton("MI", 500, 500, Action.RIGHT_MISTURN, fight, this));

    }

    public Pane getFightMenu() {
        return fightMenu;
    }

    public Scene getScene() {
        return scene;
    }

    public void update(Result result) {
        System.out.println(result.text);
        playerInfoLeft.update(fight.getLeftInfo());
        playerInfoRight.update(fight.getRightInfo());


    }
}
