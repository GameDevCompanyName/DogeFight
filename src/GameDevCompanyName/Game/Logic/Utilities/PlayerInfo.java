package GameDevCompanyName.Game.Logic.Utilities;

import GameDevCompanyName.Game.Logic.CharacterState;

public class PlayerInfo {

    public int maxHP;
    public int curHP;
    public int maxAP;
    public int curAP;
    public CharacterState state;

    public PlayerInfo(int maxHP,
                    int curHP,
                    int maxAP,
                    int curAP,
                    CharacterState state){

        this.maxHP = maxHP;
        this.curHP = curHP;
        this.maxAP = maxAP;
        this.curAP = curAP;
        this.state = state;

    }

}