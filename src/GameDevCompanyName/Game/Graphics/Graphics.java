package GameDevCompanyName.Game.Graphics;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

import javax.swing.text.html.ImageView;


public class Graphics {
    public Pane fightMenu;


    Graphics() {
        fightMenu=new Pane();
        Button heroOne=new Button("",new Label());
        Button heroTwo=new Button("");
        Button strongAttack = new Button("SA");
        Button defaultAttack = new Button("DA");
        Button block = new Button();
        Button missStep = new Button();


    }


}
