package GameDevCompanyName.Game.Graphics;

import GameDevCompanyName.Game.Logic.Fight;
import GameDevCompanyName.Game.Logic.Utilities.Action;
import javafx.scene.control.Button;

public class ActionsButton extends Button {
    private Action action;

    ActionsButton(String text, int x, int y, Action action, Fight fight,Graphics graphics) {
        setText(text);
        setWidth(50);
        setHeight(50);
        setTranslateX(x);
        setTranslateY(y);
        this.action = action;
        setOnMouseClicked(event -> {
            graphics.update(fight.action(action));


        });
    }

}
