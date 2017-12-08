package GameDevCompanyName.Game.Graphics;


import GameDevCompanyName.Game.Logic.Action;
import javafx.scene.control.Button;

public class ActionsButton extends Button {
    private Action action;

    ActionsButton(String text, int x, int y, Action action) {
        setText(text);
        setWidth(50);
        setHeight(50);
        setTranslateX(x);
        setTranslateY(y);
        this.action = action;
    }

    public Action getAction() {
        return action;
    }
}
