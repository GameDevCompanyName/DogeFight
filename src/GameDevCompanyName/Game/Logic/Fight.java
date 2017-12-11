package GameDevCompanyName.Game.Logic;

import GameDevCompanyName.Game.Logic.Utilities.Action;
import GameDevCompanyName.Game.Logic.Utilities.GameState;
import GameDevCompanyName.Game.Logic.Utilities.PlayerInfo;
import GameDevCompanyName.Game.Logic.Utilities.Result;

public class Fight {

    private Character leftCharacter;
    private Character rightCharacter;

    public Fight(Character left, Character right){
        this.leftCharacter = left;
        this.rightCharacter = right;
    }

    public Result action(Action action){

        //Данное поле будет хранить "ERROR" только в случае ошибки,
        //так как в при нормальной работе оно обязательно перезапишется
        String returnText = "---ERROR---";

        switch (action){

        case LEFT_ATACK:
            returnText = leftCharacter.attack(rightCharacter, false);
            break;
        case LEFT_BLOCK:
            returnText = leftCharacter.block();
            break;
        case LEFT_STRONG_ATTACK:
            returnText = leftCharacter.attack(rightCharacter, true);
            break;
        case LEFT_MISTURN:
            returnText = leftCharacter.misturn();
            break;

        case RIGHT_ATACK:
            returnText = leftCharacter.attack(rightCharacter, false);
            break;
        case RIGHT_BLOCK:
            returnText = leftCharacter.block();
            break;
        case RIGHT_STRONG_ATTACK:
            returnText = leftCharacter.attack(rightCharacter, true);
            break;
        case RIGHT_MISTURN:
            returnText = leftCharacter.misturn();
            break;

        }

        if (leftCharacter.isDead() && rightCharacter.isDead())
            return new Result(returnText, GameState.BOTH_DEAD);

        if (leftCharacter.isDead())
            return new Result(returnText, GameState.RIGHT_WINS);

        if (rightCharacter.isDead())
            return new Result(returnText, GameState.LEFT_WINS);

        else return new Result(returnText, GameState.PLAYING);

    }

    public PlayerInfo getLeftInfo(){
        return leftCharacter.getInfo();
    }

    public PlayerInfo getRightInfo(){
        return rightCharacter.getInfo();
    }


}
