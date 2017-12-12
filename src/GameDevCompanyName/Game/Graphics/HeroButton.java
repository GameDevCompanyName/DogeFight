package GameDevCompanyName.Game.Graphics;

import javafx.scene.control.Button;


public class HeroButton extends Button {


    HeroButton(String name, int x, int y, int numberInList) {
        setText(name);
        setTranslateX(x);
        setTranslateY(y);
        setPrefWidth(150);
        setPrefHeight(150);


    }


}
