package GameDevCompanyName.Game.Graphics;


import javafx.scene.control.Button;

public class GameButton extends Button {

    GameButton(String text,int x,int y){
        setText(text);
        setTranslateX(x);
        setTranslateY(y);

    }
}
