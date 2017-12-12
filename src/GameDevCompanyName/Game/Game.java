package GameDevCompanyName.Game;

import GameDevCompanyName.Game.Graphics.Graphics;
import GameDevCompanyName.Game.Logic.Heroes;
import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {

    private static final boolean DEBUG = false;
    private Graphics graphics;


    @Override
    public void start(Stage primaryStage) throws Exception {

       graphics = new Graphics(Heroes.getHeroes(), DEBUG);

       // graphics=new Graphics();
        primaryStage.setScene(graphics.getScene());
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}