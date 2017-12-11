package GameDevCompanyName.Game.Graphics;

import GameDevCompanyName.Game.Logic.Utilities.PlayerInfo;
import javafx.scene.control.Label;

public class PlayerInfoBar extends Label {
    int maxHP;
    int curHP;

    PlayerInfoBar(PlayerInfo playerInfo, int x, int y) {
        maxHP = playerInfo.maxHP;
        curHP = playerInfo.curHP;
        setText(curHP + "/" + maxHP);
        setTranslateX(x);
        setTranslateY(y);

    }

    public void update(PlayerInfo playerInfo) {
        maxHP = playerInfo.maxHP;
        curHP = playerInfo.curHP;
        setText(curHP + "/" + maxHP);
    }
}
