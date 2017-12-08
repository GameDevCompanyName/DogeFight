package GameDevCompanyName.Game.Logic;

public class Fight {

    private Character leftCharacter;
    private Character rightCharacter;

    public Fight(Character left, Character right){
        this.leftCharacter = left;
        this.rightCharacter = right;
    }

    public Result action(Action action){
        switch (action){

        case LEFT_ATACK:
            leftCharacter.attack(rightCharacter, false);
            break;
        case LEFT_BLOCK:
            leftCharacter.block();
            break;
        case LEFT_STRONG_ATTACK:
            leftCharacter.attack(rightCharacter, true);
            break;
        case LEFT_MISTURN:
            leftCharacter.misturn();
            break;

        case RIGHT_ATACK:
            leftCharacter.attack(rightCharacter, false);
            break;
        case RIGHT_BLOCK:
            leftCharacter.block();
            break;
        case RIGHT_STRONG_ATTACK:
            leftCharacter.attack(rightCharacter, true);
            break;
        case RIGHT_MISTURN:
            leftCharacter.misturn();
            break;

        }
    }



}
